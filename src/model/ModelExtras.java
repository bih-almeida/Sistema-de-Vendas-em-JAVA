package model;
import java.sql.Date;
/**
*
* @author Gabriela Silva de Almeida
*/
public class ModelExtras {

    private int id_extras;
    private String mes_extras;
    private Date data_validade;
    private Date data_pagamento;
    private float valor_extras;
    private float juros_extras;
    private String teste1;
    private String teste2;

    /**
    * Construtor
    */
    public ModelExtras(){}

    /**
    * seta o valor de id_extras
    * @param pId_extras
    */
    public void setId_extras(int pId_extras){
        this.id_extras = pId_extras;
    }
    /**
    * @return pk_id_extras
    */
    public int getId_extras(){
        return this.id_extras;
    }

    /**
    * seta o valor de mes_extras
    * @param pMes_extras
    */
    public void setMes_extras(String pMes_extras){
        this.mes_extras = pMes_extras;
    }
    /**
    * @return mes_extras
    */
    public String getMes_extras(){
        return this.mes_extras;
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
    * seta o valor de valor_extras
    * @param pValor_extras
    */
    public void setValor_extras(float pValor_extras){
        this.valor_extras = pValor_extras;
    }
    /**
    * @return valor_extras
    */
    public float getValor_extras(){
        return this.valor_extras;
    }

    /**
    * seta o valor de juros_extras
    * @param pJuros_extras
    */
    public void setJuros_extras(float pJuros_extras){
        this.juros_extras = pJuros_extras;
    }
    /**
    * @return juros_extras
    */
    public float getJuros_extras(){
        return this.juros_extras;
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
        return "Modelextras {" + "::id_extras = " + this.id_extras + "::mes_extras = " + this.mes_extras + "::data_validade = " + this.data_validade + "::data_pagamento = " + this.data_pagamento + "::valor_extras = " + this.valor_extras + "::juros_extras = " + this.juros_extras + "::teste1 = " + this.teste1 + "::teste2 = " + this.teste2 +  "}";
    }
}