/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOVendasCliente;
import java.util.ArrayList;
import model.ModelVendasClientes;

/**
 *
 * @author GABRIELA
 */
public class ControllerVendasCliente {
    private DAOVendasCliente daoVendasCliente = new  DAOVendasCliente();
    
    public ArrayList<ModelVendasClientes> getListaVendasClienteController() {
        return this.daoVendasCliente.getListaVendasClienteDAO();
    }
    
}
