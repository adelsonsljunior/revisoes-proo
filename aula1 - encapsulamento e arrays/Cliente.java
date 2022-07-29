import java.util.Scanner;

public class Cliente {
    
    // Atributos da classe Cliente

    private String nome;
    private String cpf;
    private String telefone;

    private Scanner sc = new Scanner(System.in);

    // Construtor da Classe Cliente

    public Cliente(){
        System.out.println("\n  -- Registre os Dados do Clinete --");
        System.out.println("\nDigite o nome do cliente: ");
        nome = sc.nextLine();
        System.out.println("\nDigite o cpf do cliente: ");
        cpf = sc.nextLine();
        System.out.println("\nDigite o telefone do cliente: ");
        telefone = sc.nextLine();
    }

    // Métodos da Classe Cliente

    public void exibir(){
        System.out.println("\n  -- Dados do Clinete --");
        System.out.println("\nNome: " + nome);
        System.out.println("\nCPF: " + cpf);
        System.out.println("\nTelefone: " + telefone);
    }

    // Métodos gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }






}
