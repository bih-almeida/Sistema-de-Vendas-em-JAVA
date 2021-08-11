package DAO;

import model.ModelCliente;
import conexoes.ConexaoMySql;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import model.ModelCaixa;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
/**
*
* @author Gabriela Silva de Almeida
*/
public class DAOCliente extends ConexaoMySql {

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
     public ModelCliente UltimaMovimentacaoClienteDAO(ModelCliente pModelCaixa) {
        
       ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT valor_acumulado from tbl_cliente where pk_id_cliente = (select max(pk_id_cliente) from tbl_cliente)"
                      
                           + ";"
            );
            while(this.getResultSet().next()){
              //  modelCliente.setCliQuantidade(this.getResultSet().getString(1));
                modelCliente.setCliAcumulado(this.getResultSet().getFloat(1));
           
            }
            }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }
     public ModelCliente UltimaMovimentacaoQuantidadeClienteDAO(ModelCliente pModelCaixa) {
        
       ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT quantidade_acumulado from tbl_cliente where pk_id_cliente = (select max(pk_id_cliente) from tbl_cliente)"
                      
                           + ";"
            );
            while(this.getResultSet().next()){
                modelCliente.setCliQuantidade(this.getResultSet().getString(1));
               // modelCliente.setCliAcumulado(this.getResultSet().getFloat(2));
           
            }
            }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }
     
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_cliente ("
                 //   + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone,"
                    + "cpf,"
                    + "nascimento,"
                    + "quantidade_acumulado,"
                    + "valor_acumulado"
                + ") VALUES ("
                 //   + "'" + pModelCliente.getIdCliente() + "',"
                    + "'" + pModelCliente.getCliNome() + "',"
                    + "'" + pModelCliente.getCliEndereco() + "',"
                    + "'" + pModelCliente.getCliBairro() + "',"
                    + "'" + pModelCliente.getCliCidade() + "',"
                    + "'" + pModelCliente.getCliUF() + "',"
                    + "'" + pModelCliente.getCliCep() + "',"
                    + "'" + pModelCliente.getCliTelefone() + "',"
                    + "'" + pModelCliente.getCpf()+ "'," 
                    + "'" + pModelCliente.getNascimento()+ "',"
                    + "'" + pModelCliente.getCliQuantidade()+ "',"
                    + "'" + pModelCliente.getCliAcumulado()+ "'"
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
    * recupera Cliente
    * @param pIdCliente
    * @return ModelCliente
    */
    public ModelCliente getClienteDAO(int pIdCliente){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone,"
                    + "cpf,"
                    + "nascimento,"
                       + "quantidade_acumulado," 
                    + "valor_acumulado"  
                 + " FROM"
                     + " tbl_cliente"
                 + " WHERE"
                     + " pk_id_cliente = '" + pIdCliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCliNome(this.getResultSet().getString(2));
                modelCliente.setCliEndereco(this.getResultSet().getString(3));
                modelCliente.setCliBairro(this.getResultSet().getString(4));
                modelCliente.setCliCidade(this.getResultSet().getString(5));
                modelCliente.setCliUF(this.getResultSet().getString(6));
                modelCliente.setCliCep(this.getResultSet().getString(7));
                modelCliente.setCliTelefone(this.getResultSet().getString(8));
                modelCliente.setCpf(this.getResultSet().getString(9));
                modelCliente.setNascimento(this.getResultSet().getDate(10));
                modelCliente.setCliQuantidade(this.getResultSet().getString(11));
                modelCliente.setCliAcumulado(this.getResultSet().getFloat(12));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }
    
     public ModelCliente getClienteDAO(String pNomeCliente){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone,"
                    + "quantidade_acumulado," 
                    + "valor_acumulado"    
                 + " FROM"
                     + " tbl_cliente"
                 + " WHERE"
                     + " cli_nome = '" + pNomeCliente + "'"
                + ";"
            );
            
            

            while(this.getResultSet().next()){
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCliNome(this.getResultSet().getString(2));
                modelCliente.setCliEndereco(this.getResultSet().getString(3));
                modelCliente.setCliBairro(this.getResultSet().getString(4));
                modelCliente.setCliCidade(this.getResultSet().getString(5));
                modelCliente.setCliUF(this.getResultSet().getString(6));
                modelCliente.setCliCep(this.getResultSet().getString(7));
                modelCliente.setCliTelefone(this.getResultSet().getString(8));
                modelCliente.setCliQuantidade(this.getResultSet().getString(9));
                modelCliente.setCliAcumulado(this.getResultSet().getFloat(10));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }
     
     public ModelCliente getClientecpfDAO(String cpf){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone,"
                    + "quantidade_acumulado,"
                    + "valor_acumulado,"
                    + "cpf," 
                    + "nascimento"                    
                 + " FROM"
                     + " tbl_cliente"
                 + " WHERE"
                     + " cpf = '" + cpf + "'"
                + ";"
            );
   while(this.getResultSet().next()){
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCliNome(this.getResultSet().getString(2));
                modelCliente.setCliEndereco(this.getResultSet().getString(3));
                modelCliente.setCliBairro(this.getResultSet().getString(4));
                modelCliente.setCliCidade(this.getResultSet().getString(5));
                modelCliente.setCliUF(this.getResultSet().getString(6));
                modelCliente.setCliCep(this.getResultSet().getString(7));
                modelCliente.setCliTelefone(this.getResultSet().getString(8));
                modelCliente.setCliQuantidade(this.getResultSet().getString(9));
                modelCliente.setCliAcumulado(this.getResultSet().getFloat(10));
                modelCliente.setCpf(this.getResultSet().getString(11));
                modelCliente.setNascimento(this.getResultSet().getDate(12));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }
    /**
    * recupera uma lista de Cliente
        * @return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone,"
                    + "quantidade_acumulado,"
                    + "valor_acumulado,"
                    + "cpf,"
                    + "nascimento"
                 + " FROM"
                     + " tbl_cliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCliNome(this.getResultSet().getString(2));
                modelCliente.setCliEndereco(this.getResultSet().getString(3));
                modelCliente.setCliBairro(this.getResultSet().getString(4));
                modelCliente.setCliCidade(this.getResultSet().getString(5));
                modelCliente.setCliUF(this.getResultSet().getString(6));
                modelCliente.setCliCep(this.getResultSet().getString(7));
                modelCliente.setCliTelefone(this.getResultSet().getString(8));
                modelCliente.setCliQuantidade(this.getResultSet().getString(9));
                modelCliente.setCliAcumulado(this.getResultSet().getFloat(10));
                modelCliente.setCpf(this.getResultSet().getString(11));
                modelCliente.setNascimento(this.getResultSet().getDate(12));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_cliente SET "
                    + "pk_id_cliente = '" + pModelCliente.getIdCliente() + "',"
                    + "cli_nome = '" + pModelCliente.getCliNome() + "',"
                    + "cli_endereco = '" + pModelCliente.getCliEndereco() + "',"
                    + "cli_bairro = '" + pModelCliente.getCliBairro() + "',"
                    + "cli_cidade = '" + pModelCliente.getCliCidade() + "',"
                    + "cli_uf = '" + pModelCliente.getCliUF() + "',"
                    + "cli_cep = '" + pModelCliente.getCliCep() + "',"
                    + "cli_telefone = '" + pModelCliente.getCliTelefone() + "',"
                        //    + "quantidade_acumulado,"
                  //  + "valor_acumulado,"
                    + "cpf = '" + pModelCliente.getCpf()+ "',"
                    + "nascimento = '" + pModelCliente.getNascimento()+ "'"       
                + " WHERE "
                    + "pk_id_cliente = '" + pModelCliente.getIdCliente() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
     public boolean atualizarClienteticketDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_cliente SET "
                    + "pk_id_cliente = '" + pModelCliente.getIdCliente() + "',"
                  //  + "cli_nome = '" + pModelCliente.getCliNome() + "',"
                //    + "cli_endereco = '" + pModelCliente.getCliEndereco() + "',"
                  //  + "cli_bairro = '" + pModelCliente.getCliBairro() + "',"
                  //  + "cli_cidade = '" + pModelCliente.getCliCidade() + "',"
                 //   + "cli_uf = '" + pModelCliente.getCliUF() + "',"
                 //   + "cli_cep = '" + pModelCliente.getCliCep() + "',"
                   // + "cli_telefone = '" + pModelCliente.getCliTelefone() + "',"
                            + "quantidade_acumulado= '" + pModelCliente.getCliQuantidade()+ "',"
                    + "valor_acumulado = '" + pModelCliente.getCliAcumulado()+ "'" 
                 //   + "cpf = '" + pModelCliente.getCpf()+ "',"
                 //   + "nascimento = '" + pModelCliente.getNascimento()+ "'"       
                + " WHERE "
                    + "pk_id_cliente = '" + pModelCliente.getIdCliente() + "'"
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
    * exclui Cliente
    * @param pIdCliente
    * @return boolean
    */
    public boolean excluirClienteDAO(int pIdCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_cliente "
                + " WHERE "
                    + "pk_id_cliente = '" + pIdCliente + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    //gerear relatorio de cliente
     public boolean gerarRelatorioCliente(){
        try {
            this.conectar();
            this.executarSQL(
                "SELECT"
                    + " tbl_cliente.pk_id_cliente AS tbl_cliente_pk_id_cliente,"
                    + " tbl_cliente.cli_nome AS tbl_cliente_cli_nome,"
                    + " tbl_cliente.cli_endereco AS tbl_cliente_cli_endereco,"
                    + " tbl_cliente.cli_bairro AS tbl_cliente_cli_bairro,"
                    + " tbl_cliente.cli_cidade AS tbl_cliente_cli_cidade,"
                    + " tbl_cliente.cli_uf AS tbl_cliente_cli_uf,"
                    + " tbl_cliente.cli_cep AS tbl_cliente_cli_cep,"
                    + " tbl_cliente.cli_telefone AS tbl_cliente_cli_telefone"
                 + " FROM"
                     + " tbl_cliente"
                 
                   
            );
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            //caminho do meu relatorio
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/todosclientes.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);
            //até aqui manda gerar gelatorio
            //converter o relatorio para PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Vendas2/rel/relCliente.pdf");
            //instancia o file e manda abrir
            File file = new File("C:/Vendas2/rel/relCliente.pdf");
            
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
}