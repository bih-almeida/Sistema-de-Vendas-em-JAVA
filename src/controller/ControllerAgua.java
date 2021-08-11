package controller;

import model.ModelAgua;
import DAO.DAOAgua;
import java.util.ArrayList;

/**
*
* @author Gabriela Silva de Almeida
*/
public class ControllerAgua {

    private DAOAgua daoAgua = new DAOAgua();

    /**
    * grava Agua
    * @param pModelAgua
    * @return int
    */
    public int salvarAguaController(ModelAgua pModelAgua){
        return this.daoAgua.salvarAguaDAO(pModelAgua);
    }

    /**
    * recupera Agua
    * @param pId_energia
    * @return ModelAgua
    */
    public ModelAgua getAguaController(int pId_energia){
        return this.daoAgua.getAguaDAO(pId_energia);
    }

    public ModelAgua getAgua1Controller(int date, int date1){
        return this.daoAgua.getAgua1DAO(date, date1);
    }
    /**
    * recupera uma lista deAgua
    * @param pId_energia
    * @return ArrayList
    */
    public ArrayList<ModelAgua> getListaAguaController(){
        return this.daoAgua.getListaAguaDAO();
    }

    /**
    * atualiza Agua
    * @param pModelAgua
    * @return boolean
    */
    public boolean atualizarAguaController(ModelAgua pModelAgua){
        return this.daoAgua.atualizarAguaDAO(pModelAgua);
    }

    /**
    * exclui Agua
    * @param pId_energia
    * @return boolean
    */
    public boolean excluirAguaController(int pId_energia){
        return this.daoAgua.excluirAguaDAO(pId_energia);
    }
}