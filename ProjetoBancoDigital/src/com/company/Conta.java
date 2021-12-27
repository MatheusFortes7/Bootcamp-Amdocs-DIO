package com.company;

import java.util.Scanner;

public abstract class Conta {

    private static  int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Usuario cliente;


    public Conta(Usuario cliente){
        this.agencia = 1;
        this.conta = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", saldo=" + saldo +
                '}';
    }

    public int getAgencia() { return agencia; }

    public void setAgencia(int agencia) { this.agencia = agencia; }

    public int getConta() { return conta; }

    public void setConta(int conta) { this.conta = conta; }

    public double getSaldo() { return saldo; }

    public void setSaldo(double saldo) { this.saldo = saldo; }

    public void sacar(double valor){ this.saldo -= valor; }

    public void depositar(double valor){ this.saldo += valor; }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void getExtrato(){
        System.out.println("-------------------------");
        System.out.println("Dono da conta: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero da conta: " + this.conta);
        System.out.println("Extrato: " + this.saldo);
        System.out.println("-------------------------");
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("===========================================");
        System.out.println("O que voce deseja fazer agora?");
        System.out.println("1 - depositar");
        System.out.println("2 - sacar");
        System.out.println("3 - transferir");
        System.out.println("4 - sair");
        int escolha = Integer.parseInt(scanner.nextLine());
            if (escolha == 1) {
                System.out.println("Voce selecionou 'depositar'");
                System.out.println("Qual valor voce deseja depositar? ");
                int valor = Integer.parseInt(scanner.nextLine());
                this.depositar(valor);
                System.out.println("Valor depositado");
                this.getExtrato();
                this.menu();
            } else if (escolha == 2) {
                System.out.println("Voce selecionou 'sacar'");
                this.getExtrato();
                System.out.println("Qual valor voce deseja sacar? ");
                int valor = Integer.parseInt(scanner.nextLine());
                this.sacar(valor);
                System.out.println("Valor sacado");
                this.getExtrato();
                this.menu();
            } else if (escolha == 3) {
                System.out.println("Voce selecionou 'transferir'");
                this.getExtrato();
                System.out.println("Qual valor voce deseja transferir? ");
                int valor = Integer.parseInt(scanner.nextLine());
                System.out.println("para qual pessoa voce deseja transferir");
                String nomeTransf = scanner.nextLine();
                Usuario transf = new Usuario(nomeTransf);
                Conta transferencia = new ContaCorrente(transf);
                this.transferir(valor, transferencia);
                System.out.println("Valor transferido");
                this.getExtrato();
                this.menu();
            } else if (escolha == 4) {
                System.out.println("Voce selecionou 'Sair'");
                System.out.println("Ate mais, espero te ver novamente!");
            } else {
                System.out.println("Opcao invalida!");
            }
        }
    }
