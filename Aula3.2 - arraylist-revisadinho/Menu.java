import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    /*
     * CRUD
     * C - CREATE - CRIRA / CADASTRAR
     * R - READ - LER / EXIBIR / CONSULTAR
     * U - UPDATE - ATUALIZAR
     * D - DELETE - DELETAR
     */

    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);
    private Scanner sc2 = new Scanner(System.in);

    Menu() {

        int opcao = 0;

        do {

            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Exibir");
            System.out.println("3 - Buscar por nome");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Deletar");
            System.out.println("6 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cadastarPessoa();
                    break;
                case 2:
                    consultarPessoas();
                    break;
                case 3:
                    buscarNome();
                    break;
                case 4:
                    atualizar();
                    break;
                case 5:
                    deletar();
                    break;
                case 6:
                    System.out.println("\nSAINDO...");
                    break;
                default:
                    System.out.println("\nOPCAO INVALIDA");
                    break;
            }

        } while (opcao != 6);
    }

    private void cadastarPessoa() {
        System.out.println("\nDigite o nome:");
        String nome = sc2.nextLine();
        System.out.println("\nDigite a idade:");
        int idade = sc.nextInt();
        Pessoa pessoa = new Pessoa(nome, idade);
        pessoas.add(pessoa);
    }

    /*
     * FOR EACH
     * 
     * Dica: Usar só em casos para exibir ou obter valores de um array
     * 
     * for (tipoDoArray nomeDoArrayNoSingular: array){
     * 
     *      //operacao
     * 
     * }
     */

    private void consultarPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
            System.out.println(pessoa.getIdade());
        }
    }

    private void buscarNome() {
        System.out.println("\nDigite o nome:");
        String nome = sc2.nextLine();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                System.out.println(pessoa.getNome());
                System.out.println(pessoa.getIdade());
                break;
            }
        }

        /*
         * for (int i = 0; i < pessoas.size(); i++) {
         * if(pessoas.get(i).getNome().equalsIgnoreCase(nome)){
         * System.out.println(pessoas.get(i).getNome());
         * System.out.println(pessoas.get(i).getIdade());
         * break;
         * }
         * }
         */
    }

    private void atualizar() {
        System.out.println("\nDigite o nome:");
        String nome = sc2.nextLine();

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().equalsIgnoreCase(nome)) {

                System.out.println("\nContato encontrado!\n");

                System.out.println("Digite o novo nome:");
                String nome2 = sc2.nextLine();
                System.out.println("\nDigite a nova idade:");
                int idade = sc.nextInt();

                pessoas.get(i).setNome(nome2);
                pessoas.get(i).setIdade(idade);

                /*Pessoa pessoa = new Pessoa(nome2, idade);
                pessoas.set(i, pessoa);*/
                break;
            }
        }
    }

    private void deletar(){
        System.out.println("\nDigite o nome:");
        String nome = sc2.nextLine();

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().equalsIgnoreCase(nome)) {
                pessoas.remove(i);
                break;
            }
        }
    }

}
