import java.util.Scanner;


public class ContaBancaria {
    private String numero;
    private float saldo;
    private Cliente cliente;
    
    public ContaBancaria(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n  -- Registre os Dados da Conta Bancaria --");
        System.out.println("\nDigite o número da conta: ");
        numero = entrada.next();
        saldo = 0;
        cliente = new Cliente();

        entrada.close();
    }

    public ContaBancaria(String numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        saldo = 0;
    }
    
    public void exibir(){
        System.out.println("Conta: " + numero);
        System.out.println("Saldo: " + saldo);
        
        cliente.exibir();
    }



    public void depositar(float saldo){
        this.saldo += saldo;

        System.out.println("\n --------------------------------");
        System.out.println("  Deposito realizado com sucesso!");
        System.out.println("---------------------------------\n");

    }




    // Métodos gets e sets

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
