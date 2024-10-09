package banco.interno;

public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestinatario);

    void imprimirExtrato();
}