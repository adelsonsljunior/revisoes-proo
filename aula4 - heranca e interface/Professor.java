public class Professor extends Funcionario {

    private String disciplina;

    public Professor(String nome, String cpf, String endereco, String disciplina) {
        super(nome, cpf, endereco);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void calcularSalario(int dia) {

        double salario = dia * 200;
        System.out.println("\nO salário é R$ " + salario);
    }

    public void exibirDados() {
        System.out.println("\nNome: " + super.getNome());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Endereco: " + super.getEndereco());
        System.out.println("Disciplina: " + disciplina);

    }

    public void atualizarEndereco(String endereco) {
        super.setEndereco(endereco);

    }

}
