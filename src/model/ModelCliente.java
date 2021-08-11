package model;

import java.sql.Date;

/**
*
* @author Gabriela Silva de Almeida
*/
public class ModelCliente {

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nascimento
     */
    public Date getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return the cliQuantidade
     */
    public String getCliQuantidade() {
        return cliQuantidade;
    }

    /**
     * @param cliQuantidade the cliQuantidade to set
     */
    public void setCliQuantidade(String cliQuantidade) {
        this.cliQuantidade = cliQuantidade;
    }

    /**
     * @return the cliAcumulado
     */
    public float getCliAcumulado() {
        return cliAcumulado;
    }

    /**
     * @param cliAcumulado the cliAcumulado to set
     */
    public void setCliAcumulado(float cliAcumulado) {
        this.cliAcumulado = cliAcumulado;
    }

    private int idCliente;
    private String cliNome;
    private String cliEndereco;
    private String cliBairro;
    private String cliCidade;
    private String cliUF;
    private String cliCep;
    private String cliTelefone;
    private String cliQuantidade;
    private float cliAcumulado;
    private String cpf;
    private Date nascimento;
    /**
    * Construtor
    */
    public ModelCliente(){}

    /**
    * seta o valor de idCliente
    * @param pIdCliente
    */
    public void setIdCliente(int pIdCliente){
        this.idCliente = pIdCliente;
    }
    /**
    * @return pk_idCliente
    */
    public int getIdCliente(){
        return this.idCliente;
    }

    /**
    * seta o valor de cliNome
    * @param pCliNome
    */
    public void setCliNome(String pCliNome){
        this.cliNome = pCliNome;
    }
    /**
    * @return cliNome
    */
    public String getCliNome(){
        return this.cliNome;
    }

    /**
    * seta o valor de cliEndereco
    * @param pCliEndereco
    */
    public void setCliEndereco(String pCliEndereco){
        this.cliEndereco = pCliEndereco;
    }
    /**
    * @return cliEndereco
    */
    public String getCliEndereco(){
        return this.cliEndereco;
    }

    /**
    * seta o valor de cliBairro
    * @param pCliBairro
    */
    public void setCliBairro(String pCliBairro){
        this.cliBairro = pCliBairro;
    }
    /**
    * @return cliBairro
    */
    public String getCliBairro(){
        return this.cliBairro;
    }

    /**
    * seta o valor de cliCidade
    * @param pCliCidade
    */
    public void setCliCidade(String pCliCidade){
        this.cliCidade = pCliCidade;
    }
    /**
    * @return cliCidade
    */
    public String getCliCidade(){
        return this.cliCidade;
    }

    /**
    * seta o valor de cliUF
    * @param pCliUF
    */
    public void setCliUF(String pCliUF){
        this.cliUF = pCliUF;
    }
    /**
    * @return cliUF
    */
    public String getCliUF(){
        return this.cliUF;
    }

    /**
    * seta o valor de cliCep
    * @param pCliCep
    */
    public void setCliCep(String pCliCep){
        this.cliCep = pCliCep;
    }
    /**
    * @return cliCep
    */
    public String getCliCep(){
        return this.cliCep;
    }

    /**
    * seta o valor de cliTelefone
    * @param pCliTelefone
    */
    public void setCliTelefone(String pCliTelefone){
        this.cliTelefone = pCliTelefone;
    }
    /**
    * @return cliTelefone
    */
    public String getCliTelefone(){
        return this.cliTelefone;
    }

    @Override
    public String toString(){
        return "ModelCliente {" + "::idCliente = " + this.idCliente + "::cliNome = " + this.cliNome + "::cliEndereco = " + this.cliEndereco + "::cliBairro = " + this.cliBairro + "::cliCidade = " + this.cliCidade + "::cliUF = " + this.cliUF + "::cliCep = " + this.cliCep + "::cliTelefone = " + this.cliTelefone + "::quantidade_acumulado = " + this.cliQuantidade +  "::valor_acumulado = " + this.cliAcumulado + "::cpf = " + this.cpf + "::nascimento = " + this.nascimento + "}";
    }
} 