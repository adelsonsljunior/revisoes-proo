import java.util.Scanner;

public class Endereco {
    
    // Atributos da classe Endereco

    private String cidade;
    private String bairro;
    private String rua;
    private String cep;

    // Construtores da classe Endereco

    public Endereco(){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n   -- Resgistre os dados do Endereço --");
        System.out.println("\nCidade: ");
        cidade = sc.nextLine();
        System.out.println("\nBairrao: ");
        bairro = sc.nextLine();
        System.out.println("\nRua: ");
        rua = sc.nextLine();
        System.out.println("\nCEP: ");
        cep = sc.nextLine();
    }

    // Métodos da classe Endereco

    public void exibir(){
        System.out.println("Cidade: " + cidade);
        System.out.println("Bairrao: " + bairro);
        System.out.println("Rua: " + rua);
        System.out.println("CEP: " + cep);
    }
}
