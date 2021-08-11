package model;

import java.util.Date;

/**
*
* @author Gabriela Silva de Almeida
*/
public class ModelPromocao {

    private int id_promocao;
    private String nome_promocao;
    private String valor_promocao;
    private String acumulado_promocao;
    private String disponibilidade_promocao;
    private Date validade_promocao;
    private String teste1;
    private String teste2;

    /**
    * Construtor
    */
    public ModelPromocao(){}

    /**
    * seta o valor de id_promocao
    * @param pId_promocao
    */
    public void setId_promocao(int pId_promocao){
        this.id_promocao = pId_promocao;
    }
    /**
    * @return pk_id_promocao
    */
    public int getId_promocao(){
        return this.id_promocao;
    }

    /**
    * seta o valor de nome_promocao
    * @param pNome_promocao
    */
    public void setNome_promocao(String pNome_promocao){
        this.nome_promocao = pNome_promocao;
    }
    /**
    * @return nome_promocao
    */
    public String getNome_promocao(){
        return this.nome_promocao;
    }

    /**
    * seta o valor de valor_promocao
    * @param pValor_promocao
    */
    public void setValor_promocao(String pValor_promocao){
        this.valor_promocao = pValor_promocao;
    }
    /**
    * @return valor_promocao
    */
    public String getValor_promocao(){
        return this.valor_promocao;
    }

    /**
    * seta o valor de acumulado_promocao
    * @param pAcumulado_promocao
    */
    public void setAcumulado_promocao(String pAcumulado_promocao){
        this.acumulado_promocao = pAcumulado_promocao;
    }
    /**
    * @return acumulado_promocao
    */
    public String getAcumulado_promocao(){
        return this.acumulado_promocao;
    }

    /**
    * seta o valor de disponibilidade_promocao
    * @param pDisponibilidade_promocao
    */
    public void setDisponibilidade_promocao(String pDisponibilidade_promocao){
        this.disponibilidade_promocao = pDisponibilidade_promocao;
    }
    /**
    * @return disponibilidade_promocao
    */
    public String getDisponibilidade_promocao(){
        return this.disponibilidade_promocao;
    }

    /**
    * seta o valor de validade_promocao
    * @param pValidade_promocao
    */
    public void setValidade_promocao(Date pValidade_promocao){
        this.validade_promocao = pValidade_promocao;
    }
    /**
    * @return validade_promocao
    */
    public Date getValidade_promocao(){
        return this.validade_promocao;
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
        return "Modelpromocao {" + "::id_promocao = " + this.id_promocao + "::nome_promocao = " + this.nome_promocao + "::valor_promocao = " + this.valor_promocao + "::acumulado_promocao = " + this.acumulado_promocao + "::disponibilidade_promocao = " + this.disponibilidade_promocao + "::validade_promocao = " + this.validade_promocao + "::teste1 = " + this.teste1 + "::teste2 = " + this.teste2 +  "}";
    }
}