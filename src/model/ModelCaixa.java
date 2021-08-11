package model;

import static java.sql.JDBCType.VARCHAR;
import java.time.LocalDate;
import java.util.Date;

/**
*
* @author Gabriela
*/
public class ModelCaixa {

    /**
     * @return the troco
     */
    public float getTroco() {
        return troco;
    }

    /**
     * @return the valor_fechamento
     */
    public float getValor_fechamento() {
        return valor_fechamento;
    }

    /**
     * @param valor_fechamento the valor_fechamento to set
     */
    public void setValor_fechamento(float valor_fechamento) {
        this.valor_fechamento = valor_fechamento;
    }

    /**
     * @return the caixa_sangria_dinheiro
     */
    public float getCaixa_sangria_dinheiro() {
        return caixa_sangria_dinheiro;
    }

    /**
     * @param caixa_sangria_dinheiro the caixa_sangria_dinheiro to set
     */
    public void setCaixa_sangria_dinheiro(float caixa_sangria_dinheiro) {
        this.caixa_sangria_dinheiro = caixa_sangria_dinheiro;
    }
    
    
    /**
     * @return the sangria
     */
    public float getSangria() {
        return sangria;
    }

    /**
     * @param sangria the sangria to set
     */
    public void setSangria(float sangria) {
        this.sangria = sangria;
    }

    private int pk_caixa;
    private int fk_funcionario;
    private String hora_abertura;
    private Date data_abertura;
    private float valor_abertura;
    private float valor_fechamento;
    private int status_caixa;
    private float total_Movimentacoes;
    private float caixa_sangria;
    private String hora_fechamento;
    private Date data_fechamento;
    private float total_Credito;
    private float total_debito;
    private float total_dinheiro;
    private float sangria;
    private float caixa_sangria_dinheiro;
    private float troco;
    /**
    * Construtor
    */
    public ModelCaixa(){}

    public void setTroco(float troco) {
        this.troco = troco;
    }
    /**
    * seta o valor de pk_caixa
    * @param pPk_caixa
    */
    public void setPk_caixa(int pPk_caixa){
        this.pk_caixa = pPk_caixa;
    }
    /**
    * @return pk_pk_caixa
    */
    public int getPk_caixa(){
        return this.pk_caixa;
    }

    /**
    * seta o valor de fk_funcionario
    * @param pFk_funcionario
    */
    public void setFk_funcionario(int pFk_funcionario){
        this.fk_funcionario = pFk_funcionario;
    }
    /**
    * @return fk_fk_funcionario
    */
    public int getFk_funcionario(){
        return this.fk_funcionario;
    }

    /**
    * seta o valor de hora_abertuta
    * @param pHora_abertuta
    */
    public void setHora_abertuta(String pHora_abertuta){
        this.hora_abertura = pHora_abertuta;
    }
    /**
    * @return hora_abertuta
    */
    public String getHora_abertura(){
        return this.hora_abertura;
    }

    /**
    * seta o valor de data_abertura
    * @param pData_abertura
    */
    public void setData_abertura(Date pData_abertura){
        this.data_abertura = pData_abertura;
    }
    /**
    * @return data_abertura
    */
    public Date getData_abertura(){
        return this.data_abertura;
    }

    /**
    * seta o valor de valor_abertura
    * @param pValor_abertura
    */
    public void setValor_abertura(float pValor_abertura){
        this.valor_abertura = pValor_abertura;
    }
    /**
    * @return valor_abertura
    */
    public float getValor_abertura(){
        return this.valor_abertura;
    }

    /**
    * seta o valor de status_caixa
    * @param pStatus_caixa
    */
  
    /**
    * @return status_caixa
    */
  

    /**
    * seta o valor de total_Movimentacoes
    * @param pTotal_Movimentacoes
    */
    public void setTotal_Movimentacoes(float pTotal_Movimentacoes){
        this.total_Movimentacoes = pTotal_Movimentacoes;
    }
    
     public void setTotal_Credito (float pTotal_Credito){
        this.total_Credito = pTotal_Credito;
    }
     
     public void setTotal_Debito (float pTotal_Debito){
        this.total_debito = pTotal_Debito;
    }
     
       public void setTotal_Dinheiro (float pTotal_Dinheiro){
        this.total_dinheiro = pTotal_Dinheiro;
    }
    /**
    * @return total_Movimentacoes
    */
    public float getTotal_Movimentacoes(){
        return this.total_Movimentacoes;
    }

    public float getTotal_Credito(){
        return this.total_Credito;
    }
    
    public float getTotal_Debito(){
        return this.total_debito;
    }
    
     public float getTotal_Dinheiro(){
        return this.total_dinheiro;
    }
    /**
    * seta o valor de caixa_sangria
    * @param pCaixa_sangria
    */
    public void setTotal_Caixa_sangria(float pCaixa_sangria){
        this.caixa_sangria = pCaixa_sangria;
    }
    /**
    * @return caixa_sangria
    */
    public float getTotal_Caixa_sangria(){
        return this.caixa_sangria;
    }

    /**
    * seta o valor de hora_fechamento
    * @param pHora_fechamento
    */
    public void setHora_fechamento(String pHora_fechamento){
        this.hora_fechamento = pHora_fechamento;
    }
    /**
    * @return hora_fechamento
    */
    public String getHora_fechamento(){
        return this.hora_fechamento;
    }

    /**
    * seta o valor de data_fechamento
    * @param pData_fechamento
    */
    public void setData_fechamento(Date pData_fechamento){
        this.data_fechamento = pData_fechamento;
    }
    /**
    * @return data_fechamento
    */
    public Date getData_fechamento(){
        return this.data_fechamento;
    }

    

   // public Date setData_abertura(LocalDate localDate) {
   //     return this.data_abertura;
   // }

    /**
     * @return the status_caixa
     */
    public int getStatus_caixa() {
        return this.status_caixa;
    }

    /**
     * @param status_caixa the status_caixa to set
     */
    public void setStatus_caixa(int sstatus_caixa) {
        this.status_caixa = sstatus_caixa;
    }
    
    @Override
    public String toString(){
        return "ModelCaixa {" + "::pk_caixa = " + this.pk_caixa + "::fk_funcionario = " + this.fk_funcionario + "::hora_abertura = " + this.hora_abertura + "::data_abertura = " + this.data_abertura + "::valor_abertura = " + this.valor_abertura + "::valor_fechamento = " + this.valor_fechamento 
                + "::status_caixa = " + this.status_caixa + "::total_Movimentacoes = " + this.total_Movimentacoes + "::caixa_sangria = " + this.caixa_sangria + "::dinheiroCaixaSangria = " + this.caixa_sangria_dinheiro 
                + "::hora_fechamento = " + this.hora_fechamento + "::data_fechamento = " + this.data_fechamento + "::troco = " + this.troco + "}";
    }
}