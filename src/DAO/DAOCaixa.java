package DAO;

import com.mysql.cj.MysqlConnection;
import model.ModelCaixa;
import conexoes.ConexaoMySql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.ModelProdutos;
/**
*
* @author Gabriela
*/
public class DAOCaixa extends ConexaoMySql {
    
    /**
    * grava Caixa
    * @param pModelCaixa
    * @return int
    */
    
   
     
    public int salvarCaixaDAO(ModelCaixa pModelCaixa){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_caixa ("
                  //  + "pk_caixa,"
                    + "fk_funcionario,"
                    + "hora_abertura,"
                    + "data_abertura,"
                    + "valor_abertura,"
                    + "status_caixa,"
                    + "total_movimentacoes"
                  //  + "caixa_sangria,"
                 //   + "hora_fechamento,"
                 //   + "data_fechamento"
                + ") VALUES ("
               //     + "'" + pModelCaixa.getPk_caixa() + "',"
                    + "'" + pModelCaixa.getFk_funcionario() + "',"
                    + "'" + pModelCaixa.getHora_abertura() + "',"
                    + "'" + pModelCaixa.getData_abertura() + "',"
                    + "'" + pModelCaixa.getValor_abertura() + "',"
                    + "'" + pModelCaixa.getStatus_caixa() + "',"
                    + "'" + pModelCaixa.getTotal_Movimentacoes() + "'"
                  //  + "'" + pModelCaixa.getCaixa_sangria() + "',"
                 //   + "'" + pModelCaixa.getHora_fechamento() + "',"
                 //   + "'" + pModelCaixa.getData_fechamento() + "'"
                    + ""         
                + ");"
               //     + "SELECT LAST_INSERT_ID();"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }
    
        public int salvarCaixa1DAO(ModelCaixa pModelCaixa){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_caixa ("
                  //  + "pk_caixa,"
                  //  + "fk_funcionario,"
                  //  + "hora_abertura,"
                  //  + "data_abertura,"
                  //  + "valor_abertura,"
                  //  + "status_caixa,"
                    + "total_movimentacoes"
                  //  + "caixa_sangria,"
                 //   + "hora_fechamento,"
                 //   + "data_fechamento"
                + ") VALUES ("
               //     + "'" + pModelCaixa.getPk_caixa() + "',"
                 //   + "'" + pModelCaixa.getFk_funcionario() + "',"
                 //   + "'" + pModelCaixa.getHora_abertura() + "',"
                 //   + "'" + pModelCaixa.getData_abertura() + "',"
                 //   + "'" + pModelCaixa.getValor_abertura() + "',"
                  //  + "'" + pModelCaixa.getStatus_caixa() + "',"
                    + "'" + pModelCaixa.getTotal_Movimentacoes() + "'"
                  //  + "'" + pModelCaixa.getCaixa_sangria() + "',"
                 //   + "'" + pModelCaixa.getHora_fechamento() + "',"
                 //   + "'" + pModelCaixa.getData_fechamento() + "'"
                    + ""         
                + ");"
               //     + "SELECT LAST_INSERT_ID();"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Caixa
    * @param pPk_caixa
    * @return ModelCaixa
    */
    public ModelCaixa getCaixaDAO(int pPk_caixa){
        ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_caixa,"
                    + "fk_funcionario,"
                    + "hora_abertura,"
                    + "data_abertura,"
                    + "valor_abertura,"
                    + "status_caixa,"
                    + "total_movimentacoes,"
                    + "caixa_sangria,"
                    + "hora_fechamento,"
                    + "data_fechamento"
                 + " FROM"
                     + " tbl_caixa"
                 + " WHERE"
                     + " pk_caixa = '" + pPk_caixa + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCaixa.setPk_caixa(this.getResultSet().getInt(1));
                modelCaixa.setFk_funcionario(this.getResultSet().getInt(2));
                modelCaixa.setHora_abertuta(this.getResultSet().getString(3));
                modelCaixa.setData_abertura(this.getResultSet().getDate(4));
                modelCaixa.setValor_abertura(this.getResultSet().getFloat(5));
                modelCaixa.setStatus_caixa(this.getResultSet().getInt(6));
                modelCaixa.setTotal_Movimentacoes(this.getResultSet().getFloat(7));
                modelCaixa.setTotal_Caixa_sangria(this.getResultSet().getFloat(8));
                modelCaixa.setHora_fechamento(this.getResultSet().getString(9));
                modelCaixa.setData_fechamento(this.getResultSet().getDate(10));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCaixa;
    }
    
     

    /**
    * recupera uma lista de Caixa
        * @return ArrayList
    */
    public ArrayList<ModelCaixa> getListaCaixaDAO(){
        ArrayList<ModelCaixa> listamodelCaixa = new ArrayList();
        ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_caixa,"
                    + "fk_funcionario,"
                    + "hora_abertura,"
                    + "data_abertura,"
                    + "valor_abertura,"
                    + "status_caixa,"
                    + "total_movimentacoes,"
                    + "caixa_sangria,"
                    + "hora_fechamento,"
                    + "data_fechamento"
                 + " FROM"
                     + " tbl_caixa"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCaixa = new ModelCaixa();
                modelCaixa.setPk_caixa(this.getResultSet().getInt(1));
                modelCaixa.setFk_funcionario(this.getResultSet().getInt(2));
                modelCaixa.setHora_abertuta(this.getResultSet().getString(3));
                modelCaixa.setData_abertura(this.getResultSet().getDate(4));
                modelCaixa.setValor_abertura(this.getResultSet().getFloat(5));
                modelCaixa.setStatus_caixa(this.getResultSet().getInt(6));
                modelCaixa.setTotal_Movimentacoes(this.getResultSet().getFloat(7));
                modelCaixa.setTotal_Caixa_sangria(this.getResultSet().getFloat(8));
                modelCaixa.setHora_fechamento(this.getResultSet().getString(9));
                modelCaixa.setData_fechamento(this.getResultSet().getDate(10));
                listamodelCaixa.add(modelCaixa);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCaixa;
    }

    /**
    * atualiza Caixa
    * @param pModelCaixa
    * @return boolean
    */
    public boolean atualizarCaixaDAO(ModelCaixa pModelCaixa){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_caixa SET "
                    + "pk_caixa = '" + pModelCaixa.getPk_caixa() + "',"
                 //   + "fk_funcionario = '" + pModelCaixa.getFk_funcionario() + "',"
                  //  + "hora_abertura = '" + pModelCaixa.getHora_abertura() + "',"
                //    + "data_abertura = '" + pModelCaixa.getData_abertura() + "',"
                 //   + "valor_abertura = '" + pModelCaixa.getValor_abertura() + "',"
                    + "valor_fechamento = '" + pModelCaixa.getValor_fechamento()+ "',"
                    + "status_caixa = '" + pModelCaixa.getStatus_caixa() + "',"
                   // + "total_movimentacoes = '" + pModelCaixa.getTotal_Movimentacoes() + "',"
                  //  + "caixa_sangria = '" + pModelCaixa.getTotal_Caixa_sangria()+ "',"
                    + "hora_fechamento = '" + pModelCaixa.getHora_fechamento() + "',"
                    + "data_fechamento = '" + pModelCaixa.getData_fechamento() + "'"
                + " WHERE "
                    + "pk_caixa = '" + pModelCaixa.getPk_caixa() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    public boolean atualizar1CaixaDAO(ModelCaixa pModelCaixa){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_caixa SET "
                    + "pk_caixa = '" + pModelCaixa.getPk_caixa() + "',"
                 //   + "fk_funcionario = '" + pModelCaixa.getFk_funcionario() + "',"
                  //  + "hora_abertura = '" + pModelCaixa.getHora_abertura() + "',"
                //    + "data_abertura = '" + pModelCaixa.getData_abertura() + "',"
                 //   + "valor_abertura = '" + pModelCaixa.getValor_abertura() + "',"
                  //  + "status_caixa = '" + pModelCaixa.getStatus_caixa() + "',"
                            
                    + "total_movimentacoes = '" + pModelCaixa.getTotal_Movimentacoes() + "',"
                            //acrscentei aqui
                    + "caixa_sangria = '" + pModelCaixa.getTotal_Caixa_sangria()+ "',"
                            + "dinheiroCaixaSangria = '" + pModelCaixa.getCaixa_sangria_dinheiro()+ "',"
                   // + "hora_fechamento = '" + pModelCaixa.getHora_fechamento() + "',"
                   // + "data_fechamento = '" + pModelCaixa.getData_fechamento() + "'"
                            //mexi aqui
                     + "total_debito = '" + pModelCaixa.getTotal_Debito()+ "',"
                              + "total_dinheiro = '" + pModelCaixa.getTotal_Dinheiro()+ "',"
                  //   + "total_movimentacoes = '" + pModelCaixa.getTotal_Movimentacoes() + "',"         
                    + "total_credito = '" + pModelCaixa.getTotal_Credito()+ "'" 
                            
                + " WHERE "
                    + "pk_caixa = '" + pModelCaixa.getPk_caixa() + "'"
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
    * exclui Caixa
    * @param pPk_caixa
    * @return boolean
    */
    public boolean excluirCaixaDAO(int pPk_caixa){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_caixa "
                + " WHERE "
                    + "pk_caixa = '" + pPk_caixa + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

  //  public boolean salvarCaixaDAO(ArrayList<ModelCaixa> plistaModelAberturaaCaixa) {
  //       try {
   //         this.conectar();
    //       int cont = plistaModelAberturaaCaixa.size();
   //          for (int i = 0; i<cont; i++){
      //       this.insertSQL(
         //       "INSERT INTO tbl_caixa ("
           //         + "pk_caixa,"
              //      + "fk_funcionario,"
             //       + "hora_abertura,"
             //       + "data_abertura,"
             //       + "valor_abertura,"
             //       + "status_caixa,"
             //       + "total_movimentacoes,"
             //       + "caixa_sangria,"
             //       + "hora_fechamento,"
            //        + "data_fechamento"
            //    + ") VALUES ("
               //     + "'" + plistaModelAberturaaCaixa.get(i).getPk_caixa() + "',"
             //       + "'" + plistaModelAberturaaCaixa.get(i).getFk_funcionario() + "',"
             //       + "'" + plistaModelAberturaaCaixa.get(i).getHora_abertura() + "',"
            //        + "'" + plistaModelAberturaaCaixa.get(i).getData_abertura() + "',"
             //       + "'" + plistaModelAberturaaCaixa.get(i).getValor_abertura() + "',"
            //        + "'" + plistaModelAberturaaCaixa.get(i).getStatus_caixa() + "',"
            //        + "'" + plistaModelAberturaaCaixa.get(i).getTotal_Movimentacoes() + "',"
             //       + "'" + plistaModelAberturaaCaixa.get(i).getCaixa_sangria() + "',"
             //       + "'" + plistaModelAberturaaCaixa.get(i).getHora_fechamento() + "',"
           //         + "'" + plistaModelAberturaaCaixa.get(i).getData_fechamento() + "'"
             //   + ");"
         //   );
        //     }
       //       return true;
     //   }catch(Exception e){
   //         e.printStackTrace();
   //         return false;
   //     }finally{
   //         this.fecharConexao();
    //    }
  //  }
    
    //retornar ultimo id
     public ModelCaixa UltimoIdCaixaDAO(ModelCaixa pModelCaixa){
          ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            //return this.insertSQL(
           // this.insertSQL(
            this.executarSQL(
                "SELECT MAX(pk_caixa) FROM tbl_caixa"
            ); 
            while(this.getResultSet().next()){
                modelCaixa.setPk_caixa(this.getResultSet().getInt(1));
               //  modelCaixa.setStatus_caixa(this.getResultSet().getInt(2));
            }
            }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            this.fecharConexao();
        }
        //return UltimoIdCaixaDAO(pModelCaixa);
        return modelCaixa;
    }
     
     //retornar ultimo id
     public ModelCaixa UltimoStatusDAO(ModelCaixa pModelCaixa){
          ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT status_caixa from tbl_caixa where pk_caixa = (select max(pk_caixa) from tbl_caixa)"
                      
                           + ";"
            );
            while(this.getResultSet().next()){
                modelCaixa.setStatus_caixa(this.getResultSet().getInt(1));
           
            }
            }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            this.fecharConexao();
        }
        return modelCaixa;
    }
     
     
      public ArrayList<ModelCaixa> retornarListastatus(){
         ArrayList<ModelCaixa> listaModelProdutos = new ArrayList<>();
       
          ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            //return this.insertSQL(
           // this.insertSQL(
            this.executarSQL(
             //   "SELECT (status_caixa), max(pk_caixa) FROM tbl_caixa"
                    "SELECT"
                        + "Max pk_caixa,"
                        + "status_caixa"
                             + " FROM tbl_caixa" //WHERE pk_caixa = '" + pModelCaixa + "and status_caixa= '" + pModelCaixa 
                  //   + " tbl_caixa"
            //+ " WHERE "
           //         + "pk_caixa'" + pModelCaixa + "'"
           //          + "status_caixa'" + pModelCaixa + "'"       
                     
                + ";"
            );
            
             //"SELECT"
               //         + "pk_caixa,"
                 //       + "status_caixa"
                 //+ " FROM"
              //       + " tbl_caixa"
           // + " WHERE "
           //         + "status_caixa = 1 '" + pModelCaixa + "'"
          //      + ";"
          //  );
            while(this.getResultSet().next()){
                 modelCaixa.setPk_caixa(this.getResultSet().getInt(1));
                modelCaixa.setStatus_caixa(this.getResultSet().getInt(2));
                listaModelProdutos.add(modelCaixa);
           // while(this.getResultSet().next()){
          //      modelCaixa.setStatus_caixa(this.getResultSet().getInt(1));
            }
            }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            this.fecharConexao();
        }
        //return UltimoIdCaixaDAO(pModelCaixa);
        return retornarListastatus();
    }

    public ModelCaixa UltimaMovimentacaoCaixaSangriaCaixaDAO(ModelCaixa pModelCaixa) {
        
       ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT caixa_sangria from tbl_caixa where pk_caixa = (select max(pk_caixa) from tbl_caixa)"
                      
                           + ";"
            );
            while(this.getResultSet().next()){
                modelCaixa.setTotal_Caixa_sangria(this.getResultSet().getFloat(1));
                
           
            }
            }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            this.fecharConexao();
        }
        return modelCaixa;
    }
    
    public ModelCaixa UltimaMovimentacaoCaixaDAO(ModelCaixa pModelCaixa) {
        
       ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT total_Movimentacoes from tbl_caixa where pk_caixa = (select max(pk_caixa) from tbl_caixa)"
                      
                           + ";"
            );
            while(this.getResultSet().next()){
                modelCaixa.setTotal_Movimentacoes(this.getResultSet().getFloat(1));
                
           
            }
            }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            this.fecharConexao();
        }
        return modelCaixa;
    }
    
    

    public ModelCaixa UltimoCreditoCaixaDAO(ModelCaixa pModelCaixa) {
       ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT total_credito from tbl_caixa where pk_caixa = (select max(pk_caixa) from tbl_caixa)"
                      
                           + ";"
            );
            while(this.getResultSet().next()){
                modelCaixa.setTotal_Credito(this.getResultSet().getFloat(1));
           
            }
            }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            this.fecharConexao();
        }
        return modelCaixa;
    }
    
    public ModelCaixa UltimoDebitoCaixaDAO(ModelCaixa pModelCaixa) {
       ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT total_debito from tbl_caixa where pk_caixa = (select max(pk_caixa) from tbl_caixa)"
                      
                           + ";"
            );
            while(this.getResultSet().next()){
                modelCaixa.setTotal_Debito(this.getResultSet().getFloat(1));
           
            }
            }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            this.fecharConexao();
        }
        return modelCaixa;
    }
      
     public ModelCaixa UltimoDinheiroCaixaDAO(ModelCaixa pModelCaixa) {
       ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT total_dinheiro from tbl_caixa where pk_caixa = (select max(pk_caixa) from tbl_caixa)"
                      
                           + ";"
            );
            while(this.getResultSet().next()){
                modelCaixa.setTotal_Dinheiro(this.getResultSet().getFloat(1));
           
            }
            }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            this.fecharConexao();
        }
        return modelCaixa;
    }
     
     public ModelCaixa UltimotrocoCaixaDAO(ModelCaixa pModelCaixa) {
       ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT troco from tbl_caixa where pk_caixa = (select max(pk_caixa) from tbl_caixa)"
                      
                           + ";"
            );
            while(this.getResultSet().next()){
                modelCaixa.setTroco(this.getResultSet().getFloat(1));
           
            }
            }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            this.fecharConexao();
        }
        return modelCaixa;
    }
     
      public ModelCaixa UltimaMovimentacaoAberturaCaixaDAO(ModelCaixa pModelCaixa) {
       ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT valor_abertura from tbl_caixa where pk_caixa = (select max(pk_caixa) from tbl_caixa)"
                      
                           + ";"
            );
            while(this.getResultSet().next()){
                modelCaixa.setValor_abertura(this.getResultSet().getFloat(1));
           
            }
            }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            this.fecharConexao();
        }
        return modelCaixa;
    }
     
             
    public ModelCaixa UltimoDinheiroSangriaDAO(ModelCaixa pModelCaixa) {
       ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT dinheiroCaixaSangria from tbl_caixa where pk_caixa = (select max(pk_caixa) from tbl_caixa)"
                      
                           + ";"
            );
            while(this.getResultSet().next()){
                modelCaixa.setCaixa_sangria_dinheiro(this.getResultSet().getFloat(1));
           
            }
            }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            this.fecharConexao();
        }
        return modelCaixa;
    }
    
    public boolean atualizarDebitoDAO(ModelCaixa pModelCaixa){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_caixa SET "
                    + "pk_caixa = '" + pModelCaixa.getPk_caixa() + "',"
                 //   + "fk_funcionario = '" + pModelCaixa.getFk_funcionario() + "',"
                  //  + "hora_abertura = '" + pModelCaixa.getHora_abertura() + "',"
                //    + "data_abertura = '" + pModelCaixa.getData_abertura() + "',"
                 //   + "valor_abertura = '" + pModelCaixa.getValor_abertura() + "',"
                  //  + "status_caixa = '" + pModelCaixa.getStatus_caixa() + "',"
                            
                    + "total_movimentacoes = '" + pModelCaixa.getTotal_Movimentacoes() + "',"
                            //acrscentei aqui
                    //+ "caixa_sangria = '" + pModelCaixa.getTotal_Caixa_sangria()+ "',"
                      //      + "dinheiroCaixaSangria = '" + pModelCaixa.getCaixa_sangria_dinheiro()+ "',"
                   // + "hora_fechamento = '" + pModelCaixa.getHora_fechamento() + "',"
                   // + "data_fechamento = '" + pModelCaixa.getData_fechamento() + "'"
                            //mexi aqui
                     + "total_debito = '" + pModelCaixa.getTotal_Debito()+ "'"
                        //      + "total_dinheiro = '" + pModelCaixa.getTotal_Dinheiro()+ "',"
                  //   + "total_movimentacoes = '" + pModelCaixa.getTotal_Movimentacoes() + "',"         
                   // + "total_credito = '" + pModelCaixa.getTotal_Credito()+ "'" 
                            
                + " WHERE "
                    + "pk_caixa = '" + pModelCaixa.getPk_caixa() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    public boolean atualizar1CreditoDAO(ModelCaixa pModelCaixa){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_caixa SET "
                    + "pk_caixa = '" + pModelCaixa.getPk_caixa() + "',"
                 //   + "fk_funcionario = '" + pModelCaixa.getFk_funcionario() + "',"
                  //  + "hora_abertura = '" + pModelCaixa.getHora_abertura() + "',"
                //    + "data_abertura = '" + pModelCaixa.getData_abertura() + "',"
                 //   + "valor_abertura = '" + pModelCaixa.getValor_abertura() + "',"
                  //  + "status_caixa = '" + pModelCaixa.getStatus_caixa() + "',"
                            
                    + "total_movimentacoes = '" + pModelCaixa.getTotal_Movimentacoes() + "',"
                            //acrscentei aqui
                   // + "caixa_sangria = '" + pModelCaixa.getTotal_Caixa_sangria()+ "',"
                     //       + "dinheiroCaixaSangria = '" + pModelCaixa.getCaixa_sangria_dinheiro()+ "',"
                   // + "hora_fechamento = '" + pModelCaixa.getHora_fechamento() + "',"
                   // + "data_fechamento = '" + pModelCaixa.getData_fechamento() + "'"
                            //mexi aqui
                    // + "total_debito = '" + pModelCaixa.getTotal_Debito()+ "',"
                      //        + "total_dinheiro = '" + pModelCaixa.getTotal_Dinheiro()+ "',"
                  //   + "total_movimentacoes = '" + pModelCaixa.getTotal_Movimentacoes() + "',"         
                    + "total_credito = '" + pModelCaixa.getTotal_Credito()+ "'" 
                            
                + " WHERE "
                    + "pk_caixa = '" + pModelCaixa.getPk_caixa() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    public boolean atualizarDinheiroDAO(ModelCaixa pModelCaixa){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_caixa SET "
                    + "pk_caixa = '" + pModelCaixa.getPk_caixa() + "',"
                 //   + "fk_funcionario = '" + pModelCaixa.getFk_funcionario() + "',"
                  //  + "hora_abertura = '" + pModelCaixa.getHora_abertura() + "',"
                //    + "data_abertura = '" + pModelCaixa.getData_abertura() + "',"
                 //   + "valor_abertura = '" + pModelCaixa.getValor_abertura() + "',"
                  //  + "status_caixa = '" + pModelCaixa.getStatus_caixa() + "',"
                            
                    + "total_movimentacoes = '" + pModelCaixa.getTotal_Movimentacoes() + "',"
                            //acrscentei aqui
                  //  + "caixa_sangria = '" + pModelCaixa.getTotal_Caixa_sangria()+ "',"
                            + "total_dinheiro = '" + pModelCaixa.getTotal_Dinheiro()+ "',"
                            + "dinheiroCaixaSangria = '" + pModelCaixa.getCaixa_sangria_dinheiro()+ "'"
                   // + "hora_fechamento = '" + pModelCaixa.getHora_fechamento() + "',"
                   // + "data_fechamento = '" + pModelCaixa.getData_fechamento() + "'"
                            //mexi aqui
                     //+ "total_debito = '" + pModelCaixa.getTotal_Debito()+ "',"
                              
                  //   + "total_movimentacoes = '" + pModelCaixa.getTotal_Movimentacoes() + "',"         
                 //   + "total_credito = '" + pModelCaixa.getTotal_Credito()+ "'" 
                            
                + " WHERE "
                    + "pk_caixa = '" + pModelCaixa.getPk_caixa() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }  
    
    public boolean atualizarTrocoDAO(ModelCaixa pModelCaixa){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_caixa SET "
                    + "pk_caixa = '" + pModelCaixa.getPk_caixa() + "',"
                 //   + "fk_funcionario = '" + pModelCaixa.getFk_funcionario() + "',"
                  //  + "hora_abertura = '" + pModelCaixa.getHora_abertura() + "',"
                //    + "data_abertura = '" + pModelCaixa.getData_abertura() + "',"
                 //   + "valor_abertura = '" + pModelCaixa.getValor_abertura() + "',"
                  //  + "status_caixa = '" + pModelCaixa.getStatus_caixa() + "',"
                            
                  //  + "total_movimentacoes = '" + pModelCaixa.getTotal_Movimentacoes() + "',"
                            //acrscentei aqui
                  //  + "caixa_sangria = '" + pModelCaixa.getTotal_Caixa_sangria()+ "',"
                //            + "total_dinheiro = '" + pModelCaixa.getTotal_Dinheiro()+ "',"
                //            + "dinheiroCaixaSangria = '" + pModelCaixa.getCaixa_sangria_dinheiro()+ "'"
                   // + "hora_fechamento = '" + pModelCaixa.getHora_fechamento() + "',"
                   // + "data_fechamento = '" + pModelCaixa.getData_fechamento() + "'"
                            //mexi aqui
                     //+ "total_debito = '" + pModelCaixa.getTotal_Debito()+ "',"
                              
                  //   + "total_movimentacoes = '" + pModelCaixa.getTotal_Movimentacoes() + "',"         
                 //   + "total_credito = '" + pModelCaixa.getTotal_Credito()+ "'" 
                      + "troco = '" + pModelCaixa.getTroco()+ "'"       
                + " WHERE "
                    + "pk_caixa = '" + pModelCaixa.getPk_caixa() + "'"
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