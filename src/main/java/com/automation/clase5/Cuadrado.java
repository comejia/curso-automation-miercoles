package com.automation.clase5;

public class Cuadrado extends Figura implements Dibujable {

    private int lado;

    public Cuadrado(String color, int lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujado un cuadrado de color: " + getColor());
    }
}
