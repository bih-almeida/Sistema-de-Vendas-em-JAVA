package DAO;

import model.Modelfornecedor;
import conexoes.ConexaoMySql;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
/**
*
* @author Gabriela Silva de Almeida
*/
public class DAOfornecedor extends ConexaoMySql {

    /**
    * grava fornecedor
    * @param pModelfornecedor
    * @return int
    */
    
   
     //gerear relatorio de cliente
     public boolean gerarRelatorioFornecedor(){
        try {
            this.conectar();
            this.executarSQL(
                "SELECT"
                    + " tbl_fornecedor.id_fornecedor AS tbl_fornecedor_id_fornecedor,"
                    + " tbl_fornecedor.nome_fornecedor AS tbl_fornecedor_nome_fornecedor,"
                    + " tbl_fornecedor.telefone_fornecedor AS tbl_fornecedor_telefone_fornecedor,"
                    + " tbl_fornecedor.endereco_fornecedor AS tbl_fornecedor_endereco_fornecedor,"
                    + " tbl_fornecedor.responsavel_fornecedor AS tbl_fornecedor_responsavel_fornecedor,"
                    + " tbl_fornecedor.ramo_fornecedor AS tbl_fornecedor_ramo_fornecedor,"
                    + " tbl_fornecedor.cidade_fornecedor AS tbl_fornecedor_cidade_fornecedor,"
                    + " tbl_fornecedor.estado_fornecedor AS tbl_fornecedor_estado_fornecedor"
                 + " FROM"
                     + " tbl_fornecedor"
                 
                   
            );
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            //caminho do meu relatorio
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/Fornecedor.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);
            //até aqui manda gerar gelatorio
            //converter o relatorio para PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Vendas2/rel/relFornecedor.pdf");
            //instancia o file e manda abrir
            File file = new File("C:/Vendas2/rel/relFornecedor.pdf");
            
            try{
                Desktop.getDesktop().open(file);
            }catch (Exception e){
                JOptionPane.showConfirmDialog(null, e);
            }
            
            file.deleteOnExit();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
     }
     
     
    public int salvarfornecedorDAO(Modelfornecedor pModelfornecedor){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_fornecedor ("
                  //  + "id_fornecedor,"
                    + "nome_fornecedor,"
                    + "telefone_fornecedor,"
                    + "endereco_fornecedor,"
                    + "responsavel_fornecedor,"
                    + "ramo_fornecedor,"
                    + "cidade_fornecedor,"
                    + "estado_fornecedor,"
                    + "bairro_fornecedor,"
                    + "cnpj,"
                    + "razao"
                + ") VALUES ("
                 //   + "'" + pModelfornecedor.getId_fornecedor() + "',"
                    + "'" + pModelfornecedor.getNome_fornecedor() + "',"
                    + "'" + pModelfornecedor.getTelefone_fornecedor() + "',"
                    + "'" + pModelfornecedor.getEndereco_fornecedor() + "',"
                    + "'" + pModelfornecedor.getResponsavel_fornecedor() + "',"
                    + "'" + pModelfornecedor.getRamo_fornecedor() + "',"
                    + "'" + pModelfornecedor.getCidade_fornecedor() + "',"
                    + "'" + pModelfornecedor.getEstado_fornecedor() + "',"
                    + "'" + pModelfornecedor.getBairro_fornecedor() + "',"  
                    + "'" + pModelfornecedor.getCnpj()+ "'," 
                    + "'" + pModelfornecedor.getRazao()+ "'"         
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera fornecedor
    * @param pId_fornecedor
    * @return Modelfornecedor
    */
    public Modelfornecedor getfornecedorDAO(int pId_fornecedor){
        Modelfornecedor modelfornecedor = new Modelfornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_fornecedor,"
                    + "nome_fornecedor,"
                    + "telefone_fornecedor,"
                    + "endereco_fornecedor,"
                    + "responsavel_fornecedor,"
                    + "ramo_fornecedor,"
                    + "cidade_fornecedor,"
                    + "estado_fornecedor,"
                         + "bairro_fornecedor,"
                        + "cnpj,"
                    + "razao"
                 + " FROM"
                     + " tbl_fornecedor"
                 + " WHERE"
                     + " id_fornecedor = '" + pId_fornecedor + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelfornecedor.setId_fornecedor(this.getResultSet().getInt(1));
                modelfornecedor.setNome_fornecedor(this.getResultSet().getString(2));
                modelfornecedor.setTelefone_fornecedor(this.getResultSet().getString(3));
                modelfornecedor.setEndereco_fornecedor(this.getResultSet().getString(4));
                modelfornecedor.setResponsavel_fornecedor(this.getResultSet().getString(5));
                modelfornecedor.setRamo_fornecedor(this.getResultSet().getString(6));
                modelfornecedor.setCidade_fornecedor(this.getResultSet().getString(7));
                modelfornecedor.setEstado_fornecedor(this.getResultSet().getString(8));
                modelfornecedor.setBairro_fornecedor(this.getResultSet().getString(9));
                modelfornecedor.setCnpj(this.getResultSet().getString(10));
                modelfornecedor.setRazao(this.getResultSet().getString(11));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelfornecedor;
    }

    /**
    * recupera uma lista de fornecedor
        * @return ArrayList
    */
    public ArrayList<Modelfornecedor> getListafornecedorDAO(){
        ArrayList<Modelfornecedor> listamodelfornecedor = new ArrayList();
        Modelfornecedor modelfornecedor = new Modelfornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_fornecedor,"
                    + "nome_fornecedor,"
                    + "telefone_fornecedor,"
                    + "endereco_fornecedor,"
                    + "responsavel_fornecedor,"
                    + "ramo_fornecedor,"
                    + "cidade_fornecedor,"
                    + "estado_fornecedor,"
                    + "bairro_fornecedor," 
                    + "cnpj,"
                    + "razao"
                 + " FROM"
                     + " tbl_fornecedor"
                + ";"
            );

            while(this.getResultSet().next()){
                modelfornecedor = new Modelfornecedor();
                modelfornecedor.setId_fornecedor(this.getResultSet().getInt(1));
                modelfornecedor.setNome_fornecedor(this.getResultSet().getString(2));
                modelfornecedor.setTelefone_fornecedor(this.getResultSet().getString(3));
                modelfornecedor.setEndereco_fornecedor(this.getResultSet().getString(4));
                modelfornecedor.setResponsavel_fornecedor(this.getResultSet().getString(5));
                modelfornecedor.setRamo_fornecedor(this.getResultSet().getString(6));
                modelfornecedor.setCidade_fornecedor(this.getResultSet().getString(7));
                modelfornecedor.setEstado_fornecedor(this.getResultSet().getString(8));
                modelfornecedor.setBairro_fornecedor(this.getResultSet().getString(9));
                modelfornecedor.setCnpj(this.getResultSet().getString(10));
                modelfornecedor.setRazao(this.getResultSet().getString(11));
                listamodelfornecedor.add(modelfornecedor);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelfornecedor;
    }

    /**
    * atualiza fornecedor
    * @param pModelfornecedor
    * @return boolean
    */
    public boolean atualizarfornecedorDAO(Modelfornecedor pModelfornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_fornecedor SET "
                    + "id_fornecedor = '" + pModelfornecedor.getId_fornecedor() + "',"
                    + "nome_fornecedor = '" + pModelfornecedor.getNome_fornecedor() + "',"
                    + "telefone_fornecedor = '" + pModelfornecedor.getTelefone_fornecedor() + "',"
                    + "endereco_fornecedor = '" + pModelfornecedor.getEndereco_fornecedor() + "',"
                    + "responsavel_fornecedor = '" + pModelfornecedor.getResponsavel_fornecedor() + "',"
                    + "ramo_fornecedor = '" + pModelfornecedor.getRamo_fornecedor() + "',"
                    + "cidade_fornecedor = '" + pModelfornecedor.getCidade_fornecedor() + "',"
                    + "estado_fornecedor = '" + pModelfornecedor.getEstado_fornecedor() + "',"
                             + "bairro_fornecedor = '" + pModelfornecedor.getBairro_fornecedor() + "',"
                                      + "cnpj = '" + pModelfornecedor.getCnpj()+ "'," 
                                               + "razao = '" + pModelfornecedor.getRazao()+ "'" 
                + " WHERE "
                    + "id_fornecedor = '" + pModelfornecedor.getId_fornecedor() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui fornecedor
    * @param pId_fornecedor
    * @return boolean
    */
    public boolean excluirfornecedorDAO(int pId_fornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_fornecedor "
                + " WHERE "
                    + "id_fornecedor = '" + pId_fornecedor + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
     public Modelfornecedor getfornecedorDAO(String pNome_fornecedor){
        Modelfornecedor modelfornecedor = new Modelfornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_fornecedor,"
                    + "nome_fornecedor,"
                    + "telefone_fornecedor,"
                    + "endereco_fornecedor,"
                    + "responsavel_fornecedor,"
                    + "ramo_fornecedor,"
                    + "cidade_fornecedor,"
                    + "estado_fornecedor,"
                         + "bairro_fornecedor,"
                        + "cnpj,"
                        + "razao"
                 + " FROM"
                     + " tbl_fornecedor"
                 + " WHERE"
                     + " nome_fornecedor = '" + pNome_fornecedor + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelfornecedor.setId_fornecedor(this.getResultSet().getInt(1));
                modelfornecedor.setNome_fornecedor(this.getResultSet().getString(2));
                modelfornecedor.setTelefone_fornecedor(this.getResultSet().getString(3));
                modelfornecedor.setEndereco_fornecedor(this.getResultSet().getString(4));
                modelfornecedor.setResponsavel_fornecedor(this.getResultSet().getString(5));
                modelfornecedor.setRamo_fornecedor(this.getResultSet().getString(6));
                modelfornecedor.setCidade_fornecedor(this.getResultSet().getString(7));
                modelfornecedor.setEstado_fornecedor(this.getResultSet().getString(8));
                modelfornecedor.setBairro_fornecedor(this.getResultSet().getString(9));
                modelfornecedor.setCnpj(this.getResultSet().getString(10));
                modelfornecedor.setRazao(this.getResultSet().getString(11));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelfornecedor;
    }
}