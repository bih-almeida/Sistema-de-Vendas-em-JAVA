package model;
/**
*
* @author Gabriela Silva de Almeida
*/
public class Modelfornecedor {

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the razao
     */
    public String getRazao() {
        return razao;
    }

    /**
     * @param razao the razao to set
     */
    public void setRazao(String razao) {
        this.razao = razao;
    }

    public int id_fornecedor;
    private String nome_fornecedor;
    private String telefone_fornecedor;
    private String endereco_fornecedor;
    private String responsavel_fornecedor;
    private String ramo_fornecedor;
    private String cidade_fornecedor;
    private String estado_fornecedor;
    private String bairro_fornecedor;
    private String cnpj;
    private String razao;
    
    /**
    * Construtor
    */
    public Modelfornecedor(){}

    /**
    * seta o valor de id_fornecedor
    * @param pId_fornecedor
    */
    public void setId_fornecedor(int pId_fornecedor){
        this.id_fornecedor = pId_fornecedor;
    }
    /**
    * @return pk_id_fornecedor
    */
    public int getId_fornecedor(){
        return this.id_fornecedor;
    }

    /**
    * seta o valor de nome_fornecedor
    * @param pNome_fornecedor
    */
    public void setNome_fornecedor(String pNome_fornecedor){
        this.nome_fornecedor = pNome_fornecedor;
    }
    /**
    * @return nome_fornecedor
    */
    public String getNome_fornecedor(){
        return this.nome_fornecedor;
    }

    /**
    * seta o valor de telefone_fornecedor
    * @param pTelefone_fornecedor
    */
    public void setTelefone_fornecedor(String pTelefone_fornecedor){
        this.telefone_fornecedor = pTelefone_fornecedor;
    }
    /**
    * @return telefone_fornecedor
    */
    public String getTelefone_fornecedor(){
        return this.telefone_fornecedor;
    }

    /**
    * seta o valor de endereco_fornecedor
    * @param pEndereco_fornecedor
    */
    public void setEndereco_fornecedor(String pEndereco_fornecedor){
        this.endereco_fornecedor = pEndereco_fornecedor;
    }
    /**
    * @return endereco_fornecedor
    */
    public String getEndereco_fornecedor(){
        return this.endereco_fornecedor;
    }

    /**
    * seta o valor de responsavel_fornecedor
    * @param pResponsavel_fornecedor
    */
    public void setResponsavel_fornecedor(String pResponsavel_fornecedor){
        this.responsavel_fornecedor = pResponsavel_fornecedor;
    }
    /**
    * @return responsavel_fornecedor
    */
    public String getResponsavel_fornecedor(){
        return this.responsavel_fornecedor;
    }

    /**
    * seta o valor de ramo_fornecedor
    * @param pRamo_fornecedor
    */
    public void setRamo_fornecedor(String pRamo_fornecedor){
        this.ramo_fornecedor = pRamo_fornecedor;
    }
    /**
    * @return ramo_fornecedor
    */
    public String getRamo_fornecedor(){
        return this.ramo_fornecedor;
    }
    
     public void setEstado_fornecedor(String pEstado_fornecedor){
        this.estado_fornecedor = pEstado_fornecedor;
    }
    /**
    * @return estado_fornecedor
    */
    public String getEstado_fornecedor(){
        return this.estado_fornecedor;
    }

    /**
    * seta o valor de cidade_fornecedor
    * @param pCidade_fornecedor
    */
    public void setCidade_fornecedor(String pCidade_fornecedor){
        this.cidade_fornecedor = pCidade_fornecedor;
    }
    /**
    * @return cidade_fornecedor
    */
    public String getCidade_fornecedor(){
        return this.cidade_fornecedor;
    }

    /**
    * seta o valor de estado_fornecedor
    * @param pEstado_fornecedor
    */
   

    @Override
    public String toString(){
        return "Modelfornecedor {" + "::id_fornecedor = " + this.id_fornecedor + "::nome_fornecedor = " + this.nome_fornecedor + "::telefone_fornecedor = " + this.telefone_fornecedor + "::endereco_fornecedor = " + this.endereco_fornecedor + "::responsavel_fornecedor = " 
                + this.responsavel_fornecedor + "::ramo_fornecedor = " + this.ramo_fornecedor + "::cidade_fornecedor = " + this.cidade_fornecedor 
                + "::estado_fornecedor = " + this.estado_fornecedor + "::cnpj = " + this.cnpj 
                + "::razao = " + this.razao + "}";
    }

    /**
     * @return the bairro_fornecedor
     */
    public String getBairro_fornecedor() {
        return bairro_fornecedor;
    }

    /**
     * @param bairro_fornecedor the bairro_fornecedor to set
     */
    public void setBairro_fornecedor(String bairro_fornecedor) {
        this.bairro_fornecedor = bairro_fornecedor;
    }

    }