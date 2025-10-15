package com.automation.clase3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1ArraysYListas {

    public static void main(String[] args) {

        // Arrays
        int[] arraysDeNumeros = new int[3];
        double[] arraysDeFlotantes = new double[3];

        arraysDeNumeros[0] = 10;
        arraysDeNumeros[1] = 20;
        arraysDeNumeros[2] = 300;

        System.out.println("Valor de la posicion 0 del array: " + arraysDeNumeros[0]);
        System.out.println("Valor de la posicion 1 del array: " + arraysDeNumeros[1]);
        System.out.println("Valor de la posicion 2 del array: " + arraysDeNumeros[2]);

        System.out.println("Valores del array: " + Arrays.toString(arraysDeNumeros));

        // arraysDeNumeros[3] = 26; // No se puede acceder a una posicion que no fue declarada

        arraysDeNumeros[0] = 26;

        // Listas
        List<String> listaDeNombres = new ArrayList<>();

        listaDeNombres.add("Juan"); // posicion 0
        listaDeNombres.add("Pepe"); // posicion 1
        listaDeNombres.add("Pepe"); // posicion 2

        System.out.println("Elementos de la lista: " + listaDeNombres);

        System.out.println("Elemento en la posicion 0: " + listaDeNombres.get(0));
        System.out.println("Elemento en la posicion 1: " + listaDeNombres.get(1));
        System.out.println("Elemento en la posicion 2: " + listaDeNombres.get(2));

        listaDeNombres.remove(1);
        System.out.println("Elementos de la lista actualizado: " + listaDeNombres);

    }
}
