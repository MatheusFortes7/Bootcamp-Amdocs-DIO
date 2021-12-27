package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("------- Bem vindo ao banco digital -----------");
        System.out.println("-------  O que voce deseja fazer?  -----------");
        System.out.println("1 - Abrir uma conta corrente");
        System.out.println("2 - Abrir uma conta poupanca");
        System.out.println("3 - Sair");

        Scanner scanner = new Scanner(System.in);
        int escolha = Integer.parseInt(scanner.nextLine());

        if (escolha == 1){
            System.out.println("Voce selecionou 'Abrir uma conta corrente'");
            System.out.println("Qual seu nome: ");
            String nome = scanner.nextLine();
            Usuario cliente = new Usuario(nome);
            Conta cc = new ContaCorrente(cliente);
            System.out.println("Conta criada com sucesso!");
            cc.menu();
        } else if (escolha == 2){
            System.out.println("Voce selecionou 'Abrir uma conta poupanca'");
            System.out.println("Qual seu nome: ");
            String nome = scanner.nextLine();
            Usuario cliente = new Usuario(nome);
            Conta cp = new ContaPoupanca(cliente);
            System.out.println("Conta criada com sucesso!");
            cp.menu();
        } else if (escolha == 3){
            System.out.println("Voce selecionou 'Sair'");
            System.out.println("Ate mais, espero te ver novamente!");
        } else {
            System.out.println("Opcao invalida!");
        }
    }
}
