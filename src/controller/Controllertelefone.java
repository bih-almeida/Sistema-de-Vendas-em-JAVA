package controller;

import model.ModelTelefone;
import DAO.DAOtelefone;
import java.util.ArrayList;

/**
*
* @author Gabriela Silva de Almeida
*/
public class Controllertelefone {

    private DAOtelefone daotelefone = new DAOtelefone();

    /**
    * grava telefone
    * @param pModeltelefone
    * @return int
    */
    public int salvartelefoneController(ModelTelefone pModeltelefone){
        return this.daotelefone.salvartelefoneDAO(pModeltelefone);
    }

    /**
    * recupera telefone
    * @param pId_telefone
    * @return Modeltelefone
    */
    public ModelTelefone gettelefoneController(int pId_telefone){
        return this.daotelefone.gettelefoneDAO(pId_telefone);
    }
    
    public ModelTelefone gettelefone1Controller(int date1, int date2){
        return this.daotelefone.gettelefone1DAO(date1, date2);
    }
    /**
    * recupera uma lista detelefone
    * @param pId_telefone
    * @return ArrayList
    */
    public ArrayList<ModelTelefone> getListatelefoneController(){
        return this.daotelefone.getListatelefoneDAO();
    }

    /**
    * atualiza telefone
    * @param pModeltelefone
    * @return boolean
    */
    public boolean atualizartelefoneController(ModelTelefone pModeltelefone){
        return this.daotelefone.atualizartelefoneDAO(pModeltelefone);
    }

    /**
    * exclui telefone
    * @param pId_telefone
    * @return boolean
    */
    public boolean excluirtelefoneController(int pId_telefone){
        return this.daotelefone.excluirtelefoneDAO(pId_telefone);
    }
}