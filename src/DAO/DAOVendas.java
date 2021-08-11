package DAO;

import model.ModelVendas;
import conexoes.ConexaoMySql;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.sql.Date;
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
* @author Gabriela
*/
public class DAOVendas extends ConexaoMySql {

    /**
    * grava Vendas
    * @param pModelVendas
    * @return int
    */
    public int salvarVendasDAO(ModelVendas pModelVendas){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_vendas ("
                    + "fk_id_caixa,"    
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto,"
                    + "ven_taxa,"
           //         + "ven_kg"
                        + "formaPagamento1,"
                    + "formaPagamento2,"
                    + "recebido1,"
                    + "recebido2,"
                        
                      + "parcela,"
                    + "parcela2"
                        
                + ") VALUES ("
                    + "'" + pModelVendas.getIdCaixa()+ "',"
                    + "'" + pModelVendas.getCliente() + "',"
                    + "'" + pModelVendas.getVenDataVenda() + "',"
                    + "'" + pModelVendas.getVenValorLiquido() + "',"
                    + "'" + pModelVendas.getVenValorBruto() + "',"
                    + "'" + pModelVendas.getVenDesconto() + "',"
                  //  + "'" + pModelVendas.getVenTaxa() + "',"
                    + "'" + pModelVendas.getVenKg() + "',"
                    + "'" + pModelVendas.getFormaPagamento()+ "',"
                    + "'" + pModelVendas.getFormaPagamento2()+ "',"
                    + "'" + pModelVendas.getValorRecebido() + "',"
                    + "'" + pModelVendas.getValorRecebido2()+ "'," 
                    + "'" + pModelVendas.getParcela() + "',"
                   + "'" + pModelVendas.getParcela2() + "'" 
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
    * recupera Vendas
    * @param pIdVenda
    * @return ModelVendas
    */
    public ModelVendas getVendasDAO(int pIdVenda){
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_vendas,"
                    + "fk_id_caixa," 
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto,"
                    + "ven_taxa,"
                    + "ven_kg"
                 + " FROM"
                     + " tbl_vendas"
                 + " WHERE"
                     + " pk_id_vendas = '" + pIdVenda + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setIdCaixa(this.getResultSet().getInt(2));
                modelVendas.setCliente(this.getResultSet().getInt(3));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(4));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(5));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(6));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(7));
                modelVendas.setVenTaxa(this.getResultSet().getDouble(8));
                modelVendas.setVenKg(this.getResultSet().getDouble(9));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendas;
    }

      
       
       public ModelVendas getVendas1DAO(int date, int date1){
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                   // + "pk_id_vendas,"
                 //   + "fk_id_caixa," 
                  //  + "fk_cliente,"
                  //  + "YEAR(ven_data_venda),"
                    + "ven_data_venda,"
                    + "SUM(ven_valor_liquido) as total"
                   // + "ven_valor_bruto,"
                  //  + "ven_desconto,"
                  //  + "ven_taxa,"
                  //  + "ven_kg"
                 + " FROM"
                     + " tbl_vendas"
                 + " where"
                  + " YEAR(ven_data_venda) = '" + date + "' AND MONTH(ven_data_venda) = '" + date1 + "'"           
                
                + " group by"
                      + " Month(ven_data_venda), Year(ven_data_venda)"+ ";"
            );

            while(this.getResultSet().next()){
               
               modelVendas.setVenDataVenda(this.getResultSet().getDate(1));
               modelVendas.setVenValorLiquido(this.getResultSet().getDouble(2));
              
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendas;
    }
    /**
    * recupera uma lista de Vendas
        * @return ArrayList
    */
    public ArrayList<ModelVendas> getListaVendasDAO(){
        ArrayList<ModelVendas> listamodelVendas = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_vendas,"
                        
                    + "fk_id_caixa,"   
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto,"
                    + "ven_taxa,"
                    + "ven_kg"
                 + " FROM"
                     + " tbl_vendas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setIdCaixa(this.getResultSet().getInt(2));
                modelVendas.setCliente(this.getResultSet().getInt(3));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(4));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(5));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(6));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(7));
                modelVendas.setVenTaxa(this.getResultSet().getDouble(8));
                modelVendas.setVenKg(this.getResultSet().getDouble(9));
                listamodelVendas.add(modelVendas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendas;
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * @return boolean
    */
    public boolean atualizarVendasDAO(ModelVendas pModelVendas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_vendas SET "
                    + "pk_id_vendas = '" + pModelVendas.getIdVenda() + "',"
                    + "fk_id_caixa  = '" + pModelVendas.getIdCaixa() + "',"
                    + "fk_cliente = '" + pModelVendas.getCliente() + "',"
                    + "ven_data_venda = '" + pModelVendas.getVenDataVenda() + "',"
                    + "ven_valor_liquido = '" + pModelVendas.getVenValorLiquido() + "',"
                    + "ven_valor_bruto = '" + pModelVendas.getVenValorBruto() + "',"
                    + "ven_desconto = '" + pModelVendas.getVenDesconto() + "',"
                    + "ven_taxa = '" + pModelVendas.getVenTaxa() + "',"
                    + "ven_kg = '" + pModelVendas.getVenKg() + "'"
                + " WHERE "
                    + "pk_id_vendas = '" + pModelVendas.getIdVenda() + "'"
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
    * exclui Vendas
    * @param pIdVenda
    * @return boolean
    */
    public boolean excluirVendasDAO(int pIdVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_vendas "
                + " WHERE "
                    + "pk_id_vendas = '" + pIdVenda + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
     public Date datavenda(){
          ModelVendas modelv = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                    
                    "SELECT GROUP_CONCAT ven_data_venda from tbl_vendas where pk_id_vendas = (select (pk_id_vendas) from tbl_vendas)"
                      
                           + ";"
            );
            while(this.getResultSet().next()){
                modelv.setVenDataVenda(this.getResultSet().getDate(1));
           
            }
            }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            this.fecharConexao();
        }
        return datavenda();
    }
     
     //gerear relatorio de cliente
     public boolean gerarRelatorioVendas(){
        try {
            this.conectar();
            this.executarSQL(
                "SELECT"
                    + " tbl_vendas.pk_id_vendas AS tbl_vendas_pk_id_vendas,"
                    + " tbl_vendas.fk_id_caixa AS tbl_vendas_fk_id_caixa,"
                    + " tbl_vendas.fk_cliente AS tbl_vendas_fk_cliente,"
                    + " tbl_vendas.ven_data_venda AS tbl_vendas_ven_data_venda,"
                    + " tbl_vendas.ven_valor_liquido AS tbl_vendas_ven_valor_liquido,"
                    + " tbl_vendas.ven_valor_bruto AS tbl_vendas_ven_valor_bruto,"
                    + " tbl_vendas.ven_desconto AS tbl_vendas_ven_desconto,"
                    + " tbl_vendas.ven_taxa AS tbl_vendas_ven_taxa,"
                    + " tbl_vendas.ven_kg AS tbl_vendas_ven_kg"    
                 + " FROM"
                     + " tbl_vendas"
                 
                   
            );
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            //caminho do meu relatorio
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/vendaas.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);
            //até aqui manda gerar gelatorio
            //converter o relatorio para PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Vendas2/rel/relVendas.pdf");
            //instancia o file e manda abrir
            File file = new File("C:/Vendas2/rel/relVendas.pdf");
            
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

    public boolean RelatorioVendasDAO(int codigoVenda) {
         
        try {
            this.conectar();
            this.executarSQL(
                "SELECT"
       + "   tbl_vendas.pk_id_vendas AS tbl_vendas_pk_id_vendas,"
    + "  tbl_vendas.fk_id_caixa AS tbl_vendas_fk_id_caixa,"
   + "   tbl_vendas.ven_data_venda AS tbl_vendas_ven_data_venda,"
   + "   tbl_vendas.ven_valor_liquido AS tbl_vendas_ven_valor_liquido,"
   + "   tbl_vendas.ven_valor_bruto AS tbl_vendas_ven_valor_bruto,"
   + "   tbl_vendas.ven_desconto AS tbl_vendas_ven_desconto,"
   + "   tbl_vendas.ven_taxa AS tbl_vendas_ven_taxa,"
   + "   tbl_vendas.ven_kg AS tbl_vendas_ven_kg,"            
    + "  tbl_cliente.pk_id_cliente AS tbl_cliente_pk_id_cliente,"
   + "   tbl_cliente.cli_nome AS tbl_cliente_cli_nome,"
   + "   tbl_cliente.cli_endereco AS tbl_cliente_cli_endereco,"
   + "   tbl_cliente.cli_bairro AS tbl_cliente_cli_bairro,"
  + "    tbl_cliente.cli_cidade AS tbl_cliente_cli_cidade,"
  + "    tbl_cliente.cli_uf AS tbl_cliente_cli_uf,"
  + "    tbl_cliente.cli_cep AS tbl_cliente_cli_cep,"
  + "    tbl_cliente.cli_telefone AS tbl_cliente_cli_telefone,"
 
    + "  tbl_produto.pk_id_produto AS tbl_produto_pk_id_produto,"
   + "   tbl_produto.fk_fornecedor AS tbl_produto_fk_fornecedor,"
   + "   tbl_produto.pro_nome AS tbl_produto_pro_nome,"
  + "    tbl_produto.pro_valor AS tbl_produto_pro_valor,"
   + "   tbl_produto.pro_estoque AS tbl_produto_pro_estoque,"
   + "   tbl_produto.nome_fornecedor AS tbl_produto_nome_fornecedor,"
   + "   tbl_vendas_produtos.pk_id_venda_produto AS tbl_vendas_produtos_pk_id_venda_produto,"
   + "   tbl_vendas_produtos.fk_produto AS tbl_vendas_produtos_fk_produto,"
   + "   tbl_vendas_produtos.fk_vendas AS tbl_vendas_produtos_fk_vendas,"
   + "   tbl_vendas_produtos.ven_pro_valor AS tbl_vendas_produtos_ven_pro_valor,"
   + "   tbl_vendas_produtos.ven_pro_quantidade AS tbl_vendas_produtos_ven_pro_quantidade,"
   + "   tbl_vendas.fk_cliente AS tbl_vendas_fk_cliente "
   + "FROM "
 
   + " tbl_cliente INNER JOIN tbl_vendas tbl_vendas ON tbl_cliente.pk_id_cliente = tbl_vendas.fk_cliente"
   + " INNER JOIN tbl_vendas_produtos tbl_vendas_produtos ON tbl_vendas.pk_id_vendas = tbl_vendas_produtos.fk_vendas"
   + " INNER JOIN tbl_produto tbl_produto ON tbl_vendas_produtos.fk_produto = tbl_produto.pk_id_produto "
                   + "WHERE tbl_vendas.pk_id_vendas = '"+codigoVenda+"';"
            );
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            //caminho do meu relatorio
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/Imprimir.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);
            //até aqui manda gerar gelatorio
            //converter o relatorio para PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Vendas2/rel/relImprimir.pdf");
            //instancia o file e manda abrir
            File file = new File("C:/Vendas2/rel/relImprimir.pdf");
            
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

    public boolean gerarRelatorioMovimentosVendas(int codigoVenda) {
        try {
            this.conectar();
            this.executarSQL(
                 "SELECT"
       + "   tbl_vendas.pk_id_vendas AS tbl_vendas_pk_id_vendas,"
    + "  tbl_vendas.fk_id_caixa AS tbl_vendas_fk_id_caixa,"
   + "   tbl_vendas.ven_data_venda AS tbl_vendas_ven_data_venda,"
   + "   tbl_vendas.ven_valor_liquido AS tbl_vendas_ven_valor_liquido,"
   + "   tbl_vendas.ven_valor_bruto AS tbl_vendas_ven_valor_bruto,"
   + "   tbl_vendas.ven_desconto AS tbl_vendas_ven_desconto,"
   + "   tbl_vendas.ven_taxa AS tbl_vendas_ven_taxa,"
   + "   tbl_vendas.ven_kg AS tbl_vendas_ven_kg,"            
  //  + "  tbl_cliente.pk_id_cliente AS tbl_cliente_pk_id_cliente,"
  // + "   tbl_cliente.cli_nome AS tbl_cliente_cli_nome,"
   //+ "   tbl_cliente.cli_endereco AS tbl_cliente_cli_endereco,"
   //+ "   tbl_cliente.cli_bairro AS tbl_cliente_cli_bairro,"
  //+ "    tbl_cliente.cli_cidade AS tbl_cliente_cli_cidade,"
  //+ "    tbl_cliente.cli_uf AS tbl_cliente_cli_uf,"
  //+ "    tbl_cliente.cli_cep AS tbl_cliente_cli_cep,"
  //+ "    tbl_cliente.cli_telefone AS tbl_cliente_cli_telefone,"
 
    + "  tbl_produto.pk_id_produto AS tbl_produto_pk_id_produto,"
   + "   tbl_produto.fk_fornecedor AS tbl_produto_fk_fornecedor,"
   + "   tbl_produto.pro_nome AS tbl_produto_pro_nome,"
  + "    tbl_produto.pro_valor AS tbl_produto_pro_valor,"
   + "   tbl_produto.pro_estoque AS tbl_produto_pro_estoque,"
   + "   tbl_produto.nome_fornecedor AS tbl_produto_nome_fornecedor,"
   + "   tbl_vendas_produtos.pk_id_venda_produto AS tbl_vendas_produtos_pk_id_venda_produto,"
   + "   tbl_vendas_produtos.fk_produto AS tbl_vendas_produtos_fk_produto,"
   + "   tbl_vendas_produtos.fk_vendas AS tbl_vendas_produtos_fk_vendas,"
   + "   tbl_vendas_produtos.ven_pro_valor AS tbl_vendas_produtos_ven_pro_valor,"
   + "   tbl_vendas_produtos.ven_pro_quantidade AS tbl_vendas_produtos_ven_pro_quantidade, "
   + "   tbl_vendas.fk_cliente AS tbl_vendas_fk_cliente "
   + "FROM "
 
  // + " tbl_cliente INNER JOIN tbl_vendas tbl_vendas ON tbl_cliente.pk_id_cliente = tbl_vendas.fk_cliente"
   + "tbl_vendas INNER JOIN tbl_vendas_produtos tbl_vendas_produtos ON tbl_vendas.pk_id_vendas = tbl_vendas_produtos.fk_vendas"
   + " INNER JOIN tbl_produto tbl_produto ON tbl_vendas_produtos.fk_produto = tbl_produto.pk_id_produto "
                   + "WHERE tbl_vendas.pk_id_vendas = '"+codigoVenda+"';"
                
            );
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            //caminho do meu relatorio
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/ImprimirMovimentos.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);
            //até aqui manda gerar gelatorio
            //converter o relatorio para PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Vendas2/rel/relImprimirMov.pdf");
            //instancia o file e manda abrir
            File file = new File("C:/Vendas2/rel/relImprimirMov.pdf");
            
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

   
