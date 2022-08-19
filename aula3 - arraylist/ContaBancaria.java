import java.util.Scanner;

public class ContaBancaria{

    // Atributos da classe ContaBancaria

    private String numero;
    private double saldo;

    // Cosntrutores da classe ContaBancaria

    public ContaBancaria(){

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("\n   -- Resgistre os dados da Conta Bancaria --");
        System.out.println("\nNúmero: ");
        numero = sc.nextLine();
        System.out.println("\nDeseja realizar algum deposito ?");
        System.out.println("\ns - sim / n - não");
        String resp = sc2.nextLine();

        if(resp.equalsIgnoreCase("s")){
            System.out.println("\nDigite o valor do deposito:");
            saldo = sc.nextDouble();

        } else{
            saldo = 0;
        }
        
    }

    // Métodos da classe ContaBancaria

    public void exibir(){
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$" + saldo);
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(saldo - valor >= 0){
            saldo -= valor;
        } else{
            System.out.println("\nNão tirar o dinheiro, Otário!");
            System.out.println("\nSabe fazer conta não ?");
        }
    }

    public double transferir(double valor){

        double verificar = valor;

        if(saldo - valor >= 0){
            saldo -= valor;
        } else{
            verificar = 0;
            System.out.println("\nNão trasnferir o dinheiro, Otário!");
            System.out.println("\nSabe fazer conta não ?");
        }

        return verificar;
    }

    public boolean encerrar(){

        boolean verificar = true;

        if(saldo > 0){
            verificar = false;
        }
        
        return verificar;

    }

    // Métodos getters e setters da classe ContaBancaria
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}