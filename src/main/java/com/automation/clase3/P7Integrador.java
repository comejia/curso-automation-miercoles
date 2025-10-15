package com.automation.clase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P7Integrador {

    /*
        Ingresar por consola un número mientras sea menor
        o igual a 500 y almacenar el número en una lista.
        Al finalizar el ingreso mostrar los datos y la
        cantidad ingresada por pantalla.
        También, sí hubo menos de 10 ingresos mostrar
        “Se ingresaron pocos números” de lo contrario mostrar
        “Se excedió la cantidad de ingresos diarios”
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        List<Integer> listaDeNumeros = new ArrayList<>();

        do {
            System.out.println("Ingrese un número: ");
            numero = scanner.nextInt();

            listaDeNumeros.add(numero);
        } while(numero <= 500);

        System.out.println("Datos ingresados: " + listaDeNumeros);

        if (listaDeNumeros.size() < 10) {
            System.out.println("Se ingresaron pocos números");
        } else {
            System.out.println("Se excedió la cantidad de ingresos diarios");
        }
    }
}
