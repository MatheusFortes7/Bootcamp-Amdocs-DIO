package com.company;
import java.io.*;

public class Exercicio03IO {
    public static void copiarArquivo() throws IOException {
        File f = new File("C:/Users/mfort/IdeaProjects/testeEntradaSaida/recomendacoes.txt");
        String nomeArquivo = f.getName();

        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        String line = br.readLine();

        String copia = nomeArquivo.substring(0,nomeArquivo.indexOf(".")).concat("-copia.txt");
        File fcopia = new File(copia);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopia.getName()));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!(line == null));
        bw.close();
        br.close();
        System.out.println("Arquivo copiado: " + f.getName());
        System.out.println("Copia do arquivo: " + fcopia.getName());
        System.out.println("Tamanho dos arquivo: " + f.length() +  " bytes.");
        System.out.println();

        System.out.println("Me recomenda 3 livros ai nerdola:");
        adicionarInfo(fcopia.getName());
    }

    public static void adicionarInfo(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));
        //true nos argumentos para nao excluir os itens que ja existiam no arquivo
        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!(line.equalsIgnoreCase("FIM")));

        System.out.println("Informações adicionadas.");
        br.close();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}
