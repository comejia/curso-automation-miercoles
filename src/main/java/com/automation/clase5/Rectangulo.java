package com.automation.clase5;

public class Rectangulo extends Figura implements Dibujable {

    private int base;
    private int altura;

    public Rectangulo(String color, int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectangulo de color: " + getColor());
    }
}
