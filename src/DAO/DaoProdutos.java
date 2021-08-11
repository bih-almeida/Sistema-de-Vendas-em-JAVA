/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import model.ModelProdutos;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Aula
 */
public class DaoProdutos extends ConexaoMySql {

    /**
     * Cadastrar um produto no banco
     *
     * @param pModelProdutos
     * @return
     */
    public int salvarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_produto ("
                    + "fk_fornecedor,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque,"
                     + "nome_fornecedor"
                    + ") VALUES ("
                    + "'" + pModelProdutos.getFkFornecedor()+ "',"
                    + "'" + pModelProdutos.getProNome() + "',"
                     + "'" + pModelProdutos.getProValor() + "',"
                    + "'" + pModelProdutos.getProEstoque() + "',"
                    + "'" + pModelProdutos.getProNomeFornecedor()+ "'"
                            
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Excluir um produto do banco
     *
     * @param pIdProduto
     * @return boolean
     */
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_produto WHERE pk_id_produto = '" + pIdProduto + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Alterar dados do produtos
     *
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alterarProdutoDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET "
                            + "fk_fornecedor = '" + pModelProdutos.getFkFornecedor()+ "',"
                    + "pro_nome = '" + pModelProdutos.getProNome() + "',"
                    + "pro_valor = '" + pModelProdutos.getProValor() + "',"
                    + "pro_estoque = '" + pModelProdutos.getProEstoque() + "',"
                    + "nome_fornecedor = '" + pModelProdutos.getProNomeFornecedor()+ "'"        
                    + " WHERE pk_id_produto = '" + pModelProdutos.getIdProduto() + "'"
            );

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }

    /**
     * retornar um produto pelo codigo
     *
     * @param pIdProduto
     * @return modelproduto
     */
    public ModelProdutos retornarProdutoDAO(int pIdProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    
                    + "pk_id_produto, "
                    + "fk_fornecedor, "
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque, "
                    + "nome_fornecedor "
                    + "FROM tbl_produto WHERE pk_id_produto = '" + pIdProduto + "';");
            while (this.getResultSet().next()) {
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setFkFornecedor(this.getResultSet().getInt(2));
                modelProdutos.setProNome(this.getResultSet().getString(3));
                modelProdutos.setProValor(this.getResultSet().getDouble(4));
                modelProdutos.setProEstoque(this.getResultSet().getInt(5));
                modelProdutos.setProNomeFornecedor(this.getResultSet().getString(6));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }

    /**
     * retornar um produto pelo codigo
     *
     * @param pNomeProduto
     * @return modelproduto
     */
    public ModelProdutos retornarProdutoDAO(String pNomeProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto, "
                    + "fk_fornecedor, "
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque, "
                    + "nome_fornecedor "
                    + "FROM tbl_produto WHERE pro_nome = '" + pNomeProduto + "';");
            while (this.getResultSet().next()) {
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setFkFornecedor(this.getResultSet().getInt(2));
                modelProdutos.setProNome(this.getResultSet().getString(3));
                modelProdutos.setProValor(this.getResultSet().getDouble(4));
                modelProdutos.setProEstoque(this.getResultSet().getInt(5));
                modelProdutos.setProNomeFornecedor(this.getResultSet().getString(6));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }

    /**
     * Retornar uma lista de completa produtos
     *
     * @return listaModelProdutos
     */
    public ArrayList<ModelProdutos> retornarListaProdutosDAO() {
        ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto, "
                    + "fk_fornecedor, "
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque, "
                    + "nome_fornecedor "
                    + "FROM tbl_produto;");

            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setFkFornecedor(this.getResultSet().getInt(2));
                modelProdutos.setProNome(this.getResultSet().getString(3));
                modelProdutos.setProValor(this.getResultSet().getDouble(4));
                modelProdutos.setProEstoque(this.getResultSet().getInt(5));
                modelProdutos.setProNomeFornecedor(this.getResultSet().getString(6));
                listaModelProdutos.add(modelProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutos;
    }

    /**
     * Alterar estoque de produtos no banco
     * @param pListaModelProdutoses
     * @return 
     */
    public boolean alterarEstoqueProdutosDAO(ArrayList<ModelProdutos> pListaModelProdutoses) {
        try {
            this.conectar();
            for (int i = 0; i < pListaModelProdutoses.size(); i++) {
                this.executarUpdateDeleteSQL(
                        "UPDATE tbl_produto SET "
                        + "pro_estoque = '" + pListaModelProdutoses.get(i).getProEstoque()+ "'"
                        + " WHERE pk_id_produto = '" + pListaModelProdutoses.get(i).getIdProduto() + "'"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    //gerear relatorio de cliente
     public boolean gerarRelatorioEstoque(){
        try {
            this.conectar();
            this.executarSQL(
                "SELECT"
                    + " tbl_produto.pk_id_produto AS tbl_produto_pk_id_produto,"
                    + " tbl_produto.fk_fornecedor AS tbl_produto_fk_fornecedor,"
                    + " tbl_produto.pro_nome AS tbl_produto_pro_nome,"
                    + " tbl_produto.pro_valor AS tbl_produto_pro_valor,"
                    + " tbl_produto.pro_estoque AS tbl_produto_pro_estoque"
                   
                 + " FROM"
                     + " tbl_produto"
                 
                   
            );
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            //caminho do meu relatorio
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/estoque.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);
            //até aqui manda gerar gelatorio
            //converter o relatorio para PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Vendas2/rel/relEstoque.pdf");
            //instancia o file e manda abrir
            File file = new File("C:/Vendas2/rel/relEstoque.pdf");
            
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
     
     //gerear relatorio de cliente
     public boolean gerarRelatorioProdutos(){
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT" 
                + " tbl_produto.pk_id_produto AS tbl_produto_pk_id_produto,"
                    + " tbl_produto.fk_fornecedor AS tbl_produto_fk_fornecedor,"
                    + " tbl_produto.pro_nome AS tbl_produto_pro_nome,"
                    + " tbl_produto.pro_valor AS tbl_produto_pro_valor,"
                    + " tbl_produto.pro_estoque AS tbl_produto_pro_estoque"
                   
                 + " FROM"
                     + " tbl_produto"
                   
            );
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            //caminho do meu relatorio
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/produtos.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);
            //até aqui manda gerar gelatorio
            //converter o relatorio para PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Vendas2/rel/relProdutos.pdf");
            //instancia o file e manda abrir
            File file = new File("C:/Vendas2/rel/relProdutos.pdf");
            
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