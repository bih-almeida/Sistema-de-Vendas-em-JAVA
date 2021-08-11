package DAO;

import model.ModelAluguel;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Gabriela Silva de Almeida
*/
public class DAOAluguel extends ConexaoMySql {

    /**
    * grava Aluguel
    * @param pModelAluguel
    * @return int
    */
    public int salvarAluguelDAO(ModelAluguel pModelAluguel){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO  tbl_aluguel ("
                    + "id_aluguel,"
                    + "aluguel_mes,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_aluguel,"
                    + "juros_aluguel,"
                    + "teste1,"
                    + "teste2"
                + ") VALUES ("
                    + "'" + pModelAluguel.getId_aluguel() + "',"
                    + "'" + pModelAluguel.getMes_aluguel() + "',"
                    + "'" + pModelAluguel.getData_validade() + "',"
                    + "'" + pModelAluguel.getData_pagamento() + "',"
                    + "'" + pModelAluguel.getValor_aluguel() + "',"
                    + "'" + pModelAluguel.getJuros_aluguel() + "',"
                    + "'" + pModelAluguel.getTeste1() + "',"
                    + "'" + pModelAluguel.getTeste2() + "'"
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
    * recupera Aluguel
    * @param pId_aluguel
    * @return ModelAluguel
    */
    public ModelAluguel getAluguelDAO(int pId_aluguel){
        ModelAluguel modelAluguel = new ModelAluguel();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_aluguel,"
                    + "aluguel_mes,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_aluguel,"
                    + "juros_aluguel,"
                    + "teste1,"
                    + "teste2"
                 + " FROM"
                     + "  tbl_aluguel"
                 + " WHERE"
                     + " id_aluguel = '" + pId_aluguel + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelAluguel.setId_aluguel(this.getResultSet().getInt(1));
                modelAluguel.setMes_aluguel(this.getResultSet().getString(2));
                modelAluguel.setData_validade(this.getResultSet().getDate(3));
                modelAluguel.setData_pagamento(this.getResultSet().getDate(4));
                modelAluguel.setValor_aluguel(this.getResultSet().getFloat(5));
                modelAluguel.setJuros_aluguel(this.getResultSet().getFloat(6));
                modelAluguel.setTeste1(this.getResultSet().getString(7));
                modelAluguel.setTeste2(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelAluguel;
    }
    
    public ModelAluguel getAluguel1DAO(int date, int date1){
        ModelAluguel modelAluguel = new ModelAluguel();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    
                    + "SUM(valor_aluguel)"
                    
                 + " FROM"
                     + "  tbl_aluguel"
                 + " WHERE"
                     + " YEAR(data_pagamento) = '" + date + "' AND MONTH(data_pagamento) = '" + date1 + "'"
                + ";"
            );

            while(this.getResultSet().next()){
             //   modelAluguel.setId_aluguel(this.getResultSet().getInt(1));
             //   modelAluguel.setMes_aluguel(this.getResultSet().getString(2));
            //    modelAluguel.setData_validade(this.getResultSet().getDate(3));
            //    modelAluguel.setData_pagamento(this.getResultSet().getDate(4));
                modelAluguel.setValor_aluguel(this.getResultSet().getFloat(1));
            //    modelAluguel.setJuros_aluguel(this.getResultSet().getFloat(6));
            //    modelAluguel.setTeste1(this.getResultSet().getString(7));
            //    modelAluguel.setTeste2(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelAluguel;
    }

    /**
    * recupera uma lista de Aluguel
        * @return ArrayList
    */
    public ArrayList<ModelAluguel> getListaAluguelDAO(){
        ArrayList<ModelAluguel> listamodelAluguel = new ArrayList();
        ModelAluguel modelAluguel = new ModelAluguel();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_aluguel,"
                    + "aluguel_mes,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_aluguel,"
                    + "juros_aluguel,"
                    + "teste1,"
                    + "teste2"
                 + " FROM"
                     + "  tbl_aluguel"
                + ";"
            );

            while(this.getResultSet().next()){
                modelAluguel = new ModelAluguel();
                modelAluguel.setId_aluguel(this.getResultSet().getInt(1));
                modelAluguel.setMes_aluguel(this.getResultSet().getString(2));
                modelAluguel.setData_validade(this.getResultSet().getDate(3));
                modelAluguel.setData_pagamento(this.getResultSet().getDate(4));
                modelAluguel.setValor_aluguel(this.getResultSet().getFloat(5));
                modelAluguel.setJuros_aluguel(this.getResultSet().getFloat(6));
                modelAluguel.setTeste1(this.getResultSet().getString(7));
                modelAluguel.setTeste2(this.getResultSet().getString(8));
                listamodelAluguel.add(modelAluguel);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelAluguel;
    }

    /**
    * atualiza Aluguel
    * @param pModelAluguel
    * @return boolean
    */
    public boolean atualizarAluguelDAO(ModelAluguel pModelAluguel){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE  tbl_aluguel SET "
                    + "id_aluguel = '" + pModelAluguel.getId_aluguel() + "',"
                    + "aluguel_mes = '" + pModelAluguel.getMes_aluguel() + "',"
                    + "data_validade = '" + pModelAluguel.getData_validade() + "',"
                    + "data_pagamento = '" + pModelAluguel.getData_pagamento() + "',"
                    + "valor_aluguel = '" + pModelAluguel.getValor_aluguel() + "',"
                    + "juros_aluguel = '" + pModelAluguel.getJuros_aluguel() + "',"
                    + "teste1 = '" + pModelAluguel.getTeste1() + "',"
                    + "teste2 = '" + pModelAluguel.getTeste2() + "'"
                + " WHERE "
                    + "id_aluguel = '" + pModelAluguel.getId_aluguel() + "'"
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
    * exclui Aluguel
    * @param pId_aluguel
    * @return boolean
    */
    public boolean excluirAluguelDAO(int pId_aluguel){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM  tbl_aluguel "
                + " WHERE "
                    + "id_aluguel = '" + pId_aluguel + "'"
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