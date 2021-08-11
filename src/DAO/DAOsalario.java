package DAO;

import model.ModelSalario;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Gabriela Silva de Almeida
*/
public class DAOsalario extends ConexaoMySql {

    /**
    * grava salario
    * @param pModelsalario
    * @return int
    */
    public int salvarsalarioDAO(ModelSalario pModelsalario){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO  tbl_salario ("
                   // + "pk_id_salario,"
                    + "fk_funcionario,"
                    + "total_salario_mes,"
                  //  + "data_validade,"
                    + "data_pagamento,"
                    + "valor_salario_hora,"
                    + "he_50,"
                    + "he_100,"
                    + "teste1,"
                    + "teste2"
                + ") VALUES ("
                  //  + "'" + pModelsalario.getId_salario() + "',"
                    + "'" + pModelsalario.getFk_funcionario() + "',"
                    + "'" + pModelsalario.getTotal_salario_mes() + "',"
                 //   + "'" + pModelsalario.getData_validade() + "',"
                    + "'" + pModelsalario.getData_pagamento() + "',"
                    + "'" + pModelsalario.getValor_salario_hora() + "',"
                    + "'" + pModelsalario.getHe_50() + "',"
                    + "'" + pModelsalario.getHe_100() + "',"
                    + "'" + pModelsalario.getTeste1() + "',"
                    + "'" + pModelsalario.getTeste2() + "'"
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
    * recupera salario
    * @param pId_salario
    * @return Modelsalario
    */
    public ModelSalario getsalarioDAO(int pId_salario){
        ModelSalario modelsalario = new ModelSalario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_salario,"
                    + "fk_funcionario,"
                    + "total_salario_mes,"
                  //  + "data_validade,"
                    + "data_pagamento,"
                    + "valor_salario_hora,"
                    + "he_50,"
                    + "he_100,"
                    + "teste1,"
                    + "teste2"
                 + " FROM"
                     + "  tbl_salario"
                 + " WHERE"
                     + " id_salario = '" + pId_salario + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelsalario.setId_salario(this.getResultSet().getInt(1));
                modelsalario.setFk_funcionario(this.getResultSet().getString(2));
                modelsalario.setTotal_salario_mes(this.getResultSet().getFloat(3));
               // modelsalario.setData_validade(this.getResultSet().getDate(4));
                modelsalario.setData_pagamento(this.getResultSet().getDate(4));
                modelsalario.setValor_salario_hora(this.getResultSet().getFloat(5));
                modelsalario.setHe_50(this.getResultSet().getString(6));
                modelsalario.setHe_100(this.getResultSet().getString(7));
                modelsalario.setTeste1(this.getResultSet().getString(8));
                modelsalario.setTeste2(this.getResultSet().getString(9));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelsalario;
    }
    
    public ModelSalario getsalario1DAO(int date, int date1){
        ModelSalario modelsalario = new ModelSalario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    
                    + "sum(total_salario_mes)"
                   
                 + " FROM"
                     + "  tbl_salario"
                 + " WHERE"
                     + " YEAR(data_pagamento) = '" + date + "' AND MONTH(data_pagamento) = '" + date1 + "'"
              
            );

            while(this.getResultSet().next()){
                
                modelsalario.setTotal_salario_mes(this.getResultSet().getFloat(1));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelsalario;
    }

    /**
    * recupera uma lista de salario
        * @return ArrayList
    */
    public ArrayList<ModelSalario> getListasalarioDAO(){
        ArrayList<ModelSalario> listamodelsalario = new ArrayList();
        ModelSalario modelsalario = new ModelSalario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_salario,"
                    + "fk_funcionario,"
                    + "total_salario_mes,"
                  //  + "data_validade,"
                    + "data_pagamento,"
                    + "valor_salario_hora,"
                    + "he_50,"
                    + "he_100,"
                    + "teste1,"
                    + "teste2"
                 + " FROM"
                     + "  tbl_salario"
                + ";"
            );

            while(this.getResultSet().next()){
                modelsalario = new ModelSalario();
                modelsalario.setId_salario(this.getResultSet().getInt(1));
                modelsalario.setFk_funcionario(this.getResultSet().getString(2));
                modelsalario.setTotal_salario_mes(this.getResultSet().getFloat(3));
                //modelsalario.setData_validade(this.getResultSet().getDate(4));
                modelsalario.setData_pagamento(this.getResultSet().getDate(4));
                modelsalario.setValor_salario_hora(this.getResultSet().getFloat(5));
                modelsalario.setHe_50(this.getResultSet().getString(6));
                modelsalario.setHe_100(this.getResultSet().getString(7));
                modelsalario.setTeste1(this.getResultSet().getString(8));
                modelsalario.setTeste2(this.getResultSet().getString(9));
                listamodelsalario.add(modelsalario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelsalario;
    }

    /**
    * atualiza salario
    * @param pModelsalario
    * @return boolean
    */
    public boolean atualizarsalarioDAO(ModelSalario pModelsalario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE  tbl_salario SET "
                    + "id_salario = '" + pModelsalario.getId_salario() + "',"
                    + "fk_funcionario = '" + pModelsalario.getFk_funcionario() + "',"
                    + "total_salario_mes = '" + pModelsalario.getTotal_salario_mes() + "',"
                 //   + "data_validade = '" + pModelsalario.getData_validade() + "',"
                    + "data_pagamento = '" + pModelsalario.getData_pagamento() + "',"
                    + "valor_salario_hora = '" + pModelsalario.getValor_salario_hora() + "',"
                    + "he_50 = '" + pModelsalario.getHe_50() + "',"
                    + "he_100 = '" + pModelsalario.getHe_100() + "',"
                    + "teste1 = '" + pModelsalario.getTeste1() + "',"
                    + "teste2 = '" + pModelsalario.getTeste2()+ "'"
                + " WHERE "
                    + "id_salario = '" + pModelsalario.getId_salario() + "'"
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
    * exclui salario
    * @param pId_salario
    * @return boolean
    */
    public boolean excluirsalarioDAO(int pId_salario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM  tbl_salario "
                + " WHERE "
                    + "id_salario = '" + pId_salario + "'"
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