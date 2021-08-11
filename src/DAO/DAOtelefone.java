package DAO;

import model.ModelTelefone;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Gabriela Silva de Almeida
*/
public class DAOtelefone extends ConexaoMySql {

    /**
    * grava telefone
    * @param pModeltelefone
    * @return int
    */
    public int salvartelefoneDAO(ModelTelefone pModeltelefone){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO  tbl_telefone ("
                  //  + "id_telefone,"
                    + "telefone_mes,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_telefone,"
                    + "juros_telefone,"
                    + "teste1,"
                    + "teste2"
                + ") VALUES ("
                //    + "'" + pModeltelefone.getId_telefone() + "',"
                    + "'" + pModeltelefone.getMes_telefone() + "',"
                    + "'" + pModeltelefone.getData_validade() + "',"
                    + "'" + pModeltelefone.getData_pagamento() + "',"
                    + "'" + pModeltelefone.getValor_telefone() + "',"
                    + "'" + pModeltelefone.getJuros_telefone() + "',"
                    + "'" + pModeltelefone.getTeste1() + "',"
                    + "'" + pModeltelefone.getTeste2() + "'"
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
    * recupera telefone
    * @param pId_telefone
    * @return Modeltelefone
    */
    public ModelTelefone gettelefoneDAO(int pId_telefone){
        ModelTelefone modeltelefone = new ModelTelefone();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_telefone,"
                    + "telefone_mes,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_telefone,"
                    + "juros_telefone,"
                    + "teste1,"
                    + "teste2"
                 + " FROM"
                     + "  tbl_telefone"
                 + " WHERE"
                     + " id_telefone = '" + pId_telefone + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modeltelefone.setId_telefone(this.getResultSet().getInt(1));
                modeltelefone.setMes_telefone(this.getResultSet().getString(2));
                modeltelefone.setData_validade(this.getResultSet().getDate(3));
                modeltelefone.setData_pagamento(this.getResultSet().getDate(4));
                modeltelefone.setValor_telefone(this.getResultSet().getFloat(5));
                modeltelefone.setJuros_telefone(this.getResultSet().getFloat(6));
                modeltelefone.setTeste1(this.getResultSet().getString(7));
                modeltelefone.setTeste2(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modeltelefone;
    }
    
    public ModelTelefone gettelefone1DAO(int date, int date1){
        ModelTelefone modeltelefone = new ModelTelefone();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                 //   + "pk_id_telefone,"
                  //  + "mes_telefone,"
                  //  + "data_validade,"
                  //  + "data_pagamento,"
                    + "SUM(valor_telefone)"
                  //  + "juros_telefone,"
                  //  + "teste_1,"
                  //  + "teste_2"
                 + " FROM"
                     + "  tbl_telefone"
                 + " WHERE"
                     + " YEAR(data_pagamento) = '" + date + "' AND MONTH(data_pagamento) = '" + date1 + "'"
                + ";"
            );

            while(this.getResultSet().next()){
               // modeltelefone.setId_telefone(this.getResultSet().getInt(1));
             //   modeltelefone.setMes_telefone(this.getResultSet().getString(2));
             //   modeltelefone.setData_validade(this.getResultSet().getDate(3));
             //   modeltelefone.setData_pagamento(this.getResultSet().getDate(4));
                modeltelefone.setValor_telefone(this.getResultSet().getFloat(1));
            //    modeltelefone.setJuros_telefone(this.getResultSet().getFloat(6));
            //    modeltelefone.setTeste1(this.getResultSet().getString(7));
            //    modeltelefone.setTeste2(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modeltelefone;
    }

    /**
    * recupera uma lista de telefone
        * @return ArrayList
    */
    public ArrayList<ModelTelefone> getListatelefoneDAO(){
        ArrayList<ModelTelefone> listamodeltelefone = new ArrayList();
        ModelTelefone modeltelefone = new ModelTelefone();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_telefone,"
                    + "telefone_mes,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_telefone,"
                    + "juros_telefone,"
                    + "teste1,"
                    + "teste2"
                 + " FROM"
                     + "  tbl_telefone"
                + ";"
            );

            while(this.getResultSet().next()){
                modeltelefone = new ModelTelefone();
                modeltelefone.setId_telefone(this.getResultSet().getInt(1));
                modeltelefone.setMes_telefone(this.getResultSet().getString(2));
                modeltelefone.setData_validade(this.getResultSet().getDate(3));
                modeltelefone.setData_pagamento(this.getResultSet().getDate(4));
                modeltelefone.setValor_telefone(this.getResultSet().getFloat(5));
                modeltelefone.setJuros_telefone(this.getResultSet().getFloat(6));
                modeltelefone.setTeste1(this.getResultSet().getString(7));
                modeltelefone.setTeste2(this.getResultSet().getString(8));
                listamodeltelefone.add(modeltelefone);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodeltelefone;
    }

    /**
    * atualiza telefone
    * @param pModeltelefone
    * @return boolean
    */
    public boolean atualizartelefoneDAO(ModelTelefone pModeltelefone){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE  tbl_telefone SET "
                    + "id_telefone = '" + pModeltelefone.getId_telefone() + "',"
                    + "telefone_mes = '" + pModeltelefone.getMes_telefone() + "',"
                    + "data_validade = '" + pModeltelefone.getData_validade() + "',"
                    + "data_pagamento = '" + pModeltelefone.getData_pagamento() + "',"
                    + "valor_telefone = '" + pModeltelefone.getValor_telefone() + "',"
                    + "juros_telefone = '" + pModeltelefone.getJuros_telefone() + "',"
                    + "teste1 = '" + pModeltelefone.getTeste1() + "',"
                    + "teste2 = '" + pModeltelefone.getTeste2() + "'"
                + " WHERE "
                    + "id_telefone = '" + pModeltelefone.getId_telefone() + "'"
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
    * exclui telefone
    * @param pId_telefone
    * @return boolean
    */
    public boolean excluirtelefoneDAO(int pId_telefone){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM  tbl_telefone "
                + " WHERE "
                    + "id_telefone = '" + pId_telefone + "'"
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