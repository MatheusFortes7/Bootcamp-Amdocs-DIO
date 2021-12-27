package com.company;

public class ContaPoupanca extends Conta{

    ContaPoupanca(Usuario cliente) {
        super(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("Extrato da conta poupanca:");
        super.getExtrato();
    }

}
