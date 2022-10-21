public class Tecnico extends Funcionario{
    
    private String setor;

    public Tecnico(String nome, String cpf, String endereco, String setor) {
        super(nome, cpf, endereco);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void calcularSalario(int dia) {
        double salario = dia * 160;
        System.out.println("\nO salário é R$ " + salario);
    }

    public void exibirDados() {
        System.out.println("\nNome: " + super.getNome());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Endereco: " + super.getEndereco());
        System.out.println("Setor: " + setor);
    }

    public void atualizarEndereco(String endereco) {
        super.setEndereco(endereco);
    }


}
