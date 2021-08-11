package controller;

import model.ModelAluguel;
import DAO.DAOAluguel;
import java.util.ArrayList;

/**
*
* @author Gabriela Silva de Almeida
*/
public class ControllerAluguel {

    private DAOAluguel daoAluguel = new DAOAluguel();

    /**
    * grava Aluguel
    * @param pModelAluguel
    * @return int
    */
    public int salvarAluguelController(ModelAluguel pModelAluguel){
        return this.daoAluguel.salvarAluguelDAO(pModelAluguel);
    }

    /**
    * recupera Aluguel
    * @param pId_aluguel
    * @return ModelAluguel
    */
    public ModelAluguel getAluguelController(int pId_aluguel){
        return this.daoAluguel.getAluguelDAO(pId_aluguel);
    }
    
    public ModelAluguel getAluguel1Controller(int data, int data1){
        return this.daoAluguel.getAluguel1DAO(data, data1);
    }


    /**
    * recupera uma lista deAluguel
    * @param pId_aluguel
    * @return ArrayList
    */
    public ArrayList<ModelAluguel> getListaAluguelController(){
        return this.daoAluguel.getListaAluguelDAO();
    }

    /**
    * atualiza Aluguel
    * @param pModelAluguel
    * @return boolean
    */
    public boolean atualizarAluguelController(ModelAluguel pModelAluguel){
        return this.daoAluguel.atualizarAluguelDAO(pModelAluguel);
    }

    /**
    * exclui Aluguel
    * @param pId_aluguel
    * @return boolean
    */
    public boolean excluirAluguelController(int pId_aluguel){
        return this.daoAluguel.excluirAluguelDAO(pId_aluguel);
    }
}