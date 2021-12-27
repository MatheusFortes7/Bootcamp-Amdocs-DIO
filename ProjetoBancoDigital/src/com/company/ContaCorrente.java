package com.company;

public class ContaCorrente extends Conta{

    ContaCorrente(Usuario cliente) {
        super(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("Extrato da conta corrente:");
        super.getExtrato();
    }
}
