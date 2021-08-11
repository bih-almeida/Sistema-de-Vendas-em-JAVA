package model;
import java.sql.Date;
/**
*
* @author Gabriela Silva de Almeida
*/
public class Modeldespesas {

    private int id_despesas;
    private int extras_despesas;
    private Date data_validade;
    private Date data_pagamento;
    private float valor_despesas;
    private float juros_despesas;
    private String teste1;
    private String teste2;

    /**
    * Construtor
    */
    public Modeldespesas(){}

    /**
    * seta o valor de id_despesas
    * @param pId_despesas
    */
    public void setId_despesas(int pId_despesas){
        this.id_despesas = pId_despesas;
    }
    /**
    * @return pk_id_despesas
    */
    public int getId_despesas(){
        return this.id_despesas;
    }

    /**
    * seta o valor de extras_despesas
    * @param pExtras_despesas
    */
    public void setExtras_despesas(int pExtras_despesas){
        this.extras_despesas = pExtras_despesas;
    }
    /**
    * @return extras_despesas
    */
    public int getExtras_despesas(){
        return this.extras_despesas;
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
    * seta o valor de valor_despesas
    * @param pValor_despesas
    */
    public void setValor_despesas(float pValor_despesas){
        this.valor_despesas = pValor_despesas;
    }
    /**
    * @return valor_despesas
    */
    public float getValor_despesas(){
        return this.valor_despesas;
    }

    /**
    * seta o valor de juros_despesas
    * @param pJuros_despesas
    */
    public void setJuros_despesas(float pJuros_despesas){
        this.juros_despesas = pJuros_despesas;
    }
    /**
    * @return juros_despesas
    */
    public float getJuros_despesas(){
        return this.juros_despesas;
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
        return "Modeldespesas {" + "::id_despesas = " + this.id_despesas + "::extras_despesas = " + this.extras_despesas + "::data_validade = " + this.data_validade + "::data_pagamento = " + this.data_pagamento + "::valor_despesas = " + this.valor_despesas + "::juros_despesas = " + this.juros_despesas + "::teste1 = " + this.teste1 + "::teste2 = " + this.teste2 +  "}";
    }
}