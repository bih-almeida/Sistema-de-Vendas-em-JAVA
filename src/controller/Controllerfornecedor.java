package controller;

import model.Modelfornecedor;
import DAO.DAOfornecedor;
import java.util.ArrayList;
import model.ModelCliente;

/**
*
* @author Gabriela Silva de Almeida
*/
public class Controllerfornecedor {

    private DAOfornecedor daofornecedor = new DAOfornecedor();

    
    public boolean gerarRelatorioFornecedor() {
        return this.daofornecedor.gerarRelatorioFornecedor();
    }
    /**
    * grava fornecedor
    * @param pModelfornecedor
    * @return int
    */
    public int salvarfornecedorController(Modelfornecedor pModelfornecedor){
        return this.daofornecedor.salvarfornecedorDAO(pModelfornecedor);
    }

    /**
    * recupera fornecedor
    * @param pId_fornecedor
    * @return Modelfornecedor
    */
    public Modelfornecedor getfornecedorController(int pId_fornecedor){
        return this.daofornecedor.getfornecedorDAO(pId_fornecedor);
    }
    
    public Modelfornecedor getFornecedorController(String pNome){
        return this.daofornecedor.getfornecedorDAO(pNome);
    }

    /**
    * recupera uma lista defornecedor
    * @param pId_fornecedor
    * @return ArrayList
    */
    public ArrayList<Modelfornecedor> getListafornecedorController(){
        return this.daofornecedor.getListafornecedorDAO();
    }

    /**
    * atualiza fornecedor
    * @param pModelfornecedor
    * @return boolean
    */
    public boolean atualizarfornecedorController(Modelfornecedor pModelfornecedor){
        return this.daofornecedor.atualizarfornecedorDAO(pModelfornecedor);
    }

    /**
    * exclui fornecedor
    * @param pId_fornecedor
    * @return boolean
    */
    public boolean excluirfornecedorController(int pId_fornecedor){
        return this.daofornecedor.excluirfornecedorDAO(pId_fornecedor);
    }
}