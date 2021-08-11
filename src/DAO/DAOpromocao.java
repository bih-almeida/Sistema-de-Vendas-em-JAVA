package DAO;

import model.ModelPromocao;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Gabriela Silva de Almeida
*/
public class DAOpromocao extends ConexaoMySql {

    /**
    * grava promocao
    * @param pModelpromocao
    * @return int
    */
    public int salvarpromocaoDAO(ModelPromocao pModelpromocao){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_promocao ("
                  //  + "id_promocao,"
                    + "nome_promocao,"
                    + "valor_promocao,"
                    + "acumulado_promocao,"
                    + "disponibilidade_promocao,"
                   // + "validade_promocao,"
                    + "teste1,"
                    + "teste2"
                + ") VALUES ("
                   // + "'" + pModelpromocao.getId_promocao() + "',"
                    + "'" + pModelpromocao.getNome_promocao() + "',"
                    + "'" + pModelpromocao.getValor_promocao() + "',"
                    + "'" + pModelpromocao.getAcumulado_promocao() + "',"
                    + "'" + pModelpromocao.getDisponibilidade_promocao() + "',"
                 //   + "'" + pModelpromocao.getValidade_promocao() + "',"
                    + "'" + pModelpromocao.getTeste1() + "',"
                    + "'" + pModelpromocao.getTeste2() + "'"
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
    * recupera promocao
    * @param pId_promocao
    * @return Modelpromocao
    */
    public ModelPromocao getpromocaoDAO(int pId_promocao){
        ModelPromocao modelpromocao = new ModelPromocao();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_promocao,"
                    + "nome_promocao,"
                    + "valor_promocao,"
                    + "acumulado_promocao,"
                    + "disponibilidade_promocao,"
                    + "validade_promocao,"
                    + "teste1,"
                    + "teste2"
                 + " FROM"
                     + " tbl_promocao"
                 + " WHERE"
                     + " id_promocao = '" + pId_promocao + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelpromocao.setId_promocao(this.getResultSet().getInt(1));
                modelpromocao.setNome_promocao(this.getResultSet().getString(2));
                modelpromocao.setValor_promocao(this.getResultSet().getString(3));
                modelpromocao.setAcumulado_promocao(this.getResultSet().getString(4));
                modelpromocao.setDisponibilidade_promocao(this.getResultSet().getString(5));
                modelpromocao.setValidade_promocao(this.getResultSet().getDate(6));
                modelpromocao.setTeste1(this.getResultSet().getString(7));
                modelpromocao.setTeste2(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelpromocao;
    }

    /**
    * recupera uma lista de promocao
        * @return ArrayList
    */
    public ArrayList<ModelPromocao> getListapromocaoDAO(){
        ArrayList<ModelPromocao> listamodelpromocao = new ArrayList();
        ModelPromocao modelpromocao = new ModelPromocao();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_promocao,"
                    + "nome_promocao,"
                    + "valor_promocao,"
                    + "acumulado_promocao,"
                    + "disponibilidade_promocao,"
                    + "validade_promocao,"
                    + "teste1"
                 //   + "teste_2"
                 + " FROM"
                     + " tbl_promocao"
                + ";"
            );

            while(this.getResultSet().next()){
                modelpromocao = new ModelPromocao();
                modelpromocao.setId_promocao(this.getResultSet().getInt(1));
                modelpromocao.setNome_promocao(this.getResultSet().getString(2));
                modelpromocao.setValor_promocao(this.getResultSet().getString(3));
                modelpromocao.setAcumulado_promocao(this.getResultSet().getString(4));
                modelpromocao.setDisponibilidade_promocao(this.getResultSet().getString(5));
                modelpromocao.setValidade_promocao(this.getResultSet().getDate(6));
                modelpromocao.setTeste1(this.getResultSet().getString(7));
              //  modelpromocao.setTeste2(this.getResultSet().getString(8));
                listamodelpromocao.add(modelpromocao);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelpromocao;
    }

    /**
    * atualiza promocao
    * @param pModelpromocao
    * @return boolean
    */
    public boolean atualizarpromocaoDAO(ModelPromocao pModelpromocao){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_promocao SET "
                    + "id_promocao = '" + pModelpromocao.getId_promocao() + "',"
                    + "nome_promocao = '" + pModelpromocao.getNome_promocao() + "',"
                    + "valor_promocao = '" + pModelpromocao.getValor_promocao() + "',"
                    + "acumulado_promocao = '" + pModelpromocao.getAcumulado_promocao() + "',"
                    + "disponibilidade_promocao = '" + pModelpromocao.getDisponibilidade_promocao() + "',"
                   // + "validade_promocao = '" + pModelpromocao.getValidade_promocao() + "',"
                    + "teste1 = '" + pModelpromocao.getTeste1() + "',"
                    + "teste2 = '" + pModelpromocao.getTeste2() + "'"
                + " WHERE "
                    + "id_promocao = '" + pModelpromocao.getId_promocao() + "'"
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
    * exclui promocao
    * @param pId_promocao
    * @return boolean
    */
    public boolean excluirpromocaoDAO(int pId_promocao){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_promocao "
                + " WHERE "
                    + "id_promocao = '" + pId_promocao + "'"
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