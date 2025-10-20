package com.automation.clase3.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ej3ListaMaterias {
    /*
    Se requiere almacenar en una lista de string, las materias que van a rendir en el cuatrimestre,
    por ejemplo: “Probabilidad y Estadística”, “Física 1”, “Análisis Matemático”, “Química”.
    Imprimir en pantalla cada materia por separado, luego eliminar alguna y
    volver a imprimir en pantalla pero todo junto, para comprobar que la materia se eliminó.
     */

    public static void main(String[] args) {
        List<String> materias = new ArrayList<>();

        materias.add("Probabilidad y Estadística");
        materias.add("Física 1");
        materias.add("Análisis Matemático");
        materias.add("Química");

        System.out.println("Materia en posición 0: " + materias.get(0));
        System.out.println("Materia en posición 1: " + materias.get(1));
        System.out.println("Materia en posición 2: " + materias.get(2));
        System.out.println("Materia en posición 3: " + materias.get(3));

        System.out.println("\n***** Eliminando la materia: Análisis Matemático*****\n");
        materias.remove("Análisis Matemático");

        System.out.println("Materias disponibles: " + materias);
    }
}
