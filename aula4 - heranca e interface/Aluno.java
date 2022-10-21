public class Aluno extends Pessoa{

    private String matricula;

    public Aluno(String nome, String cpf, String endereco, String matricula) {
        super(nome, cpf, endereco);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void exibirDados(){
        System.out.println("\nNome: " + super.getNome());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Endereco: " + super.getEndereco());
        System.out.println("Matricula: " + matricula);

    }

    public void atualizarEndereco(String endereco){
        super.setEndereco(endereco);
    }

}