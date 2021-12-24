package com.company;
import java.io.*;
import java.util.Scanner;

public class Exercicio2IOScanner {
    public static void lerTecladoEscreverDocumento() throws IOException {
        System.out.println("Digite 3 recomendacoes de filmes: ");

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        File f = new File("recomendacoes.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do{
            bw.write(line);
            bw.newLine();
            line = scanner.nextLine();
        } while (!(line.equalsIgnoreCase("FIM")));
        System.out.println("Arquivo criado com sucesso! " + f.getName());

        bw.close();
        scanner.close();
    }

    public static void main(String[] args) throws IOException {
        lerTecladoEscreverDocumento();
    }
}
