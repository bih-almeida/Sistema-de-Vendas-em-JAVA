package DAO;

import model.ModelAgua;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Gabriela Silva de Almeida
*/
public class DAOAgua extends ConexaoMySql {

    /**
    * grava Agua
    * @param pModelAgua
    * @return int
    */
    public int salvarAguaDAO(ModelAgua pModelAgua){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO  tbl_agua ("
                 //   + "id_agua,"
                    + "mes_agua,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_agua,"
                    + "juros_agua,"
                    + "teste1,"
                    + "teste2"
                + ") VALUES ("
                 //   + "'" + pModelAgua.getId_agua() + "',"
                    + "'" + pModelAgua.getMes_agua()+ "',"
                    + "'" + pModelAgua.getData_validade() + "',"
                    + "'" + pModelAgua.getData_pagamento() + "',"
                    + "'" + pModelAgua.getValor_agua()+ "',"
                    + "'" + pModelAgua.getJuros_agua()+ "',"
                    + "'" + pModelAgua.getTeste1() + "',"
                    + "'" + pModelAgua.getTeste2() + "'"
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
    * recupera Agua
    * @param pId_energia
    * @return ModelAgua
    */
    public ModelAgua getAguaDAO(int pId_agua){
        ModelAgua modelAgua = new ModelAgua();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_agua,"
                    + "mes_agua,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_agua,"
                    + "juros_agua,"
                    + "teste1,"
                    + "teste2"
                 + " FROM"
                     + "  tbl_agua"
                 + " WHERE"
                     + " id_agua = '" + pId_agua + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelAgua.setId_agua(this.getResultSet().getInt(1));
                modelAgua.setMes_agua(this.getResultSet().getString(2));
                modelAgua.setData_validade(this.getResultSet().getDate(3));
                modelAgua.setData_pagamento(this.getResultSet().getDate(4));
                modelAgua.setValor_agua(this.getResultSet().getFloat(5));
                modelAgua.setJuros_agua(this.getResultSet().getFloat(6));
                modelAgua.setTeste1(this.getResultSet().getString(7));
                modelAgua.setTeste2(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelAgua;
    }
    
    public ModelAgua getAgua1DAO(int date, int date1){
        ModelAgua modelAgua = new ModelAgua();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                 
                    + "SUM(valor_agua)"
               
                 + " FROM"
                     + " tbl_agua"
                 + " WHERE"
                  + " YEAR(data_pagamento) = '" + date + "' AND MONTH(data_pagamento) = '" + date1 + "'"           
               
            );

            while(this.getResultSet().next()){
               
             //  modelAgua.setData_pagamento(this.getResultSet().getDate(1));
               modelAgua.setValor_agua(this.getResultSet().getFloat(1));
              
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelAgua;
    }

    /**
    * recupera uma lista de Agua
        * @return ArrayList
    */
    public ArrayList<ModelAgua> getListaAguaDAO(){
        ArrayList<ModelAgua> listamodelAgua = new ArrayList();
        ModelAgua modelAgua = new ModelAgua();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_agua,"
                    + "mes_agua,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_agua,"
                    + "juros_agua,"
                    + "teste1,"
                    + "teste2"
                 + " FROM"
                     + " tbl_agua"
                + ";"
            );

            while(this.getResultSet().next()){
                modelAgua = new ModelAgua();
                modelAgua.setId_agua(this.getResultSet().getInt(1));
                modelAgua.setMes_agua(this.getResultSet().getString(2));
                modelAgua.setData_validade(this.getResultSet().getDate(3));
                modelAgua.setData_pagamento(this.getResultSet().getDate(4));
                modelAgua.setValor_agua(this.getResultSet().getFloat(5));
                modelAgua.setJuros_agua(this.getResultSet().getFloat(6));
                modelAgua.setTeste1(this.getResultSet().getString(7));
                modelAgua.setTeste2(this.getResultSet().getString(8));
                listamodelAgua.add(modelAgua);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelAgua;
    }

    /**
    * atualiza Agua
    * @param pModelAgua
    * @return boolean
    */
    public boolean atualizarAguaDAO(ModelAgua pModelAgua){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE  tbl_agua SET "
                    + "id_agua = '" + pModelAgua.getId_agua()+ "',"
                    + "mes_agua = '" + pModelAgua.getMes_agua()+ "',"
                    + "data_validade = '" + pModelAgua.getData_validade() + "',"
                    + "data_pagamento = '" + pModelAgua.getData_pagamento() + "',"
                    + "valor_agua = '" + pModelAgua.getValor_agua()+ "',"
                    + "juros_agua = '" + pModelAgua.getJuros_agua()+ "',"
                    + "teste1 = '" + pModelAgua.getTeste1() + "',"
                    + "teste2 = '" + pModelAgua.getTeste2() + "'"
                + " WHERE "
                    + "id_agua = '" + pModelAgua.getId_agua()+ "'"
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
    * exclui Agua
    * @param pId_energia
    * @return boolean
    */
    public boolean excluirAguaDAO(int pId_energia){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM  tbl_agua "
                + " WHERE "
                    + "id_agua = '" + pId_energia + "'"
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