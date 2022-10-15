public class Atendente extends Funcionario {

    private boolean fixo;
    // Fixo -> true / temporario -> false

    public Atendente(String nome, String cpf, double salario, Endereco endereco, boolean fixo) {
        super(nome, cpf, salario, endereco);
        this.fixo = fixo;
    }

    public boolean isFixo() {
        return fixo;
    }

    public void setFixo(boolean fixo) {
        this.fixo = fixo;
    }

    public void exibir() {
        System.out.println("\nNome: " + super.getNome());
        System.out.println("Salário: R$ " + super.getSalario());
        super.getEndereco().exibir();
    }

    public void atualizarCep(String cep) {
        super.getEndereco().setCep(cep);

    }

}
