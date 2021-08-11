package DAO;

import model.Modeldespesas;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Gabriela Silva de Almeida
*/
public class DAOdespesas extends ConexaoMySql {

    /**
    * grava despesas
    * @param pModeldespesas
    * @return int
    */
    public int salvardespesasDAO(Modeldespesas pModeldespesas){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO  tbl_despesas ("
                    + "pk_id_despesas,"
                    + "extras_despesas,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_despesas,"
                    + "juros_despesas,"
                    + "teste_1,"
                    + "teste_2"
                + ") VALUES ("
                    + "'" + pModeldespesas.getId_despesas() + "',"
                    + "'" + pModeldespesas.getExtras_despesas() + "',"
                    + "'" + pModeldespesas.getData_validade() + "',"
                    + "'" + pModeldespesas.getData_pagamento() + "',"
                    + "'" + pModeldespesas.getValor_despesas() + "',"
                    + "'" + pModeldespesas.getJuros_despesas() + "',"
                    + "'" + pModeldespesas.getTeste1() + "',"
                    + "'" + pModeldespesas.getTeste2() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera despesas
    * @param pId_despesas
    * @return Modeldespesas
    */
    public Modeldespesas getdespesasDAO(int pId_despesas){
        Modeldespesas modeldespesas = new Modeldespesas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_despesas,"
                    + "extras_despesas,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_despesas,"
                    + "juros_despesas,"
                    + "teste_1,"
                    + "teste_2"
                 + " FROM"
                     + "  tbl_despesas"
                 + " WHERE"
                     + " pk_id_despesas = '" + pId_despesas + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modeldespesas.setId_despesas(this.getResultSet().getInt(1));
                modeldespesas.setExtras_despesas(this.getResultSet().getInt(2));
                modeldespesas.setData_validade(this.getResultSet().getDate(3));
                modeldespesas.setData_pagamento(this.getResultSet().getDate(4));
                modeldespesas.setValor_despesas(this.getResultSet().getFloat(5));
                modeldespesas.setJuros_despesas(this.getResultSet().getFloat(6));
                modeldespesas.setTeste1(this.getResultSet().getString(7));
                modeldespesas.setTeste2(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modeldespesas;
    }

    /**
    * recupera uma lista de despesas
        * @return ArrayList
    */
    public ArrayList<Modeldespesas> getListadespesasDAO(){
        ArrayList<Modeldespesas> listamodeldespesas = new ArrayList();
        Modeldespesas modeldespesas = new Modeldespesas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_despesas,"
                    + "extras_despesas,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_despesas,"
                    + "juros_despesas,"
                    + "teste_1,"
                    + "teste_2"
                 + " FROM"
                     + "  tbl_despesas"
                + ";"
            );

            while(this.getResultSet().next()){
                modeldespesas = new Modeldespesas();
                modeldespesas.setId_despesas(this.getResultSet().getInt(1));
                modeldespesas.setExtras_despesas(this.getResultSet().getInt(2));
                modeldespesas.setData_validade(this.getResultSet().getDate(3));
                modeldespesas.setData_pagamento(this.getResultSet().getDate(4));
                modeldespesas.setValor_despesas(this.getResultSet().getFloat(5));
                modeldespesas.setJuros_despesas(this.getResultSet().getFloat(6));
                modeldespesas.setTeste1(this.getResultSet().getString(7));
                modeldespesas.setTeste2(this.getResultSet().getString(8));
                listamodeldespesas.add(modeldespesas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodeldespesas;
    }

    /**
    * atualiza despesas
    * @param pModeldespesas
    * @return boolean
    */
    public boolean atualizardespesasDAO(Modeldespesas pModeldespesas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE  tbl_despesas SET "
                    + "pk_id_despesas = '" + pModeldespesas.getId_despesas() + "',"
                    + "extras_despesas = '" + pModeldespesas.getExtras_despesas() + "',"
                    + "data_validade = '" + pModeldespesas.getData_validade() + "',"
                    + "data_pagamento = '" + pModeldespesas.getData_pagamento() + "',"
                    + "valor_despesas = '" + pModeldespesas.getValor_despesas() + "',"
                    + "juros_despesas = '" + pModeldespesas.getJuros_despesas() + "',"
                    + "teste_1 = '" + pModeldespesas.getTeste1() + "',"
                    + "teste_2 = '" + pModeldespesas.getTeste2() + "'"
                + " WHERE "
                    + "pk_id_despesas = '" + pModeldespesas.getId_despesas() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui despesas
    * @param pId_despesas
    * @return boolean
    */
    public boolean excluirdespesasDAO(int pId_despesas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM  tbl_despesas "
                + " WHERE "
                    + "pk_id_despesas = '" + pId_despesas + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}