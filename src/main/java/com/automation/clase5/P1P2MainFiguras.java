package com.automation.clase5;

import java.util.ArrayList;
import java.util.List;

public class P1P2MainFiguras {

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("rojo", 20);
        Triangulo triangulo = new Triangulo("verde", 10, 15);
        Rectangulo rectangulo = new Rectangulo("azul", 5, 30);

        List<Figura> figuras = new ArrayList<>();
        figuras.add(cuadrado);
        figuras.add(triangulo);
        figuras.add(rectangulo);

        //for(int i = 0; i < figuras.size(); i++)
        for(Figura figura : figuras) { // for each
            System.out.println("Area de la figura: " + figura.calcularArea());
        }

        System.out.println("\n********************\n");

        List<Dibujable> dibujables = new ArrayList<>();
        dibujables.add(cuadrado);
        dibujables.add(rectangulo);

        for (Dibujable dibujable : dibujables) {
            dibujable.dibujar();
        }

        // Iteración de una lista de forma declarativa
//        dibujables.forEach(dibujable -> dibujable.dibujar());
    }
}
