/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author GABRIELA
 */
public class ModelVendasClientes {
    private ModelVendas modelVendas;
    private ModelCliente modelCliente;
    private ArrayList<ModelVendasClientes> listaModelVendasCliente;
    public ModelSangria modelsangria;
        public ArrayList<ModelSangria> listaSangria;
    /**
     * @return the modelVendas
     */
    public ModelVendas getModelVendas() {
        return modelVendas;
    }

    /**
     * @param modelVendas the modelVendas to set
     */
    public void setModelVendas(ModelVendas modelVendas) {
        this.modelVendas = modelVendas;
    }

    /**
     * @return the modelCliente
     */
    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    /**
     * @param modelCliente the modelCliente to set
     */
    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    /**
     * @return the listaModelVendasCliente
     */
    public ArrayList<ModelVendasClientes> getListaModelVendasCliente() {
        return listaModelVendasCliente;
    }

    /**
     * @param listaModelVendasCliente the listaModelVendasCliente to set
     */
    public void setListaModelVendasCliente(ArrayList<ModelVendasClientes> listaModelVendasCliente) {
        this.listaModelVendasCliente = listaModelVendasCliente;
    }

      public ModelSangria getModelSangria() {
        return modelsangria;
    }
    
    public ArrayList<ModelSangria> getListaSangria() {
        return listaSangria;
    }
    
    
}
