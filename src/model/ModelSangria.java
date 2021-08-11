package model;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.ArrayList;
import java.util.Date;

/**
*
* @author Gabriela Silva de Almeida
*/
public class ModelSangria {

    public int pk_sangria;
    public double valor_sangria;
    public Date date_sangria;
    public int fk_caixa;
    

    /**
    * Construtor
    */
    public ModelSangria(){}

    /**
    * seta o valor de pk_sangria
    * @param pPk_sangria
    */
    public void setPk_sangria(int pPk_sangria){
        this.pk_sangria = pPk_sangria;
    }
    /**
    * @return pk_sangria
    */
    public int getPk_sangria(){
        return this.pk_sangria;
    }

    /**
    * seta o valor de valor_sangria
    * @param pValor_sangria
    */
    public void setValor_sangria(double pValor_sangria){
        this.valor_sangria = pValor_sangria;
    }
    /**
    * @return valor_sangria
    */
    public double getValor_sangria(){
        return this.valor_sangria;
    }

    /**
    * seta o valor de date_sangria
    * @param pDate_sangria
    */
    public void setDate_sangria(Date pDate_sangria){
        this.date_sangria = pDate_sangria;
    }
    /**
    * @return date_sangria
    */
    public Date getDate_sangria(){
        return this.date_sangria;
    }

    /**
    * seta o valor de fk_caixa
    * @param pFk_caixa
    */
    public void setFk_caixa(int pFk_caixa){
        this.fk_caixa = pFk_caixa;
    }
    /**
    * @return fk_caixa
    */
    public int getFk_caixa(){
        return this.fk_caixa;
    }

    @Override
    public String toString(){
        return "ModelSangria {" + "::pk_sangria = " + this.pk_sangria + "::valor_sangria = " + this.valor_sangria + "::date_sangria = " + this.date_sangria + "::fk_caixa = " + this.fk_caixa +  "}";
    }

  
}