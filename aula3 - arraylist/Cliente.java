import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    
    // Atributos da classe Cliente

    private String nome;
    private String telefone;
    private String cpf;
    private Endereco endereco;
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    // Construtores da classe Cliente

    public Cliente(){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n   -- Resgistre os dados do Cliente --");
        System.out.println("\nNome: ");
        nome = sc.nextLine();
        System.out.println("\nTelefone: ");
        telefone = sc.nextLine();
        System.out.println("\nCPF: ");
        cpf = sc.nextLine();
        endereco = new Endereco();
    }

    // Métodos da classe Cliente

    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("CPF: " + cpf);
        endereco.exibir();
    }

    // Métodos getters e setters da classe Cliente

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(ArrayList<ContaBancaria> contas) {
        this.contas = contas;
    }
}
