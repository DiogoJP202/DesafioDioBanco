package banco.interno;

// abstract garante que a classe não será instaciada.
public abstract class Conta implements IConta{
    private final int AGENCIA_PADRAO = 1;
    private static int sequencial = 1;
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
        agencia = AGENCIA_PADRAO;
        numero = sequencial ++;
        saldo = 0;
        this.cliente = cliente;
    }

    public int getAgencia(){
        return agencia;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    @Override
    public void sacar(double valor){
        saldo -= valor;
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestinatario){
        saldo -= valor;
        contaDestinatario.depositar(valor);
    }

    @Override
    public String toString(){
        return String.format("Agência: %s - Número: %d - Cliente: %s", agencia, numero, cliente.getNome());
    }

    protected void imprimirInfo(){
        System.out.println(String.format("Cliente: %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", getAgencia()));
        System.out.println(String.format("Numero: %d", getNumero()));
        System.out.println(String.format("Saldo: R$%.2f", getSaldo()));
    }
}