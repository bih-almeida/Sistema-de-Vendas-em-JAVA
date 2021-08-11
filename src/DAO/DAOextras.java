package DAO;

import model.ModelExtras;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Gabriela Silva de Almeida
*/
public class DAOextras extends ConexaoMySql {

    /**
    * grava extras
    * @param pModelextras
    * @return int
    */
    public int salvarextrasDAO(ModelExtras pModelextras){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO  tbl_extras ("
                   // + "id_extras,"
                    + "extras_mes,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_extras,"
                    + "juros_extras"
                   // + "teste1,"
                   // + "teste2"
                + ") VALUES ("
                  //  + "'" + pModelextras.getId_extras() + "',"
                    + "'" + pModelextras.getMes_extras() + "',"
                    + "'" + pModelextras.getData_validade() + "',"
                    + "'" + pModelextras.getData_pagamento() + "',"
                    + "'" + pModelextras.getValor_extras() + "',"
                    + "'" + pModelextras.getJuros_extras() + "'"
                   // + "'" + pModelextras.getTeste1() + "',"
                 //   + "'" + pModelextras.getTeste2() + "'"
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
    * recupera extras
    * @param pId_extras
    * @return Modelextras
    */
    public ModelExtras getextrasDAO(int pId_extras){
        ModelExtras modelextras = new ModelExtras();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_extras,"
                    + "extras_mes,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_extras,"
                    + "juros_extras,"
                    + "teste1,"
                    + "teste2"
                 + " FROM"
                     + "  tbl_extras"
                 + " WHERE"
                     + " id_extras = '" + pId_extras + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelextras.setId_extras(this.getResultSet().getInt(1));
                modelextras.setMes_extras(this.getResultSet().getString(2));
                modelextras.setData_validade(this.getResultSet().getDate(3));
                modelextras.setData_pagamento(this.getResultSet().getDate(4));
                modelextras.setValor_extras(this.getResultSet().getFloat(5));
                modelextras.setJuros_extras(this.getResultSet().getFloat(6));
                modelextras.setTeste1(this.getResultSet().getString(7));
                modelextras.setTeste2(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelextras;
    }
    
    public ModelExtras getextras1DAO(int date, int date1){
        ModelExtras modelextras = new ModelExtras();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    
                    + "SUM(valor_extras)"
                    
                 + " FROM"
                     + " tbl_extras"
                 + " WHERE"
                     + " YEAR(data_pagamento) = '" + date + "' AND MONTH(data_pagamento) = '" + date1 + "'"
               
            );
            
            

            while(this.getResultSet().next()){
                
                modelextras.setValor_extras(this.getResultSet().getFloat(1));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelextras;
    }

    /**
    * recupera uma lista de extras
        * @return ArrayList
    */
    public ArrayList<ModelExtras> getListaextrasDAO(){
        ArrayList<ModelExtras> listamodelextras = new ArrayList();
        ModelExtras modelextras = new ModelExtras();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_extras,"
                    + "extras_mes,"
                    + "data_validade,"
                    + "data_pagamento,"
                    + "valor_extras,"
                    + "juros_extras,"
                    + "teste1,"
                    + "teste2"
                 + " FROM"
                     + "  tbl_extras"
                + ";"
            );

            while(this.getResultSet().next()){
                modelextras = new ModelExtras();
                modelextras.setId_extras(this.getResultSet().getInt(1));
                modelextras.setMes_extras(this.getResultSet().getString(2));
                modelextras.setData_validade(this.getResultSet().getDate(3));
                modelextras.setData_pagamento(this.getResultSet().getDate(4));
                modelextras.setValor_extras(this.getResultSet().getFloat(5));
                modelextras.setJuros_extras(this.getResultSet().getFloat(6));
                modelextras.setTeste1(this.getResultSet().getString(7));
                modelextras.setTeste2(this.getResultSet().getString(8));
                listamodelextras.add(modelextras);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelextras;
    }

    /**
    * atualiza extras
    * @param pModelextras
    * @return boolean
    */
    public boolean atualizarextrasDAO(ModelExtras pModelextras){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE  tbl_extras SET "
                    + "id_extras = '" + pModelextras.getId_extras() + "',"
                    + "extras_mes = '" + pModelextras.getMes_extras() + "',"
                    + "data_validade = '" + pModelextras.getData_validade() + "',"
                    + "data_pagamento = '" + pModelextras.getData_pagamento() + "',"
                    + "valor_extras = '" + pModelextras.getValor_extras() + "',"
                    + "juros_extras = '" + pModelextras.getJuros_extras() + "'"
                  //  + "teste1 = '" + pModelextras.getTeste1() + "',"
                  //  + "teste2 = '" + pModelextras.getTeste2() + "'"
                + " WHERE "
                    + "id_extras = '" + pModelextras.getId_extras() + "'"
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
    * exclui extras
    * @param pId_extras
    * @return boolean
    */
    public boolean excluirextrasDAO(int pId_extras){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM  tbl_extras "
                + " WHERE "
                    + "id_extras = '" + pId_extras + "'"
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