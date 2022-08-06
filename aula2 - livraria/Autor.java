import java.util.Scanner;

public class Autor {
    
    // Atributos da classe Autor
    
    private String nome;
    private String email;
    private Endereco endereco;
    
    // Construtores da classe Autor

    public Autor(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n   -- Registre o Autor --");
        System.out.println("\nNome: ");
        nome = leitor.nextLine();
        System.out.println("\nEmail: ");
        email = leitor.nextLine();
        endereco = new Endereco();
    }

    // Métodos da classe Autor

    public void exibir(){
        System.out.println("\n   -- Registre o Endereço --");
        System.out.println("\nNome: " + nome);
        System.out.println("\nEmail: " + email);
        endereco.exibir();
    }

    // Métodos gets e sets da classe Autor

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
