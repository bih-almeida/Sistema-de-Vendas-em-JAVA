package controller;

import model.ModelPromocao;
import DAO.DAOpromocao;
import java.util.ArrayList;

/**
*
* @author Gabriela Silva de Almeida
*/
public class ControllerPromocao {

    private DAOpromocao daopromocao = new DAOpromocao();

    /**
    * grava promocao
    * @param pModelpromocao
    * @return int
    */
    public int salvarpromocaoController(ModelPromocao pModelpromocao){
        return this.daopromocao.salvarpromocaoDAO(pModelpromocao);
    }

    /**
    * recupera promocao
    * @param pId_promocao
    * @return Modelpromocao
    */
    public ModelPromocao getpromocaoController(int pId_promocao){
        return this.daopromocao.getpromocaoDAO(pId_promocao);
    }

    /**
    * recupera uma lista depromocao
    * @param pId_promocao
    * @return ArrayList
    */
    public ArrayList<ModelPromocao> getListapromocaoController(){
        return this.daopromocao.getListapromocaoDAO();
    }

    /**
    * atualiza promocao
    * @param pModelpromocao
    * @return boolean
    */
    public boolean atualizarpromocaoController(ModelPromocao pModelpromocao){
        return this.daopromocao.atualizarpromocaoDAO(pModelpromocao);
    }

    /**
    * exclui promocao
    * @param pId_promocao
    * @return boolean
    */
    public boolean excluirpromocaoController(int pId_promocao){
        return this.daopromocao.excluirpromocaoDAO(pId_promocao);
    }
}