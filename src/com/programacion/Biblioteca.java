package com.programacion;

public class Biblioteca {

private int codigo;
private String titulo;
private int ano;

    public Biblioteca() {
    }

    public Biblioteca(int codigo, String titulo, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", ano=" + ano
               ;
    }
}
