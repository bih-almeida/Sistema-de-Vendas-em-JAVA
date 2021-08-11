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
public class DAO1 extends ConexaoMySql {
    private ConexaoMySql dataSource;
    
    /**
     *
     * @param dataSource
     */
    public DAO1(ConexaoMySql dataSource){
        this.dataSource = dataSource;
    }

  
    
public ArrayList<ModelCaixa> getListaStatusCaixaDAO(){
         try {
             
             String SQL = "SELECT"
                        + "Max pk_caixa,"
                      //  + "status_caixa"
                        + " FROM tbl_caixa" ;
         PreparedStatement ps = dataSource.getCon().prepareStatement(SQL);
         ResultSet rs = ps.executeQuery();
             
        ArrayList<ModelCaixa> listamodelCaixa = new ArrayList();
        ModelCaixa modelCaixa = new ModelCaixa();
        
          
            while(rs.next()){
                modelCaixa = new ModelCaixa();
                modelCaixa.setPk_caixa(rs.getInt(1));
              //  modelCaixa.setFk_funcionario(this.getResultSet().getInt(2));
              //  modelCaixa.setHora_abertuta(this.getResultSet().getString(3));
             //   modelCaixa.setData_abertura(this.getResultSet().getDate(4));
             //   modelCaixa.setValor_abertura(this.getResultSet().getFloat(5));
                modelCaixa.setStatus_caixa(rs.getInt(2));
              //  modelCaixa.setTotal_Movimentacoes(this.getResultSet().getFloat(7));
              //  modelCaixa.setCaixa_sangria(this.getResultSet().getFloat(8));
              //  modelCaixa.setHora_fechamento(this.getResultSet().getString(9));
              //  modelCaixa.setData_fechamento(this.getResultSet().getDate(10));
                listamodelCaixa.add(modelCaixa);
            }
            ps.close();
            return listamodelCaixa;
            
        }catch(Exception e){
            e.printStackTrace();
        
    }
    return null;
    }

 public ModelCaixa getCaixaDAO1(int pPk_caixa){
        ModelCaixa modelCaixa = new ModelCaixa();
        try {
           // this.conectar();
          //  this.executarSQL(
           String SQL =  "SELECT"
                        + "pk_caixa,"
                        + "status_caixa"
                             + " FROM tbl_caixa WHERE pk_caixa = (Select MAX (PK_CAIXA) from tbl_caixa)'"  + pPk_caixa + "'"
                + ";"
            ;
            
         PreparedStatement ps = dataSource.getCon().prepareStatement(SQL);
         ResultSet rs = ps.executeQuery();    

           // while(this.getResultSet().next()){
              while(rs.next()){
                modelCaixa = new ModelCaixa();
                modelCaixa.setPk_caixa(rs.getInt(1));
              //  modelCaixa.setFk_funcionario(this.getResultSet().getInt(2));
              //  modelCaixa.setHora_abertuta(this.getResultSet().getString(3));
             //   modelCaixa.setData_abertura(this.getResultSet().getDate(4));
             //   modelCaixa.setValor_abertura(this.getResultSet().getFloat(5));
                modelCaixa.setStatus_caixa(rs.getInt(2));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCaixa;
    }
    
}