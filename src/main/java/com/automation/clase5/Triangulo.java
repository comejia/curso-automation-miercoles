package com.automation.clase5;

public class Triangulo extends Figura {

    private int base;
    private int altura;

    public Triangulo(String color, int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }
}
