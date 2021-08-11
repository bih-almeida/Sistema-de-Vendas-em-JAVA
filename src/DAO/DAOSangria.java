package DAO;

import model.ModelSangria;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Gabriela Silva de Almeida
*/
public class DAOSangria extends ConexaoMySql {

    /**
    * grava Sangria
    * @param pModelSangria
    * @return int
    */
    public int salvarSangriaDAO(ModelSangria pModelSangria){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_sangria ("
                    + "pk_sangria,"
                    + "valor_sangria,"
                    + "data_sangria,"
                    + "fk_caixa"
                + ") VALUES ("
                    + "'" + pModelSangria.getPk_sangria() + "',"
                    + "'" + pModelSangria.getValor_sangria() + "',"
                    + "'" + pModelSangria.getDate_sangria() + "',"
                    + "'" + pModelSangria.getFk_caixa() + "'"
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
    * recupera Sangria
    * @param pPk_sangria
    * @return ModelSangria
    */
    public ModelSangria getSangriaDAO(int pPk_sangria){
        ModelSangria modelSangria = new ModelSangria();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_sangria,"
                    + "valor_sangria,"
                    + "data_sangria,"
                    + "fk_caixa"
                 + " FROM"
                     + " tbl_sangria"
                 + " WHERE"
                     + " pk_sangria = '" + pPk_sangria + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelSangria.setPk_sangria(this.getResultSet().getInt(1));
                modelSangria.setValor_sangria(this.getResultSet().getDouble(2));
                modelSangria.setDate_sangria(this.getResultSet().getDate(3));
                modelSangria.setFk_caixa(this.getResultSet().getInt(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelSangria;
    }

    /**
    * recupera uma lista de Sangria
        * @return ArrayList
    */
    public ArrayList<ModelSangria> getListaSangriaDAO(){
        ArrayList<ModelSangria> listamodelSangria = new ArrayList();
        ModelSangria modelSangria = new ModelSangria();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_sangria,"
                    + "valor_sangria,"
                    + "data_sangria,"
                    + "fk_caixa"
                 + " FROM"
                     + " tbl_sangria"
                + ";"
            );

            while(this.getResultSet().next()){
                modelSangria = new ModelSangria();
                modelSangria.setPk_sangria(this.getResultSet().getInt(1));
                modelSangria.setValor_sangria(this.getResultSet().getDouble(2));
                modelSangria.setDate_sangria(this.getResultSet().getDate(3));
                modelSangria.setFk_caixa(this.getResultSet().getInt(4));
                listamodelSangria.add(modelSangria);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelSangria;
    }

    /**
    * atualiza Sangria
    * @param pModelSangria
    * @return boolean
    */
    public boolean atualizarSangriaDAO(ModelSangria pModelSangria){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_sangria SET "
                    + "pk_sangria = '" + pModelSangria.getPk_sangria() + "',"
                    + "valor_sangria = '" + pModelSangria.getValor_sangria() + "',"
                    + "data_sangria = '" + pModelSangria.getDate_sangria() + "',"
                    + "fk_caixa = '" + pModelSangria.getFk_caixa() + "'"
                + " WHERE "
                    + "pk_sangria = '" + pModelSangria.getPk_sangria() + "'"
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
    * exclui Sangria
    * @param pPk_sangria
    * @return boolean
    */
    public boolean excluirSangriaDAO(int pPk_sangria){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_sangria "
                + " WHERE "
                    + "pk_sangria = '" + pPk_sangria + "'"
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