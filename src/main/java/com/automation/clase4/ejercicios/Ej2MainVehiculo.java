package com.automation.clase4.ejercicios;

public class Ej2MainVehiculo {
/*
    Se requiere crear la clase Vehiculo con los siguientes atributos:
        marca (string)
        modelo (string)
        anio (int)
    Además agregar el constructor (con todos los parámetros)
    y los métodos getters & setters.

    En otro archivo que contenga al método main,
    instanciar dos objetos de la clase Vehiculo y mostrar
    por pantalla la información de cada uno.
 */
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Fiat", "Cronos", 2020);
        Vehiculo vehiculo2 = new Vehiculo("Chevrolet", "Meriva", 2015);

        System.out.println("**** Info del primer vehiculo ****");
        System.out.println("Marca: " + vehiculo1.getMarca());
        System.out.println("Modelo: " + vehiculo1.getModelo());
        System.out.println("Año: " + vehiculo1.getAnio());

        System.out.println("**** Info del segundo vehiculo ****");
        System.out.println("Marca: " + vehiculo2.getMarca());
        System.out.println("Modelo: " + vehiculo2.getModelo());
        System.out.println("Año: " + vehiculo2.getAnio());
    }
}
