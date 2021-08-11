package DAO;

import model.ModelVendasProdutos;
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
* @author Gabriela
*/
public class DAOVendasProdutos extends ConexaoMySql {

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * @return int
    */
    public int salvarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_vendas_produtos ("
                    + "fk_produto,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade,"
                    + "ven_taxa_produto"
              //      + "ven_balanca_kg"
                + ") VALUES ("
                    + "'" + pModelVendasProdutos.getProduto() + "',"
                    + "'" + pModelVendasProdutos.getVendas() + "',"
                    + "'" + pModelVendasProdutos.getVenProValor() + "',"
                    + "'" + pModelVendasProdutos.getVenProQuantidade() + "',"
                    + "'" + pModelVendasProdutos.getVenTaxaProduto() + "'"
             //       + "'" + pModelVendasProdutos.getVenBalancaKg() + "'"
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
    * recupera VendasProdutos
    * @param pIdVendaProduto
    * @return ModelVendasProdutos
    */
    public ModelVendasProdutos getVendasProdutosDAO(int pIdVendaProduto){
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda_produto,"
                    + "fk_produto,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade,"
                    + "ven_taxa_produto,"
                    + "ven_balanca_kg"
                 + " FROM"
                     + " tbl_vendas_produtos"
                 + " WHERE"
                     + " pk_id_venda_produto = '" + pIdVendaProduto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(1));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(2));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(3));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(5));
                modelVendasProdutos.setVenTaxaProduto(this.getResultSet().getDouble(6));
                modelVendasProdutos.setVenBalancaKg(this.getResultSet().getDouble(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendasProdutos;
    }

    /**
    * recupera uma lista de VendasProdutos
        * @return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosDAO(){
        ArrayList<ModelVendasProdutos> listamodelVendasProdutos = new ArrayList();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda_produto,"
                    + "fk_produto,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade"
                  //  + "ven_taxa_produto,"
                //    + "ven_balanca_kg"
                 + " FROM"
                     + " tbl_vendas_produtos"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProdutos = new ModelVendasProdutos();
                modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(1));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(2));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(3));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(5));
               // modelVendasProdutos.setVenTaxaProduto(this.getResultSet().getDouble(6));
              //  modelVendasProdutos.setVenBalancaKg(this.getResultSet().getDouble(7));
                listamodelVendasProdutos.add(modelVendasProdutos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendasProdutos;
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * @return boolean
    */
    public boolean atualizarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_vendas_produtos SET "
                    + "pk_id_venda_produto = '" + pModelVendasProdutos.getIdVendaProduto() + "',"
                    + "fk_produto = '" + pModelVendasProdutos.getProduto() + "',"
                    + "fk_vendas = '" + pModelVendasProdutos.getVendas() + "',"
                    + "ven_pro_valor = '" + pModelVendasProdutos.getVenProValor() + "',"
                    + "ven_pro_quantidade = '" + pModelVendasProdutos.getVenProQuantidade() + "',"
                    + "ven_taxa_produto = '" + pModelVendasProdutos.getVenTaxaProduto() + "',"
                    + "ven_balanca_kg = '" + pModelVendasProdutos.getVenBalancaKg() + "'"
                + " WHERE "
                    + "pk_id_venda_produto = '" + pModelVendasProdutos.getIdVendaProduto() + "'"
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
    * exclui VendasProdutos
    * @param pIdVendaProduto
    * @return boolean
    */
    public boolean excluirVendasProdutosDAO(int pIdVendaProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_vendas_produtos "
                + " WHERE "
                    + "fk_vendas = '" + pIdVendaProduto + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean salvarVendasProdutosDAO(ArrayList<ModelVendasProdutos> plistaModelVendasProdutos) {
         try {
            this.conectar();
            int cont = plistaModelVendasProdutos.size();
            for (int i = 0; i<cont; i++){
             this.insertSQL(
                "INSERT INTO tbl_vendas_produtos ("
                    + "fk_vendas,"    
                    + "fk_produto,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade"
              //      + "ven_taxa_produto,"
            //        + "ven_balanca_kg"
                + ") VALUES ("
                    + "'" + plistaModelVendasProdutos.get(i).getVendas() + "',"
                    + "'" + plistaModelVendasProdutos.get(i).getProduto()+ "',"
                    + "'" + plistaModelVendasProdutos.get(i).getVenProValor() + "',"
                    + "'" + plistaModelVendasProdutos.get(i).getVenProQuantidade() + "'"
                 
                + ");"
            );
            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    //gerear relatorio de cliente
     public boolean gerarRelatorioProdutosVendidos(){
        try {
            this.conectar();
            this.executarSQL(
                "SELECT"
                    + " tbl_vendas_produtos.pk_id_venda_produto AS tbl_vendas_produtos_pk_id_venda_produto,"
                    + " tbl_vendas_produtos.fk_produto AS tbl_vendas_produtos_fk_produto,"
                    + " tbl_vendas_produtos.fk_vendas AS tbl_vendas_produtos_fk_vendas,"
                    + " tbl_vendas_produtos.ven_pro_valor AS tbl_vendas_produtos_ven_pro_valor,"
                    + " tbl_vendas_produtos.ven_pro_quantidade AS tbl_vendas_produtos_ven_pro_quantidade"
                    
                 + " FROM"
                     + " tbl_vendas_produtos"
                 
                   
            );
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            //caminho do meu relatorio
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/produtosvendidos.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);
            //até aqui manda gerar gelatorio
            //converter o relatorio para PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Vendas2/rel/relprodutosVendidos.pdf");
            //instancia o file e manda abrir
            File file = new File("C:/Vendas2/rel/relprodutosVendidos.pdf");
            
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