package banco.producao;

import banco.interno.*;

public class Main {
    public static void main(String[] args){
        Banco itau = new Banco("Itau");
        Cliente diogo = new Cliente("Diogo");

        Conta cc = new ContaCorrente(diogo);
        itau.adicionarConta(cc);
        Conta cp = new ContaPoupanca(diogo);
        itau.adicionarConta(cp);

        cc.depositar(100);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        itau.exibirClientes();
    }
}