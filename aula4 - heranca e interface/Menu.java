import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private Scanner sc = new Scanner(System.in);
    private Scanner sc2 = new Scanner(System.in);

    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public Menu() {

        int opcao = 0;

        do {
            System.out.println("\n*****************************************");
            System.out.println("                         MENU");
            System.out.println("*******************************************");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Cadastrar Tecnico");
            System.out.println("4 - Exibir Pessoas");
            System.out.println("5 - Exibir Alunos");
            System.out.println("6 - Exibir Salário de um Funcionário");
            System.out.println("7 - Atualizar Aluno");
            System.out.println("8 - Atualizar Professor");
            System.out.println("9 - Atualizar Tecnico");
            System.out.println("10 - Remover Pessoa");
            System.out.println("11 - Sair");
            System.out.println("*********************************************");
            opcao = sc.nextInt();
            System.out.println("********************************************\n");

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    cadastrarProfessor();
                    break;
                case 3:
                    cadastrarTecnico();
                    break;
                case 4:
                    exibirPessoas();
                    break;
                case 5:
                    exibirAlunos();
                    break;
                case 6:
                    exibirSalario();
                    break;
                case 7:
                    atualizarAluno();
                    break;
                case 8:
                    atualizarProfessor();
                    break;
                case 9:
                    atualizarTecnico();
                    break;
                case 10:
                    removerPessoa();
                    break;
                case 11:
                    System.out.println("SAINDO... VA E NAO VOLTE");
                    break;
                default:
                    System.out.println("OPCAO INVALIDA, OTARIO");
                    break;
            }

        } while (opcao != 11);
    }

    private void cadastrarAluno() {
        System.out.println("Digite o nome:");
        String nome = sc2.nextLine();
        System.out.println("Digite o CPF:");
        String cpf = sc2.nextLine();
        System.out.println("Digite o Endereço:");
        String endereco = sc2.nextLine();
        System.out.println("Digite a matricula:");
        String matricula = sc2.nextLine();

        // Aluno aluno = new Aluno(nome, cpf, endereco, matricula);
        Pessoa aluno = new Aluno(nome, cpf, endereco, matricula);

        pessoas.add(aluno);
        System.out.println("\nALUNO CADASTRADO COM SUCESSO");
    }

    private void cadastrarProfessor() {
        System.out.println("Digite o nome:");
        String nome = sc2.nextLine();
        System.out.println("Digite o CPF:");
        String cpf = sc2.nextLine();
        System.out.println("Digite o Endereço:");
        String endereco = sc2.nextLine();
        System.out.println("Digite a disciplina:");
        String disciplina = sc2.nextLine();

        Pessoa professor = new Professor(nome, cpf, endereco, disciplina);

        pessoas.add(professor);

        System.out.println("\nPROFESSOR CADASTRADO COM SUCESSO");
    }

    private void cadastrarTecnico() {
        System.out.println("Digite o nome:");
        String nome = sc2.nextLine();
        System.out.println("Digite o CPF:");
        String cpf = sc2.nextLine();
        System.out.println("Digite o Endereço:");
        String endereco = sc2.nextLine();
        System.out.println("Digite o setor:");
        String setor = sc2.nextLine();

        Pessoa tecnico = new Tecnico(nome, cpf, endereco, setor);

        pessoas.add(tecnico);

        System.out.println("\nTECNICO CADASTRADO COM SUCESSO");
    }

    private void exibirPessoas() {

        /*
         * FOR NORMAL --> Usar quando for necessario obter a posição do objeto
         * for (int i = 0; i < pessoas.size(); i++) {
         * pessoas.get(i).exibirDados();
         * }
         */

        // FOR EACH --> Usar quando for exibir dados ou obter um dado especifico
        for (Pessoa pessoa : pessoas) {
            pessoa.exibirDados();
        }
    }

    private void exibirAlunos() {
        System.out.println("ALUNOS:");
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Aluno) {
                pessoa.exibirDados();
            }
        }
    }

    private void exibirSalario() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Funcionario) {
                Funcionario funcionario = (Funcionario) pessoa;
                System.out.println("Digite a quantidade de dias trabalhados: ");
                int dias = sc.nextInt();
                funcionario.calcularSalario(dias);
                break;
            }
        }
    }

    private void atualizarAluno() {
        System.out.println("Digite o nome do ser humano: ");
        String pesquisa = sc2.nextLine();

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i) instanceof Aluno) {
                if (pessoas.get(i).getNome().equalsIgnoreCase(pesquisa)) {
                    Aluno aluno = (Aluno) pessoas.get(i);

                    System.out.println("Digite o nome:");
                    String nome = sc2.nextLine();
                    System.out.println("Digite o CPF:");
                    String cpf = sc2.nextLine();
                    System.out.println("Digite o Endereço:");
                    String endereco = sc2.nextLine();
                    System.out.println("Digite a matricula:");
                    String matricula = sc2.nextLine();

                    // Atualizando com medotos set das classes
                    aluno.setNome(nome);
                    aluno.setCpf(cpf);
                    aluno.setEndereco(endereco);
                    aluno.setMatricula(matricula);

                    // Atualizando com Metodo .set() do ArrayList
                    // Aluno alunoAtualizado = new Aluno(nome, cpf, endereco, matricula);
                    // pessoas.set(i, alunoAtualizado);

                    System.out.println("\nALUNO ATUALIZADO COM SUCESSO");
                    break;
                }

            }
        }
    }

    private void atualizarProfessor() {
        System.out.println("Digite o nome do ser humano: ");
        String pesquisa = sc2.nextLine();

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i) instanceof Aluno) {
                if (pessoas.get(i).getNome().equalsIgnoreCase(pesquisa)) {
                    Professor professor = (Professor) pessoas.get(i);

                    System.out.println("Digite o nome:");
                    String nome = sc2.nextLine();
                    System.out.println("Digite o CPF:");
                    String cpf = sc2.nextLine();
                    System.out.println("Digite o Endereço:");
                    String endereco = sc2.nextLine();
                    System.out.println("Digite a disciplina:");
                    String matricula = sc2.nextLine();

                    // Atualizando com medotos set das classes
                    professor.setNome(nome);
                    professor.setCpf(cpf);
                    professor.setEndereco(endereco);
                    professor.setDisciplina(matricula);

                    // Atualizando com Metodo .set() do ArrayList
                    // Professor professorAtualizado = new Aluno(nome, cpf, endereco, matricula);
                    // pessoas.set(i, professorAtualizado);

                    System.out.println("\nPROFESSOR ATUALIZADO COM SUCESSO");
                    break;
                }
            }
        }
    }

    private void atualizarTecnico() {
        System.out.println("Digite o nome do ser humano: ");
        String pesquisa = sc2.nextLine();

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i) instanceof Aluno) {
                if (pessoas.get(i).getNome().equalsIgnoreCase(pesquisa)) {
                    Tecnico tecnico = (Tecnico) pessoas.get(i);

                    System.out.println("Digite o nome:");
                    String nome = sc2.nextLine();
                    System.out.println("Digite o CPF:");
                    String cpf = sc2.nextLine();
                    System.out.println("Digite o Endereço:");
                    String endereco = sc2.nextLine();
                    System.out.println("Digite a setor:");
                    String setor = sc2.nextLine();

                    // Atualizando com medotos set das classes
                    tecnico.setNome(nome);
                    tecnico.setCpf(cpf);
                    tecnico.setEndereco(endereco);
                    tecnico.setSetor(setor);

                    // Atualizando com Metodo .set() do ArrayList
                    // Professor tecnicoAtualizado = new Aluno(nome, cpf, endereco, matricula);
                    // pessoas.set(i, tecnicoAtualizado);
                    System.out.println("\nTECNICO ATUALIZADO COM SUCESSO");
                    break;
                }
            }
        }
    }

    private void removerPessoa() {
        System.out.println("Digite o nome do ser humano:");
        String nome = sc2.nextLine();

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().equalsIgnoreCase(nome)) {
                pessoas.remove(i);
                System.out.println("\nPESSOA REMOVIDA COM SUCESSO");
                break;
            }
        }
    }
}
