package banco.interno;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("-** Extrato Conta Poupança **-");
        imprimirInfo();
        System.out.println("-** FIM **-");
    }
}