package controller;

import model.ModelSalario;
import DAO.DAOsalario;
import java.util.ArrayList;

/**
*
* @author Gabriela Silva de Almeida
*/
public class Controllersalario {

    private DAOsalario daosalario = new DAOsalario();

    /**
    * grava salario
    * @param pModelsalario
    * @return int
    */
    public int salvarsalarioController(ModelSalario pModelsalario){
        return this.daosalario.salvarsalarioDAO(pModelsalario);
    }

    /**
    * recupera salario
    * @param pId_salario
    * @return Modelsalario
    */
    public ModelSalario getsalarioController(int pId_salario){
        return this.daosalario.getsalarioDAO(pId_salario);
    }
    
    public ModelSalario getsalario1Controller(int date, int date1){
        return this.daosalario.getsalario1DAO(date, date1);
    }

    /**
    * recupera uma lista desalario
    * @param pId_salario
    * @return ArrayList
    */
    public ArrayList<ModelSalario> getListasalarioController(){
        return this.daosalario.getListasalarioDAO();
    }

    /**
    * atualiza salario
    * @param pModelsalario
    * @return boolean
    */
    public boolean atualizarsalarioController(ModelSalario pModelsalario){
        return this.daosalario.atualizarsalarioDAO(pModelsalario);
    }

    /**
    * exclui salario
    * @param pId_salario
    * @return boolean
    */
    public boolean excluirsalarioController(int pId_salario){
        return this.daosalario.excluirsalarioDAO(pId_salario);
    }
}