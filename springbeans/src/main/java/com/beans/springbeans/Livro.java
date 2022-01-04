package com.beans.springbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {

    private String nome;
    private String codigo;

    @Autowired
    AutorLivro autorlivro;

    public AutorLivro getAutorlivro() {
        return autorlivro;
    }

    public void setAutorlivro(AutorLivro autorlivro) {
        this.autorlivro = autorlivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void exibir(){
        System.out.println(this.nome + " " + this.codigo);
        autorlivro.exibirAutor();
    }
}
