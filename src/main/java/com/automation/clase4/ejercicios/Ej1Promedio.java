package com.automation.clase4.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej1Promedio {
    /*
    Se requiere cargar las 10 notas de un
    alumno para calcular el promedio.
    Es necesario cargar las notas usando
    la consola y al finalizar mostrar en
    pantalla el promedio de todas las notas.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> notas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota: ");
            int nota = scanner.nextInt(); scanner.nextLine();

            notas.add(nota);
        }

        var total = 0;
        for (int nota : notas) {
            total += nota;
        }

        System.out.println("El promedio de notas es: " + total/notas.size());
    }
}
