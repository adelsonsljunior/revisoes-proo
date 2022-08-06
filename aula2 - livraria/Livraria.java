import java.util.Scanner;

public class Livraria {

    private Scanner leitor = new Scanner(System.in);
    private Scanner leitor2 = new Scanner(System.in);

    private Livro[] livros;

    // Construtores da classe Livraria

    public Livraria() {

        livros = new Livro[100];

        int opcao = 0;

        do {
            System.out.println("\n*************************");
            System.out.println("         AGENDA    ");
            System.out.println("*************************");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Exibir livros");
            System.out.println("3 - Verificar livro");
            System.out.println("4 - Informar quantidade do gênero ");
            System.out.println("5 - Atualizar preço de um livro ");
            System.out.println("6 - Atualizar gênero do livro ");
            System.out.println("7 - Exibir livros de um Autor ");
            System.out.println("8 - Exibir livros de autores de Arapiraca ");
            System.out.println("9 - Atualizar endereço do Autor");
            System.out.println("10 - Remover livro");
            System.out.println("11 - Sair");
            System.out.println("*************************");
            opcao = leitor.nextInt();
            System.out.println("*************************\n");

            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;

                case 2:
                    exibirLivros();

                    break;

                case 3:
                    verificarLivro();

                    break;

                case 4:
                    quantidadeGenero();

                    break;

                case 5:
                    atualizarPreco();

                    break;

                case 6:
                    atualizarGenero();

                    break;

                case 7:
                    exibirLivroAutor();

                    break;

                case 8:
                    exibirLivroArapiraca();

                    break;

                case 9:
                    atualizarEndereco();

                    break;

                case 10:
                    removerLivro();

                    break;

                case 11:
                    System.out.println("   SAINDO....");
                    break;

                default:
                    System.out.println("\n--------------------");
                    System.out.println("   OPÇÃO INVÁLIDA");
                    System.out.println("--------------------\n");
                    break;
            }

        } while (true);
    }

    private void cadastrarLivro() {
        Livro livroAux = new Livro();
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livroAux;
                break;
            }
        }
    }

    private void exibirLivros() {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                System.out.println("\n   == " + (i + 1) + "º Livro ==");
                livros[i].exibir();
            }
        }
    }

    private void verificarLivro() {
        System.out.println("\nDigite o título do livro que deseja procurar: ");
        String titulo = leitor2.nextLine();

        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                    System.out.println("\n----------------------");
                    System.out.println("   Livro Encontrado !");
                    System.out.println("----------------------\n");
                    break;
                }
            }
        }
    }

    private void quantidadeGenero() {
        System.out.println("\nDigite o gênero do livro que deseja procurar: ");
        String genero = leitor2.nextLine();

        int cont = 0;

        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                if (livros[i].getGenero().equalsIgnoreCase(genero)) {
                    cont++;
                }
            }
        }

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("   " + cont + " livros do " + genero + " foram encontardos !");
        System.out.println("-------------------------------------------------------------\n");
    }

    private void atualizarPreco() {
        System.out.println("\nDigite o título do livro que deseja procurar: ");
        String titulo = leitor2.nextLine();

        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                if (livros[i].getGenero().equalsIgnoreCase(titulo)) {
                    System.out.println("\nDigite o novo preço: ");
                    double preco = leitor.nextDouble();
                    livros[i].setPreco(preco);
                    break;
                }
            }
        }
    }

    private void atualizarGenero() {
        System.out.println("\nDigite o título do livro que deseja procurar: ");
        String titulo = leitor2.nextLine();

        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                if (livros[i].getGenero().equalsIgnoreCase(titulo)) {
                    System.out.println("\nDigite o novo preço: ");
                    String genero = leitor.nextLine();
                    livros[i].setGenero(genero);
                    break;
                }
            }
        }
    }

    private void exibirLivroAutor() {
        System.out.println("\nDigite o nome do autor que deseja procurar: ");
        String autor = leitor2.nextLine();

        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                for (int j = 0; j < livros[i].getAutores().length; j++) {
                    if (livros[i].getAutores()[i] != null) {
                        if (livros[i].getAutores()[i].getNome().equalsIgnoreCase(autor)) {
                            livros[i].exibir();
                        }
                    }
                }
            }
        }
    }

    private void exibirLivroArapiraca() {

        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                for (int j = 0; j < livros[i].getAutores().length; j++) {
                    if (livros[i].getAutores()[i] != null) {
                        if (livros[i].getAutores()[i].getEndereco().getCidade().equalsIgnoreCase("Arapiraca")) {
                            livros[i].exibir();
                        }
                    }
                }
            }
        }
    }

    private void atualizarEndereco() {
        System.out.println("\nDigite o nome do autor que deseja procurar: ");
        String autor = leitor2.nextLine();

        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                for (int j = 0; j < livros[i].getAutores().length; j++) {
                    if (livros[i].getAutores()[i] != null) {
                        if (livros[i].getAutores()[i].getNome().equalsIgnoreCase(autor)) {
                            Endereco enderecoAux = new Endereco();
                            livros[i].getAutores()[i].setEndereco(enderecoAux);
                        }
                    }
                }
            }
        }
    }

    private void removerLivro() {
        System.out.println("\nDigite o título do livro que deseja procurar: ");
        String titulo = leitor2.nextLine();

        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                if (livros[i].getGenero().equalsIgnoreCase(titulo)) {
                    livros[i] = null;
                    System.out.println("\n--------------------------------");
                    System.out.println("   Livro removido com sucesso !");
                    System.out.println("--------------------------------\n");
                    break;
                }
            }
        }
    }

}
