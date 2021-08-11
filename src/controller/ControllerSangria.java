package controller;

import model.ModelSangria;
import DAO.DAOSangria;
import java.util.ArrayList;

/**
*
* @author Gabriela Silva de Almeida
*/
public class ControllerSangria {

    private DAOSangria daoSangria = new DAOSangria();

    /**
    * grava Sangria
    * @param pModelSangria
    * @return int
    */
    public int salvarSangriaController(ModelSangria pModelSangria){
        return this.daoSangria.salvarSangriaDAO(pModelSangria);
    }

    /**
    * recupera Sangria
    * @param pPk_sangria
    * @return ModelSangria
    */
    public ModelSangria getSangriaController(int pPk_sangria){
        return this.daoSangria.getSangriaDAO(pPk_sangria);
    }

    /**
    * recupera uma lista deSangria
    * @param pPk_sangria
    * @return ArrayList
    */
    public ArrayList<ModelSangria> getListaSangriaController(){
        return this.daoSangria.getListaSangriaDAO();
    }

    /**
    * atualiza Sangria
    * @param pModelSangria
    * @return boolean
    */
    public boolean atualizarSangriaController(ModelSangria pModelSangria){
        return this.daoSangria.atualizarSangriaDAO(pModelSangria);
    }

    /**
    * exclui Sangria
    * @param pPk_sangria
    * @return boolean
    */
    public boolean excluirSangriaController(int pPk_sangria){
        return this.daoSangria.excluirSangriaDAO(pPk_sangria);
    }
}