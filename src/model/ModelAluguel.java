package model;
import java.sql.Date;
/**
*
* @author Gabriela Silva de Almeida
*/
public class ModelAluguel {

    private int id_aluguel;
    private String mes_aluguel;
    private Date data_validade;
    private Date data_pagamento;
    private float valor_aluguel;
    private float juros_aluguel;
    private String teste1;
    private String teste2;

    /**
    * Construtor
    */
    public ModelAluguel(){}

    /**
    * seta o valor de id_aluguel
    * @param pId_aluguel
    */
    public void setId_aluguel(int pId_aluguel){
        this.id_aluguel = pId_aluguel;
    }
    /**
    * @return pk_id_aluguel
    */
    public int getId_aluguel(){
        return this.id_aluguel;
    }

    /**
    * seta o valor de mes_aluguel
    * @param pMes_aluguel
    */
    public void setMes_aluguel(String pMes_aluguel){
        this.mes_aluguel = pMes_aluguel;
    }
    /**
    * @return mes_aluguel
    */
    public String getMes_aluguel(){
        return this.mes_aluguel;
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
    * seta o valor de valor_aluguel
    * @param pValor_aluguel
    */
    public void setValor_aluguel(float pValor_aluguel){
        this.valor_aluguel = pValor_aluguel;
    }
    /**
    * @return valor_aluguel
    */
    public float getValor_aluguel(){
        return this.valor_aluguel;
    }

    /**
    * seta o valor de juros_aluguel
    * @param pJuros_aluguel
    */
    public void setJuros_aluguel(float pJuros_aluguel){
        this.juros_aluguel = pJuros_aluguel;
    }
    /**
    * @return juros_aluguel
    */
    public float getJuros_aluguel(){
        return this.juros_aluguel;
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
        return "ModelAluguel {" + "::id_aluguel = " + this.id_aluguel + "::mes_aluguel = " + this.mes_aluguel + "::data_validade = " + this.data_validade + "::data_pagamento = " + this.data_pagamento + "::valor_aluguel = " + this.valor_aluguel + "::juros_aluguel = " + this.juros_aluguel + "::teste1 = " + this.teste1 + "::teste2 = " + this.teste2 +  "}";
    }
}