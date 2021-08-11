package controller;

import model.Modeldespesas;
import DAO.DAOdespesas;
import java.util.ArrayList;

/**
*
* @author Gabriela Silva de Almeida
*/
public class Controllerdespesas {

    private DAOdespesas daodespesas = new DAOdespesas();

    /**
    * grava despesas
    * @param pModeldespesas
    * @return int
    */
    public int salvardespesasController(Modeldespesas pModeldespesas){
        return this.daodespesas.salvardespesasDAO(pModeldespesas);
    }

    /**
    * recupera despesas
    * @param pId_despesas
    * @return Modeldespesas
    */
    public Modeldespesas getdespesasController(int pId_despesas){
        return this.daodespesas.getdespesasDAO(pId_despesas);
    }

    /**
    * recupera uma lista dedespesas
    * @param pId_despesas
    * @return ArrayList
    */
    public ArrayList<Modeldespesas> getListadespesasController(){
        return this.daodespesas.getListadespesasDAO();
    }

    /**
    * atualiza despesas
    * @param pModeldespesas
    * @return boolean
    */
    public boolean atualizardespesasController(Modeldespesas pModeldespesas){
        return this.daodespesas.atualizardespesasDAO(pModeldespesas);
    }

    /**
    * exclui despesas
    * @param pId_despesas
    * @return boolean
    */
    public boolean excluirdespesasController(int pId_despesas){
        return this.daodespesas.excluirdespesasDAO(pId_despesas);
    }
}