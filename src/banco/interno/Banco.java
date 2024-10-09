package banco.interno;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome){
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void exibirClientes(){
        if(!contas.isEmpty()){
            for(Conta c : contas){
                System.out.println(c);
            }
        }
    }
}