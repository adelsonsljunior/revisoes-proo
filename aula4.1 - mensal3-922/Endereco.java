public class Endereco {
    
    private String cidade;
    private String cep;
    private String bairro;
    private String rua;
    
    public Endereco(String cidade, String cep, String bairro, String rua) {
        this.cidade = cidade;
        this.cep = cep;
        this.bairro = bairro;
        this.rua = rua;
    }


    public void exibir(){

        System.out.println("Cidade: " + cidade + "\nCEP: " + cep + "\nBairro: " + bairro + "\nRua: " + rua); 
        
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
}
