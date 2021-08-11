package model;
import java.util.Date;
/**
*
* @author Gabriela Silva de Almeida
*/
public class ModelAgua {

    private int id_agua;
    private String mes_agua;
    private Date data_validade;
    private Date data_pagamento;
    private float valor_agua;
    private float juros_agua;
    private String teste1;
    private String teste2;

    /**
    * Construtor
    */
    public ModelAgua(){}

    /**
    * seta o valor de id_energia
    * @param pId_energia
    */
    public void setId_agua(int pId_agua){
        this.id_agua = pId_agua;
    }
    /**
    * @return pk_id_energia
    */
    public int getId_agua(){
        return this.id_agua;
    }

    /**
    * seta o valor de mes_energia
    * @param pMes_energia
    */
    public void setMes_agua(String pMes_agua){
        this.mes_agua = pMes_agua;
    }
    /**
    * @return mes_energia
    */
    public String getMes_agua(){
        return this.mes_agua;
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
    public void setValor_agua(float pValor_agua){
        this.valor_agua = pValor_agua;
    }
    /**
    * @return valor_energia
    */
    public float getValor_agua(){
        return this.valor_agua;
    }

    /**
    * seta o valor de juros_energia
    * @param pJuros_energia
    */
    public void setJuros_agua(float pJuros_agua){
        this.juros_agua = pJuros_agua;
    }
    /**
    * @return juros_energia
    */
    public float getJuros_agua(){
        return this.juros_agua;
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
        return "ModelAgua {" + "::id_agua = " + this.id_agua + "::mes_agua = " + this.mes_agua + "::data_validade = " + this.data_validade + "::data_pagamento = " + this.data_pagamento + "::valor_energia = " + this.valor_agua + "::juros_agua = " + this.juros_agua + "::teste1 = " + this.teste1 + "::teste2 = " + this.teste2 +  "}";
    }
}