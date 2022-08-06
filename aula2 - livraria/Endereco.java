import java.util.Scanner;

public class Endereco {

    // Atributos da classe Endereco
    
    private String cep;
    private String estado;
    private String cidade;
    
    // Construtores da classe Endereco

    public Endereco(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n   -- Registre o Endereço --");
        System.out.println("\nCEP: ");
        cep = leitor.nextLine();
        System.out.println("\nEstado: ");
        estado = leitor.nextLine();
        System.out.println("\nCidade: ");
        cidade = leitor.nextLine();
    }

    // Métodos da classe Endereco

    public void exibir(){
        System.out.println("\n   -- Endereço --");
        System.out.println("\nCEP: " + cep);
        System.out.println("\nEstado: " + estado);
        System.out.println("\nCidade: " + cidade);
    }

    // Métodos gets e sets da classe Endereco

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
