package model;

import java.sql.Date;

/**
*
* @author Gabriela Silva de Almeida
*/
public class ModelTelefone {

    private int id_telefone;
    private String mes_telefone;
    private Date data_validade;
    private Date data_pagamento;
    private float valor_telefone;
    private float juros_telefone;
    private String teste1;
    private String teste2;

    /**
    * Construtor
    */
    public ModelTelefone(){}

    /**
    * seta o valor de id_telefone
    * @param pId_telefone
    */
    public void setId_telefone(int pId_telefone){
        this.id_telefone = pId_telefone;
    }
    /**
    * @return pk_id_telefone
    */
    public int getId_telefone(){
        return this.id_telefone;
    }

    /**
    * seta o valor de mes_telefone
    * @param pMes_telefone
    */
    public void setMes_telefone(String pMes_telefone){
        this.mes_telefone = pMes_telefone;
    }
    /**
    * @return mes_telefone
    */
    public String getMes_telefone(){
        return this.mes_telefone;
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
    * seta o valor de valor_telefone
    * @param pValor_telefone
    */
    public void setValor_telefone(float pValor_telefone){
        this.valor_telefone = pValor_telefone;
    }
    /**
    * @return valor_telefone
    */
    public float getValor_telefone(){
        return this.valor_telefone;
    }

    /**
    * seta o valor de juros_telefone
    * @param pJuros_telefone
    */
    public void setJuros_telefone(float pJuros_telefone){
        this.juros_telefone = pJuros_telefone;
    }
    /**
    * @return juros_telefone
    */
    public float getJuros_telefone(){
        return this.juros_telefone;
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
        return "Modeltelefone {" + "::id_telefone = " + this.id_telefone + "::mes_telefone = " + this.mes_telefone + "::data_validade = " + this.data_validade + "::data_pagamento = " + this.data_pagamento + "::valor_telefone = " + this.valor_telefone + "::juros_telefone = " + this.juros_telefone + "::teste1 = " + this.teste1 + "::teste2 = " + this.teste2 +  "}";
    }
}