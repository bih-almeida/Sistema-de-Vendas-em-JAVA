package controller;

import model.ModelCliente;
import DAO.DAOCliente;
import java.util.ArrayList;

/**
*
* @author Gabriela Silva de Almeida
*/
public class ControllerCliente {

    public boolean gerarRelatorioCliente() {
        return this.daoCliente.gerarRelatorioCliente();
    }

    private DAOCliente daoCliente = new DAOCliente();

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
    public int salvarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

    /**
    * recupera Cliente
    * @param pIdCliente
    * @return ModelCliente
    */
    public ModelCliente getClienteController(int pIdCliente){
        return this.daoCliente.getClienteDAO(pIdCliente);
    }
    
  
    
    public ModelCliente getClienteController(String pNomeCliente){
        return this.daoCliente.getClienteDAO(pNomeCliente);
    }
    
     public ModelCliente getClientecpfController(String cpf){
        return this.daoCliente.getClientecpfDAO(cpf);
    }

    /**
    * recupera uma lista deCliente
    * @param pIdCliente
    * @return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteController(){
        return this.daoCliente.getListaClienteDAO();
    }
    
    public ModelCliente getUltimaMovimentacaoClienteController(ModelCliente pModelCaixa){
        return this.daoCliente.UltimaMovimentacaoClienteDAO(pModelCaixa);
    }
    
    public ModelCliente getUltimaMovimentacaoClienteQuantidadeController(ModelCliente pModelCaixa){
        return this.daoCliente.UltimaMovimentacaoQuantidadeClienteDAO(pModelCaixa);
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }
    
    public boolean atualizarClienteacumuladoController(ModelCliente pModelCliente){
        return this.daoCliente.atualizarClienteticketDAO(pModelCliente);
    }

    /**
    * exclui Cliente
    * @param pIdCliente
    * @return boolean
    */
    public boolean excluirClienteController(int pIdCliente){
        return this.daoCliente.excluirClienteDAO(pIdCliente);
    }
}