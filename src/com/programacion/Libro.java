package com.programacion;

public class Libro extends Biblioteca{


    private String prestado;


    public Libro(int codigo, String titulo, int ano) {
        super(codigo, titulo, ano);
    }

    public Libro() {
    }

    public String getPrestado() {
        return prestado;
    }

    public void setPrestado(String prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
