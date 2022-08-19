import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);
    private Scanner sc2 = new Scanner(System.in);

    // Construtores da classe Menu

    public Menu() {
        int opcao = 0;

        do {

            System.out.println("\n**************************************");
            System.out.println("                       Menu ");
            System.out.println("****************************************");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Conta de um Cliente");
            System.out.println("3 - Exibir Clientes");
            System.out.println("4 - Exibir Contas de um Cliente");
            System.out.println("5 - Exibir Saldo de uma Conta");
            System.out.println("6 - Depositar em uma Conta");
            System.out.println("7 - Sacar de uma Conta");
            System.out.println("8 - Transferir de uma Conta para outra");
            System.out.println("9 - Sair");
            System.out.println("****************************************");
            opcao = sc.nextInt();
            System.out.println("****************************************\n");

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarContaCliente();
                    break;
                case 3:
                    exibirClientes();
                    break;
                case 4:
                    exibirContasDoCliente();
                    break;
                case 5:
                    deposito();
                    break;
                case 6:
                    saque();
                    break;
                case 7:
                    transferencia();
                    break;
                case 8:
                    encerrarConta();
                    break;
                case 9:
                    System.out.println("\nSaindo do programa...");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }

        } while (true);
    }

    // Método da classe Menu

    private void cadastrarCliente() {
        Cliente cliente = new Cliente();
        clientes.add(cliente);
    }

    private void cadastrarContaCliente() {

        System.out.println("\nDigite o nome do cliente: ");
        String nome = sc2.nextLine();

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equalsIgnoreCase(nome)) {
                ContaBancaria conta = new ContaBancaria();
                clientes.get(i).getContas().add(conta);
            }
        }
    }

    private void exibirClientes() {
        for (int i = 0; i < clientes.size(); i++) {
            clientes.get(i).exibir();
        }
    }

    private void exibirContasDoCliente() {
        System.out.println("\nDigite o nome do cliente: ");
        String nome = sc2.nextLine();

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equalsIgnoreCase(nome)) {
                for (int j = 0; j < clientes.get(i).getContas().size(); i++) {
                    clientes.get(i).getContas().get(j).exibir();
                }
                break;
            }
        }
    }

    private void deposito() {
        System.out.println("\nDigite o número do conta: ");
        String numero = sc2.nextLine();

        for (int i = 0; i < clientes.size(); i++) {
            for (int j = 0; j < clientes.get(i).getContas().size(); i++) {
                if (clientes.get(i).getContas().get(j).getNumero().equalsIgnoreCase(numero)) {
                    System.out.println("\nDigite o valor do deposito:");
                    double valor = sc.nextDouble();
                    clientes.get(i).getContas().get(j).depositar(valor);
                    System.out.println("\nDeposito realizado com sucesso!");
                    break;
                }
                break;
            }
        }
    }

    private void saque() {
        System.out.println("\nDigite o número do conta: ");
        String numero = sc2.nextLine();

        for (int i = 0; i < clientes.size(); i++) {
            for (int j = 0; j < clientes.get(i).getContas().size(); i++) {
                if (clientes.get(i).getContas().get(j).getNumero().equalsIgnoreCase(numero)) {
                    System.out.println("\nDigite o valor do deposito:");
                    double valor = sc.nextDouble();
                    clientes.get(i).getContas().get(j).sacar(valor);
                    System.out.println("\nSaque realizado com sucesso!");
                    break;
                }
                break;
            }
        }
    }

    private void transferencia() {
        System.out.println("\nDigite o número da conta que irá transferir o valor:");
        String numero = sc.nextLine();
        System.out.println("\nDigite o número da conta que irá receber o valor:");
        String numero2 = sc.nextLine();

        for (int i = 0; i < clientes.size(); i++) {
            for (int j = 0; j < clientes.get(i).getContas().size(); j++) {
                if (clientes.get(i).getContas().get(j).getNumero().equalsIgnoreCase(numero)) {

                    for (int k = 0; k < clientes.size(); k++) {
                        for (int l = 0; l < clientes.get(k).getContas().size(); l++) {
                            if (clientes.get(k).getContas().get(l).getNumero().equalsIgnoreCase(numero2)) {

                                System.out.println("\nDigite o valor a ser transferido:");
                                double valor = sc.nextDouble();
                                double valor2 = clientes.get(i).getContas().get(j).transferir(valor);
                                clientes.get(k).getContas().get(l).depositar(valor2);
                                break;
                                
                            }
                        }
                        break;
                    }

                    break;
                }
            }
            break;
        }
    }

    public void encerrarConta() {
        System.out.println("\nDigite o número do conta: ");
        String numero = sc2.nextLine();

        for (int i = 0; i < clientes.size(); i++) {
            for (int j = 0; j < clientes.get(i).getContas().size(); i++) {
                if (clientes.get(i).getContas().get(j).getNumero().equalsIgnoreCase(numero)) {

                    if (clientes.get(i).getContas().get(j).encerrar()) {
                        clientes.get(i).getContas().remove(j);
                        System.out.println("\nConta removida com sucesso!");
                    } else {
                        System.out.println("\nA conta não pode ser encerrada, Otário!");
                        System.out.println("\nAinda tem dinheiro na conta!");
                    }

                    break;
                }
                break;
            }
        }
    }

}
