/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;




public class ModelProdutos {
    private int idProduto;
    private int fkFornecedor;
    private String proNome;
    private Double proValor;
    private int proEstoque;
    private String proNomeFornecedor;

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the proNome
     */
    public String getProNome() {
        return proNome;
    }

    /**
     * @param proNome the proNome to set
     */
    public void setProNome(String proNome) {
        this.proNome = proNome;
    }

    /**
     * @return the proValor
     */
    public Double getProValor() {
        return proValor;
    }

    /**
     * @param proValor the proValor to set
     */
    public void setProValor(Double proValor) {
        this.proValor = proValor;
    }

    /**
     * @return the proEstoque
     */
    public int getProEstoque() {
        return proEstoque;
    }

    /**
     * @param proEstoque the proEstoque to set
     */
    public void setProEstoque(int proEstoque) {
        this.proEstoque = proEstoque;
    }

    /**
     * @return the fkFornecedor
     */
    public int getFkFornecedor() {
        return fkFornecedor;
    }

    /**
     * @param fkFornecedor the fkFornecedor to set
     */
    public void setFkFornecedor(int fkFornecedor) {
        this.fkFornecedor = fkFornecedor;
    }

    /**
     * @return the proNomeFornecedor
     */
    public String getProNomeFornecedor() {
        return proNomeFornecedor;
    }

    /**
     * @param proNomeFornecedor the proNomeFornecedor to set
     */
    public void setProNomeFornecedor(String proNomeFornecedor) {
        this.proNomeFornecedor = proNomeFornecedor;
    }
    
    
}
