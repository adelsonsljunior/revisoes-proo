public abstract class Funcionario extends Pessoa implements IFuncionario {

    private double salario;

    public Funcionario(String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}