public class Aluno {

    // ENCAPSULAMENTO

    // public --> pode ser vista por todas as classes
    // private --> só pode ser vista na classe

    // Todos os atributos são privados
    // Todos os métodos podem ser públicos
    
    private String nome;
    private float nota;

    public Aluno(String nome, float nota){
        this.nome = nome;
        this.nota = nota;
    }

    // Métodos gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
