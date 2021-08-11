package model;

import java.sql.Date;

/**
*
* @author Gabriela Silva de Almeida
*/
public class ModelSalario {

    /**
     * @return the he_50
     */
    public String getHe_50() {
        return he_50;
    }

    /**
     * @param he_50 the he_50 to set
     */
    public void setHe_50(String he_50) {
        this.he_50 = he_50;
    }

    /**
     * @return the he_100
     */
    public String getHe_100() {
        return he_100;
    }

    /**
     * @param he_100 the he_100 to set
     */
    public void setHe_100(String he_100) {
        this.he_100 = he_100;
    }

    /**
     * @return the fk_funcionario
     */
    public String getFk_funcionario() {
        return fk_funcionario;
    }

    /**
     * @param fk_funcionario the fk_funcionario to set
     */
    public void setFk_funcionario(String fk_funcionario) {
        this.fk_funcionario = fk_funcionario;
    }

    /**
     * @return the fk_funcionario
     */
   

    private int id_salario;
    private String fk_funcionario;
    private float total_salario_mes;
    private Date data_validade;
    private Date data_pagamento;
    private float valor_salario_hora;
    private String he_50;
    private String he_100;
    private String teste1;
    private String teste2;

    /**
    * Construtor
    */
    public ModelSalario(){}

    /**
    * seta o valor de id_salario
    * @param pId_salario
    */
    public void setId_salario(int pId_salario){
        this.id_salario = pId_salario;
    }
    /**
    * @return pk_id_salario
    */
    public int getId_salario(){
        return this.id_salario;
    }

    /**
    * seta o valor de fk_funcionario
    * @param pFk_funcionario
    */
    
    /**
    * @return fk_funcionario
    */
   

    /**
    * seta o valor de total_salario_mes
    * @param pTotal_salario_mes
    */
    public void setTotal_salario_mes(float pTotal_salario_mes){
        this.total_salario_mes = pTotal_salario_mes;
    }
    /**
    * @return total_salario_mes
    */
    public float getTotal_salario_mes(){
        return this.total_salario_mes;
    }

    /**
    * seta o valor de data_validade
    * @param pData_validade
    */
    public void setData_validade(Date pData_validade){
        this.data_validade = pData_validade;
    }
    /**
    * @return data_validade
    */
    public Date getData_validade(){
        return this.data_validade;
    }

    /**
    * seta o valor de data_pagamento
    * @param pData_pagamento
    */
    public void setData_pagamento(Date pData_pagamento){
        this.data_pagamento = pData_pagamento;
    }
    /**
    * @return data_pagamento
    */
    public Date getData_pagamento(){
        return this.data_pagamento;
    }

    /**
    * seta o valor de valor_salario_hora
    * @param pValor_salario_hora
    */
    public void setValor_salario_hora(float pValor_salario_hora){
        this.valor_salario_hora = pValor_salario_hora;
    }
    /**
    * @return valor_salario_hora
    */
    public float getValor_salario_hora(){
        return this.valor_salario_hora;
    }

    /**
    * seta o valor de he_50
    * @param pHe_50
    */
   

    /**
    * seta o valor de teste1
    * @param pTeste1
    */
    public void setTeste1(String pTeste1){
        this.teste1 = pTeste1;
    }
    /**
    * @return teste1
    */
    public String getTeste1(){
        return this.teste1;
    }

    /**
    * seta o valor de teste1
    * @param pTeste1
    */
    public void setTeste2(String pTeste2){
        this.teste2 = pTeste2;
    }
    /**
    * @return teste1
    */
    public String getTeste2(){
        return this.teste2;
    }

    @Override
    public String toString(){
        return "Modelsalario {" + "::id_salario = " + this.id_salario + "::fk_funcionario = " + this.getFk_funcionario() + 
                "::total_salario_mes = " + this.total_salario_mes + "::data_validade = " + this.data_validade + "::data_pagamento = " + this.data_pagamento + "::valor_salario_hora = " + this.valor_salario_hora + "::he_50 = " + this.getHe_50() + "::he_100 = " + this.getHe_100() + "::teste1 = " + this.teste1 + "}";
    }
}