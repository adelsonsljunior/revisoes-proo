import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);
    private Scanner sc2 = new Scanner(System.in);

    public Menu() {

        int opcao = 0;

        do {
            System.out.println("\n**************************************************");
            System.out.println("                            MENU");
            System.out.println("***************************************************");
            System.out.println("1 - Cadastar Medico");
            System.out.println("2 - Cadastar Atendente");
            System.out.println("3 - Exibir Funcionarios com salario maior que 2000");
            System.out.println("4 - Atualizar CEP de um funcionario");
            System.out.println("5 - Remover Funcionario");
            System.out.println("6 - Sair");
            System.out.println("*****************************************************");
            opcao = sc.nextInt();
            System.out.println("****************************************\n");

            switch (opcao) {
                case 1:
                    cadastrarMedico();
                    break;
                case 2:
                    cadastrarAtendente();
                    break;
                case 3:
                    exibirFuncionario();
                    break;
                case 4:
                    atualizarCepFuncionario();
                    break;
                case 5:
                    removerFuncionario();
                    break;
                case 6:
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("OPCAO INVALIDA");
                    break;
            }

        } while (opcao != 6);
    }

    private void cadastrarMedico() {

        System.out.println("Digite o nome:");
        String nome = sc2.nextLine();
        System.out.println("Digite o CPF:");
        String cpf = sc2.nextLine();
        System.out.println("Digite a especialidade:");
        String especialidade = sc2.nextLine();
        System.out.println("Digite a amtricula:");
        String matricula = sc2.nextLine();

        System.out.println("Digite o valor do salario minimo:");
        double salarioMinimo = sc.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas por dia:");
        int horas = sc.nextInt();
        double salario = salarioMinimo + 150 * horas;

        System.out.println("Digite a cidade:");
        String cidade = sc2.nextLine();
        System.out.println("Digite o CEP: ");
        String cep = sc2.nextLine();
        System.out.println("Digite o bairro:");
        String bairro = sc2.nextLine();
        System.out.println("Digite a rua");
        String rua = sc2.nextLine();

        Endereco endereco = new Endereco(cidade, cep, bairro, rua);

        Funcionario medico = new Medico(nome, cpf, salario, endereco, especialidade, matricula);

        funcionarios.add(medico);
    }

    private void cadastrarAtendente() {

        boolean fixo;
        double salario;

        System.out.println("Digite o nome:");
        String nome = sc2.nextLine();
        System.out.println("Digite o CPF:");
        String cpf = sc2.nextLine();
        System.out.println("É um atedente fixo ? (1 - sim / 2 - não):");
        int resp = sc.nextInt();
        if (resp == 1) {
            fixo = true;
        } else {
            fixo = false;
        }

        if (fixo == true) {
            System.out.println("Digite o valor do salario minimo:");
            double salarioMinimo = sc.nextDouble();
            salario = salarioMinimo;
        } else {
            System.out.println("Digite a quantidade de dias trabalhadas:");
            int dias = sc.nextInt();
            salario = 70 * dias;
        }

        System.out.println("Digite a cidade:");
        String cidade = sc2.nextLine();
        System.out.println("Digite o CEP: ");
        String cep = sc2.nextLine();
        System.out.println("Digite o bairro:");
        String bairro = sc2.nextLine();
        System.out.println("Digite a rua");
        String rua = sc2.nextLine();

        Endereco endereco = new Endereco(cidade, cep, bairro, rua);

        Funcionario atendente = new Atendente(nome, cpf, salario, endereco, fixo);
        
        funcionarios.add(atendente);
    }

    private void exibirFuncionario() {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getSalario() > 2000) {
                funcionario.exibir();
            }
        }
    }

    private void atualizarCepFuncionario() {

        System.out.println("Digite o nome do funcionario: ");
        String nome = sc2.nextLine();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {

                System.out.println("\nDigite o novo cep");
                String cep = sc2.nextLine();

                funcionario.atualizarCep(cep);
                System.out.println("\nCEP ATUALIZADO COM SUCESSO");
                break;
            }
        }
    }

    private void removerFuncionario() {

        System.out.println("Digite o nome do funcionario: ");
        String nome = sc2.nextLine();

        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getNome().equalsIgnoreCase(nome)) {
                funcionarios.remove(i);
                System.out.println("\nFUNCIONARIO REMOVIDO COM SUCESSO");
                break;
            }
        }
    }
}