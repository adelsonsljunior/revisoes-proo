import java.util.Scanner;

public class MainConta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String numero;

        // ARRAY --> conjunto de dados do mesmo tipo (Vetor)

        ContaBancaria[] contas = new ContaBancaria[3];

        System.out.println("\n  ==  Resgistrando os Dados das Contas Bancarias ==");

        for (int i = 0; i < contas.length; i++) {
            contas[i] = new ContaBancaria();
        }

        System.out.println("\n  ==  Vendo os Dados das Conta Bancaria ==");

        System.out.println("\nDigite o número conta: ");
        numero = sc.next();

        for (int i = 0; i < contas.length; i++) {

            if (contas[i].getNumero().equals(numero)) {
                System.out.println("\n -- Dados Conta --");
                System.out.println(contas[i].getNumero());
                System.out.println(contas[i].getSaldo());
                System.out.println(contas[i].getCliente().getNome());
                System.out.println(contas[i].getCliente().getCpf());
                System.out.println(contas[i].getCliente().getTelefone());
                // contas[i].exibir();
            }
        }

        System.out.println("\n  ==  Saldo da Conta Bancaria ==");

        System.out.println("\nDigite o número conta: ");
        numero = sc.next();

        for (int i = 0; i < contas.length; i++) {

            if (contas[i].getNumero().equals(numero)) {
                System.out.println("\n ---------------------------------");
                System.out.println("O saldo da conta é R$ " + contas[i].getSaldo());
                System.out.println("----------------------------------\n");
            }
        }

        System.out.println("\n  ==  Depositar na Conta Bancaria ==");

        System.out.println("\nDigite o número conta: ");
        numero = sc.next();

        for (int i = 0; i < contas.length; i++) {

            if (contas[i].getNumero().equals(numero)) {

                System.out.println("Digite o valor que deseja depositar: ");
                float valor = sc.nextFloat();
                contas[i].depositar(valor);
            }
        }

        System.out.println("\n  ==  Ver Nome do Cliente ==");

        System.out.println("\nDigite o número conta: ");
        numero = sc.next();

        for (int i = 0; i < contas.length; i++) {

            if (contas[i].getNumero().equals(numero)) {

                System.out.println("\n --------------------------------");
                System.out.println("  O nome do cliente dessa conta é " + contas[i].getCliente().getNome());
                System.out.println("---------------------------------\n");
            }
        }

        System.out.println("\n  ==  Atualizar o Telefone do Cliente ==");

        System.out.println("\nDigite o número conta: ");
        numero = sc.next();

        for (int i = 0; i < contas.length; i++) {

            if (contas[i].getNumero().equals(numero)) {

                System.out.println("Digite o novo telefone do cliente: ");
                String telefone = sc.nextLine();
                telefone = sc.nextLine();
                contas[i].getCliente().setTelefone(telefone);
                System.out.println("\n --------------------------------");
                System.out.println("  Telefone atualizado com sucesso!");
                System.out.println("---------------------------------\n");

            }
        }

        sc.close();

    }
}