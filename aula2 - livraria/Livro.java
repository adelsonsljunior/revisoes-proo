import java.util.Scanner;

public class Livro {

    // Atributos da classe Livro

    private String titulo;
    private String genero;
    private double preco;

    private Autor[] autores;

    // Construtores da classe Livro

    public Livro() {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);

        int quant = 0;

        System.out.println("\n   -- Registre o Livro --");
        System.out.println("\nTítulo: ");
        titulo = leitor2.nextLine();
        System.out.println("\nGênero: ");
        genero = leitor2.nextLine();
        System.out.println("\nPreço: ");
        preco = leitor.nextDouble();
        do {
            System.out.println("\nDigite a quantidade de Autores (no máximo 4): ");
            quant = leitor.nextInt();

            if(quant < 1 || quant > 4){
                System.out.println("\nNúmero digitado não corresponde com número de Autores");

                System.out.println("\nDIGITE NOVAMENTE");
            }

        } while (quant < 1 || quant > 4);

        autores = new Autor[quant];

        for (int i = 0; i < autores.length; i++) {
            autores[i] = new Autor();
        }
    }

    // Métodos da classe Livro

    public void exibir() {

        System.out.println("\n   -- Livro --");
        System.out.println("\nTítulo: " + titulo);
        System.out.println("\nGênero: " + genero);
        System.out.println("\nPreço: " + preco);
        System.out.println("\n   ==  Autores ==");
        for (int i = 0; i < autores.length; i++) {
            autores[i].exibir();;
        }
    }


    // Métodos gets e sets da classe Livro

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    
}
