package com.automation.clase4.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej3MainCurso {
    /*
    Se requiere crear la clase Curso con los siguientes atributos:
        nombre (string)
        duracion (int)
    Agregar el constructor (con todos los parámetros)
    y los métodos getters & setters.

    En otro archivo que contenga al método main,
    instanciar tres objetos de la clase Curso ingresando
    los datos por consola. Luego de finalizar el ingreso,
    mostrar por pantalla la información de cada uno.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Curso> cursos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresar nombre de curso");
            String nombreCurso = scanner.nextLine();

            System.out.println("Ingresar duracion (hs)");
            var duracion = scanner.nextInt(); scanner.nextLine();

            Curso curso = new Curso(nombreCurso, duracion);

            cursos.add(curso);
        }

        System.out.println("Informacion de los cursos: " + cursos);
    }

}
