package controller;

import model.ModelEnergia;
import DAO.DAOenergia;
import java.util.ArrayList;

/**
*
* @author Gabriela Silva de Almeida
*/
public class Controllerenergia {

    private DAOenergia daoenergia = new DAOenergia();

    /**
    * grava energia
    * @param pModelenergia
    * @return int
    */
    public int salvarenergiaController(ModelEnergia pModelenergia){
        return this.daoenergia.salvarenergiaDAO(pModelenergia);
    }

    /**
    * recupera energia
    * @param pId_energia
    * @return Modelenergia
    */
    public ModelEnergia getenergiaController(int pId_energia){
        return this.daoenergia.getenergiaDAO(pId_energia);
    }
    
    public ModelEnergia getenergia1Controller(int date, int date1){
        return this.daoenergia.getenergia1DAO(date, date1);
    }

    /**
    * recupera uma lista deenergia
    * @param pId_energia
    * @return ArrayList
    */
    public ArrayList<ModelEnergia> getListaenergiaController(){
        return this.daoenergia.getListaenergiaDAO();
    }

    /**
    * atualiza energia
    * @param pModelenergia
    * @return boolean
    */
    public boolean atualizarenergiaController(ModelEnergia pModelenergia){
        return this.daoenergia.atualizarenergiaDAO(pModelenergia);
    }

    /**
    * exclui energia
    * @param pId_energia
    * @return boolean
    */
    public boolean excluirenergiaController(int pId_energia){
        return this.daoenergia.excluirenergiaDAO(pId_energia);
    }
}