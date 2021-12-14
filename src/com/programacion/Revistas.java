package com.programacion;

public class Revistas extends Biblioteca{

    private int numero;

    public Revistas() {
    }

    public Revistas(int codigo, String titulo, int ano, int numero) {
        super(codigo, titulo, ano);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
