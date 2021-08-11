package model;
/**
*
* @author Gabriela
*/
public class ModelVendasProdutos {

    private int idVendaProduto;
    private int produto;
    private int vendas;
    private double venProValor;
    private double venProQuantidade;
    private double venTaxaProduto;
    private double venBalancaKg;

    /**
    * Construtor
    */
    public ModelVendasProdutos(){}

    /**
    * seta o valor de idVendaProduto
    * @param pIdVendaProduto
    */
    public void setIdVendaProduto(int pIdVendaProduto){
        this.idVendaProduto = pIdVendaProduto;
    }
    /**
    * @return pk_idVendaProduto
    */
    public int getIdVendaProduto(){
        return this.idVendaProduto;
    }

    /**
    * seta o valor de produto
    * @param pProduto
    */
    public void setProduto(int pProduto){
        this.produto = pProduto;
    }
    /**
    * @return fk_produto
    */
    public int getProduto(){
        return this.produto;
    }

    /**
    * seta o valor de vendas
    * @param pVendas
    */
    public void setVendas(int pVendas){
        this.vendas = pVendas;
    }
    /**
    * @return vendas
    */
    public int getVendas(){
        return this.vendas;
    }

    /**
    * seta o valor de venProValor
    * @param pVenProValor
    */
    public void setVenProValor(double pVenProValor){
        this.venProValor = pVenProValor;
    }
    /**
    * @return venProValor
    */
    public double getVenProValor(){
        return this.venProValor;
    }

    /**
    * seta o valor de venProQuantidade
    * @param pVenProQuantidade
    */
    public void setVenProQuantidade(double pVenProQuantidade){
        this.venProQuantidade = pVenProQuantidade;
    }
    /**
    * @return venProQuantidade
    */
    public double getVenProQuantidade(){
        return this.venProQuantidade;
    }

    /**
    * seta o valor de venTaxaProduto
    * @param pVenTaxaProduto
    */
    public void setVenTaxaProduto(double pVenTaxaProduto){
        this.venTaxaProduto = pVenTaxaProduto;
    }
    /**
    * @return venTaxaProduto
    */
    public double getVenTaxaProduto(){
        return this.venTaxaProduto;
    }

    /**
    * seta o valor de venBalancaKg
    * @param pVenBalancaKg
    */
    public void setVenBalancaKg(double pVenBalancaKg){
        this.venBalancaKg = pVenBalancaKg;
    }
    /**
    * @return venBalancaKg
    */
    public double getVenBalancaKg(){
        return this.venBalancaKg;
    }

    @Override
    public String toString(){
        return "ModelVendasProdutos {" + "::idVendaProduto = " + this.idVendaProduto + "::produto = " + this.produto + "::vendas = " + this.vendas + "::venProValor = " + this.venProValor + "::venProQuantidade = " + this.venProQuantidade + "::venTaxaProduto = " + this.venTaxaProduto + "::venBalancaKg = " + this.venBalancaKg +  "}";
    }
}