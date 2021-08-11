package DAO;

import model.ModelEnergia;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Gabriela Silva de Almeida
*/
public class DAOenergia extends ConexaoMySql {

    /**
    * grava energia
    * @param pModelenergia
    * @return int
    */
    public int salvarenergiaDAO(ModelEnergia pModelenergia){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO  tbl_energia ("
                    + "id_energia,"
                    + "energia_mes,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_energia,"
                    + "juros_energia,"
                    + "teste1,"
                    + "teste2"
                + ") VALUES ("
                    + "'" + pModelenergia.getId_energia() + "',"
                    + "'" + pModelenergia.getMes_energia() + "',"
                    + "'" + pModelenergia.getData_validade() + "',"
                    + "'" + pModelenergia.getData_pagamento() + "',"
                    + "'" + pModelenergia.getValor_energia() + "',"
                    + "'" + pModelenergia.getJuros_energia() + "',"
                    + "'" + pModelenergia.getTeste1() + "',"
                    + "'" + pModelenergia.getTeste2() + "'"
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
    * recupera energia
    * @param pId_energia
    * @return Modelenergia
    */
    public ModelEnergia getenergiaDAO(int pId_energia){
        ModelEnergia modelenergia = new ModelEnergia();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_energia,"
                    + "energia_mes,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_energia,"
                    + "juros_energia,"
                    + "teste1,"
                    + "teste2"
                 + " FROM"
                     + "  tbl_energia"
                 + " WHERE"
                     + " id_energia = '" + pId_energia + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelenergia.setId_energia(this.getResultSet().getInt(1));
                modelenergia.setMes_energia(this.getResultSet().getString(2));
                modelenergia.setData_validade(this.getResultSet().getDate(3));
                modelenergia.setData_pagamento(this.getResultSet().getDate(4));
                modelenergia.setValor_energia(this.getResultSet().getFloat(5));
                modelenergia.setJuros_energia(this.getResultSet().getFloat(6));
                modelenergia.setTeste1(this.getResultSet().getString(7));
                modelenergia.setTeste2(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelenergia;
    }
    
    public ModelEnergia getenergia1DAO(int date, int date1){
        ModelEnergia modelenergia = new ModelEnergia();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                  //  + "pk_id_energia,"
                  //  + "mes_energia,"
                 //   + "data_validade,"
                //    + "data_pagamento,"
                    + "SUM(valor_energia)"
               //     + "juros_energia,"
               //     + "teste_1,"
              //      + "teste_2"
                 + " FROM"
                     + "  tbl_energia"
                 + " WHERE"
                     + " YEAR(data_pagamento) = '" + date + "' AND MONTH(data_pagamento) = '" + date1 + "'" 
                + ";"
            );

            while(this.getResultSet().next()){
             //   modelenergia.setId_energia(this.getResultSet().getInt(1));
             //   modelenergia.setMes_energia(this.getResultSet().getString(2));
             //   modelenergia.setData_validade(this.getResultSet().getDate(3));
            //    modelenergia.setData_pagamento(this.getResultSet().getDate(4));
                modelenergia.setValor_energia(this.getResultSet().getFloat(1));
            //    modelenergia.setJuros_energia(this.getResultSet().getFloat(6));
             //   modelenergia.setTeste1(this.getResultSet().getString(7));
               //     modelenergia.setTeste2(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelenergia;
    }

    /**
    * recupera uma lista de energia
        * @return ArrayList
    */
    public ArrayList<ModelEnergia> getListaenergiaDAO(){
        ArrayList<ModelEnergia> listamodelenergia = new ArrayList();
        ModelEnergia modelenergia = new ModelEnergia();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_energia,"
                    + "energia_mes,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_energia,"
                    + "juros_energia,"
                    + "teste1,"
                    + "teste2"
                 + " FROM"
                     + "  tbl_energia"
                + ";"
            );

            while(this.getResultSet().next()){
                modelenergia = new ModelEnergia();
                modelenergia.setId_energia(this.getResultSet().getInt(1));
                modelenergia.setMes_energia(this.getResultSet().getString(2));
                modelenergia.setData_validade(this.getResultSet().getDate(3));
                modelenergia.setData_pagamento(this.getResultSet().getDate(4));
                modelenergia.setValor_energia(this.getResultSet().getFloat(5));
                modelenergia.setJuros_energia(this.getResultSet().getFloat(6));
                modelenergia.setTeste1(this.getResultSet().getString(7));
                modelenergia.setTeste2(this.getResultSet().getString(8));
                listamodelenergia.add(modelenergia);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelenergia;
    }

    /**
    * atualiza energia
    * @param pModelenergia
    * @return boolean
    */
    public boolean atualizarenergiaDAO(ModelEnergia pModelenergia){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE  tbl_energia SET "
                    + "id_energia = '" + pModelenergia.getId_energia() + "',"
                    + "energia_mes = '" + pModelenergia.getMes_energia() + "',"
                    + "data_validade = '" + pModelenergia.getData_validade() + "',"
                    + "data_pagamento = '" + pModelenergia.getData_pagamento() + "',"
                    + "valor_energia = '" + pModelenergia.getValor_energia() + "',"
                    + "juros_energia = '" + pModelenergia.getJuros_energia() + "',"
                    + "teste1 = '" + pModelenergia.getTeste1() + "',"
                    + "teste2 = '" + pModelenergia.getTeste2() + "'"
                + " WHERE "
                    + "id_energia = '" + pModelenergia.getId_energia() + "'"
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
    * exclui energia
    * @param pId_energia
    * @return boolean
    */
    public boolean excluirenergiaDAO(int pId_energia){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM  tbl_energia "
                + " WHERE "
                    + "id_energia = '" + pId_energia + "'"
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