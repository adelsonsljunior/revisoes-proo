public class Medico extends Funcionario {

    private String especialidade;
    private String matricula;
    
    public Medico(String nome, String cpf, double salario, Endereco endereco, String especialidade, String matricula) {
        super(nome, cpf, salario, endereco);
        this.especialidade = especialidade;
        this.matricula = matricula;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void exibir(){
        System.out.println("\nNome: " + super.getNome());
        System.out.println("Salário: R$ " + super.getSalario());
        super.getEndereco().exibir();
    }

    public void atualizarCep(String cep){
        super.getEndereco().setCep(cep);

    }

}
