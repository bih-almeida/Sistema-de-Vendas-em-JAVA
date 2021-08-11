package controller;

import model.ModelExtras;
import DAO.DAOextras;
import java.util.ArrayList;

/**
*
* @author Gabriela Silva de Almeida
*/
public class Controllerextras {

    private DAOextras daoextras = new DAOextras();

    /**
    * grava extras
    * @param pModelextras
    * @return int
    */
    public int salvarextrasController(ModelExtras pModelextras){
        return this.daoextras.salvarextrasDAO(pModelextras);
    }

    /**
    * recupera extras
    * @param pId_extras
    * @return Modelextras
    */
    public ModelExtras getextrasController(int pId_extras){
        return this.daoextras.getextrasDAO(pId_extras);
    }
    
    public ModelExtras getextras1Controller(int data, int data1){
        return this.daoextras.getextras1DAO(data, data1);
    }

    /**
    * recupera uma lista deextras
    * @param pId_extras
    * @return ArrayList
    */
    public ArrayList<ModelExtras> getListaextrasController(){
        return this.daoextras.getListaextrasDAO();
    }

    /**
    * atualiza extras
    * @param pModelextras
    * @return boolean
    */
    public boolean atualizarextrasController(ModelExtras pModelextras){
        return this.daoextras.atualizarextrasDAO(pModelextras);
    }

    /**
    * exclui extras
    * @param pId_extras
    * @return boolean
    */
    public boolean excluirextrasController(int pId_extras){
        return this.daoextras.excluirextrasDAO(pId_extras);
    }
}