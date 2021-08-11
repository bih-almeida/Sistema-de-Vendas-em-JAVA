/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelVendas;
import model.ModelVendasClientes;
/**
 *
 * @author GABRIELA
 */
public class DAOVendasCliente extends ConexaoMySql{
    
    public ArrayList<ModelVendasClientes> getListaVendasClienteDAO(){
        ArrayList<ModelVendasClientes> listaModelVendasClientes = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        ModelCliente modelCliente = new ModelCliente();
        ModelVendasClientes modelVendasCliente = new ModelVendasClientes();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "tbl_vendas.pk_id_vendas,"
                     + "tbl_vendas.fk_id_caixa,"   
                    + "tbl_vendas.fk_cliente,"
                    + "tbl_vendas.ven_data_venda,"
                    + "tbl_vendas.ven_valor_liquido,"   
                    + "tbl_vendas.ven_valor_bruto,"
                    + "tbl_vendas.ven_desconto,"
                    + "tbl_vendas.ven_taxa,"
                    + "tbl_vendas.ven_kg,"
                    + "tbl_cliente.pk_id_cliente,"
                    + "tbl_cliente.cli_nome,"
                    + "tbl_cliente.cli_endereco,"
                    + "tbl_cliente.cli_bairro,"
                    + "tbl_cliente.cli_cidade,"
                    + "tbl_cliente.cli_uf,"
                    + "tbl_cliente.cli_cep,"
                    + "tbl_cliente.cli_telefone"    
                 + " FROM "
                     + " tbl_vendas INNER JOIN tbl_cliente "
                        + "ON tbl_cliente.pk_id_cliente = tbl_vendas.fk_cliente; "   
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelCliente = new ModelCliente();
                modelVendasCliente = new ModelVendasClientes();
                //vendas
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setIdCaixa(this.getResultSet().getInt(2));
                modelVendas.setCliente(this.getResultSet().getInt(3));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(4));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(5));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(6));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(7));
                modelVendas.setVenTaxa(this.getResultSet().getDouble(8));
                modelVendas.setVenKg(this.getResultSet().getDouble(9));
                
                //cliente
                modelCliente = new ModelCliente();
                modelCliente.setIdCliente(this.getResultSet().getInt(10));
                modelCliente.setCliNome(this.getResultSet().getString(11));
                modelCliente.setCliEndereco(this.getResultSet().getString(12));
                modelCliente.setCliBairro(this.getResultSet().getString(13));
                modelCliente.setCliCidade(this.getResultSet().getString(14));
                modelCliente.setCliUF(this.getResultSet().getString(15));
                modelCliente.setCliCep(this.getResultSet().getString(16));
                modelCliente.setCliTelefone(this.getResultSet().getString(17));
                
                modelVendasCliente.setModelVendas(modelVendas);
                modelVendasCliente.setModelCliente(modelCliente);
                
                listaModelVendasClientes.add(modelVendasCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelVendasClientes;
    }

    
}
