package model;
import java.sql.Date;
/**
*
* @author Gabriela Silva de Almeida
*/
public class ModelEnergia {

    private int id_energia;
    private String mes_energia;
    private Date data_validade;
    private Date data_pagamento;
    private float valor_energia;
    private float juros_energia;
    private String teste1;
    private String teste2;

    /**
    * Construtor
    */
    public ModelEnergia(){}

    /**
    * seta o valor de id_energia
    * @param pId_energia
    */
    public void setId_energia(int pId_energia){
        this.id_energia = pId_energia;
    }
    /**
    * @return pk_id_energia
    */
    public int getId_energia(){
        return this.id_energia;
    }

    /**
    * seta o valor de mes_energia
    * @param pMes_energia
    */
    public void setMes_energia(String pMes_energia){
        this.mes_energia = pMes_energia;
    }
    /**
    * @return mes_energia
    */
    public String getMes_energia(){
        return this.mes_energia;
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
    * seta o valor de valor_energia
    * @param pValor_energia
    */
    public void setValor_energia(float pValor_energia){
        this.valor_energia = pValor_energia;
    }
    /**
    * @return valor_energia
    */
    public float getValor_energia(){
        return this.valor_energia;
    }

    /**
    * seta o valor de juros_energia
    * @param pJuros_energia
    */
    public void setJuros_energia(float pJuros_energia){
        this.juros_energia = pJuros_energia;
    }
    /**
    * @return juros_energia
    */
    public float getJuros_energia(){
        return this.juros_energia;
    }

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
    * seta o valor de teste2
    * @param pTeste2
    */
    public void setTeste2(String pTeste2){
        this.teste2 = pTeste2;
    }
    /**
    * @return teste2
    */
    public String getTeste2(){
        return this.teste2;
    }

    @Override
    public String toString(){
        return "Modelenergia {" + "::id_energia = " + this.id_energia + "::mes_energia = " + this.mes_energia + "::data_validade = " + this.data_validade + "::data_pagamento = " + this.data_pagamento + "::valor_energia = " + this.valor_energia + "::juros_energia = " + this.juros_energia + "::teste1 = " + this.teste1 + "::teste2 = " + this.teste2 +  "}";
    }
}