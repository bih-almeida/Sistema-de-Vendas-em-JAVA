package model;

import java.sql.Date;

/**
*
* @author Gabriela
*/
public class ModelVendas {

    /**
     * @return the parcela
     */
    public String getParcela() {
        return parcela;
    }

    /**
     * @return the parcela2
     */
    public String getParcela2() {
        return parcela2;
    }
    
    public void setParcela(String parcela) {
        this.parcela = parcela;
    }
    /**
     * @param parcela2 the parcela2 to set
     */
    public void setParcela2(String parcela2) {
        this.parcela2 = parcela2;
    }

    /**
     * @return the valorRecebido
     */
    public float getValorRecebido() {
        return valorRecebido;
    }

    /**
     * @param valorRecebido the valorRecebido to set
     */
    public void setValorRecebido(float valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    /**
     * @return the valorRecebido2
     */
    public float getValorRecebido2() {
        return valorRecebido2;
    }

    /**
     * @param valorRecebido2 the valorRecebido2 to set
     */
    public void setValorRecebido2(float valorRecebido2) {
        this.valorRecebido2 = valorRecebido2;
    }

    /**
     * @return the formaPagamento
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the formaPagamento to set
     */
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    /**
     * @return the formaPagamento2
     */
    public String getFormaPagamento2() {
        return formaPagamento2;
    }

    /**
     * @param formaPagamento2 the formaPagamento2 to set
     */
    public void setFormaPagamento2(String formaPagamento2) {
        this.formaPagamento2 = formaPagamento2;
    }

  
   

    private int idVenda;
    private int idCaixa;
    private int cliente;
    private Date VenDataVenda;
    private double VenValorLiquido;
    private double venValorBruto;
    private double venDesconto;
    private double venTaxa;
    private double venKg;
    private float valorRecebido;
    private float valorRecebido2;
    private String formaPagamento;
    private String formaPagamento2;
    private String parcela;
    private String parcela2;

    /**
    * Construtor
    */
    public ModelVendas(){}

    /**
    * seta o valor de idVenda
    * @param pIdVenda
    */
    public void setIdVenda(int pIdVenda){
        this.idVenda = pIdVenda;
    }
    /**
    * @return pk_idVenda
    */
    public int getIdVenda(){
        return this.idVenda;
    }

    /**
    * seta o valor de cliente
    * @param pCliente
    */
    public void setCliente(int pCliente){
        this.cliente = pCliente;
    }
    /**
    * @return fk_cliente
    */
    public int getCliente(){
        return this.cliente;
    }

    /**
    * seta o valor de VenDataVenda
    * @param pVenDataVenda
    */
    public void setVenDataVenda(Date pVenDataVenda){
        this.VenDataVenda = pVenDataVenda;
    }
    /**
    * @return VenDataVenda
    */
    public Date getVenDataVenda(){
        return this.VenDataVenda;
    }

    /**
    * seta o valor de VenValorLiquido
    * @param pVenValorLiquido
    */
    public void setVenValorLiquido(double pVenValorLiquido){
        this.VenValorLiquido = pVenValorLiquido;
    }
    /**
    * @return VenValorLiquido
    */
    public double getVenValorLiquido(){
        return this.VenValorLiquido;
    }

    /**
    * seta o valor de venValorBruto
    * @param pVenValorBruto
    */
    public void setVenValorBruto(double pVenValorBruto){
        this.venValorBruto = pVenValorBruto;
    }
    /**
    * @return venValorBruto
    */
    public double getVenValorBruto(){
        return this.venValorBruto;
    }

    /**
    * seta o valor de venDesconto
    * @param pVenDesconto
    */
    public void setVenDesconto(double pVenDesconto){
        this.venDesconto = pVenDesconto;
    }
    /**
    * @return venDesconto
    */
    public double getVenDesconto(){
        return this.venDesconto;
    }

    /**
    * seta o valor de venTaxa
    * @param pVenTaxa
    */
    public void setVenTaxa(double pVenTaxa){
        this.venTaxa = pVenTaxa;
    }
    /**
    * @return venTaxa
    */
    public double getVenTaxa(){
        return this.venTaxa;
    }

    /**
    * seta o valor de venKg
    * @param pVenKg
    */
    public void setVenKg(double pVenKg){
        this.venKg = pVenKg;
    }
    /**
    * @return venKg
    */
    public double getVenKg(){
        return this.venKg;
    }

    @Override
    public String toString(){
        return "ModelVendas {" + "::idVenda = " + this.idVenda + "::cliente = " + this.cliente + "::VenDataVenda = " + this.VenDataVenda + "::VenValorLiquido = " + this.VenValorLiquido + "::venValorBruto = " + this.venValorBruto + "::venDesconto = " + this.venDesconto + "::venTaxa = " + this.venTaxa + "::venKg = " + this.venKg + "::formaPagamento1 = " + this.formaPagamento + "::formaPagamento2 = " + this.formaPagamento2 + "::recebido1 = " + this.valorRecebido + "::recebido2 = " + this.valorRecebido2 + "::parcela1 = " + this.getParcela() + "::parcela2 = " + this.getParcela2() + "}";
    }

    /**
     * @return the idCaixa
     */
    public int getIdCaixa() {
        return idCaixa;
    }

    /**
     * @param idCaixa the idCaixa to set
     */
    public void setIdCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }
}