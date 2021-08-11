package controller;

import model.ModelCaixa;
import DAO.DAOCaixa;
import java.util.ArrayList;
import model.ModelVendasProdutos;

/**
*
* @author Gabriela
*/
public class ControllerCaixa {

    private DAOCaixa daoCaixa = new DAOCaixa();

    /**
    * grava Caixa
    * @param pModelCaixa
    * @return int
    */
    public int salvarCaixaController(ModelCaixa pModelCaixa){
        return this.daoCaixa.salvarCaixaDAO(pModelCaixa);
    }
    
     public int salvarCaixa1Controller(ModelCaixa pModelCaixa){
        return this.daoCaixa.salvarCaixa1DAO(pModelCaixa);
    }
    
    /**
    * recupera Caixa
    * @param pPk_caixa
    * @return ModelCaixa
    */
    public ModelCaixa getCaixaController(int pPk_caixa){
        return this.daoCaixa.getCaixaDAO(pPk_caixa);
    }
    
     public ModelCaixa getUltimoIdController(ModelCaixa pModelCaixa){
        return this.daoCaixa.UltimoIdCaixaDAO(pModelCaixa);
    }
     
     public ModelCaixa getUltimaMovimentacaoController(ModelCaixa pModelCaixa){
        return this.daoCaixa.UltimaMovimentacaoCaixaDAO(pModelCaixa);
    }
     
     public ModelCaixa getUltimaMovimentacaoCaixaController(ModelCaixa pModelCaixa){
        return this.daoCaixa.UltimaMovimentacaoCaixaSangriaCaixaDAO(pModelCaixa);
    }
     
      public ModelCaixa getUltimaAberturaCaixaController(ModelCaixa pModelCaixa){
        return this.daoCaixa.UltimaMovimentacaoAberturaCaixaDAO(pModelCaixa);
    }
     
     public ModelCaixa getUltimoCreditoController(ModelCaixa pModelCaixa){
        return this.daoCaixa.UltimoCreditoCaixaDAO(pModelCaixa);
    }
     
   
    public ModelCaixa getUltimoDebitoController(ModelCaixa pModelCaixa){
        return this.daoCaixa.UltimoDebitoCaixaDAO(pModelCaixa);
    }
    
     public ModelCaixa getUltimoDinheiroController(ModelCaixa pModelCaixa){
        return this.daoCaixa.UltimoDinheiroCaixaDAO(pModelCaixa);
    }
     
     public ModelCaixa getUltimoTrocoController(ModelCaixa pModelCaixa){
        return this.daoCaixa.UltimotrocoCaixaDAO(pModelCaixa);
    }
     
    public ModelCaixa getUltimoDinheiroSangriaController(ModelCaixa pModelCaixa){
        return this.daoCaixa.UltimoDinheiroSangriaDAO(pModelCaixa);
    }
    
     public ModelCaixa getUltimoStatusController(ModelCaixa pModelCaixa){
        return this.daoCaixa.UltimoStatusDAO(pModelCaixa);
    }
    /**
    * recupera uma lista deCaixa
    * @param pPk_caixa
    * @return ArrayList
    */
    public ArrayList<ModelCaixa> getListaCaixaController(){
        return this.daoCaixa.getListaCaixaDAO();
    }
    
      public ArrayList<ModelCaixa> getListaStatusCaixaController(){
        return this.daoCaixa.getListaCaixaDAO();
      }
    /**
    * atualiza Caixa
    * @param pModelCaixa
    * @return boolean
    */
    public boolean atualizarCaixaController(ModelCaixa pModelCaixa){
        return this.daoCaixa.atualizarCaixaDAO(pModelCaixa);
    }
    
    public boolean atualizar1CaixaController(ModelCaixa pModelCaixa){
        return this.daoCaixa.atualizar1CaixaDAO(pModelCaixa);
    }
    
    public boolean atualizarDebitoController(ModelCaixa pModelCaixa){
        return this.daoCaixa.atualizarDebitoDAO(pModelCaixa);
    }
    
    public boolean atualizarCreditoController(ModelCaixa pModelCaixa){
        return this.daoCaixa.atualizar1CreditoDAO(pModelCaixa);
    }
    
    public boolean atualizar1DinheiroController(ModelCaixa pModelCaixa){
        return this.daoCaixa.atualizarDinheiroDAO(pModelCaixa);
    }
    
    public boolean atualizartrocoController(ModelCaixa pModelCaixa){
        return this.daoCaixa.atualizarTrocoDAO(pModelCaixa);
    }
    /**
    * exclui Caixa
    * @param pPk_caixa
    * @return boolean
    */
    public boolean excluirCaixaController(int pPk_caixa){
        return this.daoCaixa.excluirCaixaDAO(pPk_caixa);
    }
    
   // public boolean salvarCaixaController(ArrayList<ModelCaixa> plistaModelAberturaaCaixa) {
  //      return this.daoCaixa.salvarCaixaDAO(plistaModelAberturaaCaixa);
  //  }
}