package controller;

import model.ModelVendas;
import DAO.DAOVendas;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Date;
import java.util.ArrayList;
import model.ModelCaixa;

/**
*
* @author Gabriela
*/
public class ControllerVendas {

    private DAOVendas daoVendas = new DAOVendas();

    public boolean gerarRelatorioVendas() {
        return this.daoVendas.gerarRelatorioVendas();
    }
    
    public boolean gerarRelatorioMovimentosVendas(int codigoVenda) {
        return this.daoVendas.gerarRelatorioMovimentosVendas(codigoVenda);
    }
    /**
    * grava Vendas
    * @param pModelVendas
    * @return int
    */
    public int salvarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.salvarVendasDAO(pModelVendas);
    }

    /**
    * recupera Vendas
    * @param pIdVenda
    * @return ModelVendas
    */
    public ModelVendas getVendasController(int pIdVenda){
        return this.daoVendas.getVendasDAO(pIdVenda);
    }
    
     public ModelVendas getVendas1Controller(int date, int date1){
        return this.daoVendas.getVendas1DAO(date, date1);
    }

    /**
    * recupera uma lista deVendas
    * @param pIdVenda
    * @return ArrayList
    */
    public ArrayList<ModelVendas> getListaVendasController(){
        return this.daoVendas.getListaVendasDAO();
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * @return boolean
    */
    public boolean atualizarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.atualizarVendasDAO(pModelVendas);
    }

    /**
    * exclui Vendas
    * @param pIdVenda
    * @return boolean
    */
    public boolean excluirVendasController(int pIdVenda){
        return this.daoVendas.excluirVendasDAO(pIdVenda);
    }
    
        
     public Date getdata(){
        return this.daoVendas.datavenda();
    }
     
     public boolean gerarRelatorioVenda(int codigoVenda){
         return this.daoVendas.RelatorioVendasDAO(codigoVenda);
     }

    
}