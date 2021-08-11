package controller;

import DAO.DAO1;
import model.ModelCaixa;
import DAO.DAOCaixa;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelVendasProdutos;

/**
*
* @author Gabriela
*/
public class ControllerCaixa1 {

   

    private DAO1 daoCaixa1;
    private ConexaoMySql dataSource;

    public ControllerCaixa1() {
        this.daoCaixa1 = new DAO1(dataSource);
    }

    private DAO1 daoCaixa2 = new DAO1(dataSource);
    /**
    * grava Caixa
    * @param pModelCaixa
    * @return int
    */
  
     public ModelCaixa getCaixa1Controller(int pPk_caixa) {
            return this.daoCaixa2.getCaixaDAO1(pPk_caixa);
                    }

    
   

}
