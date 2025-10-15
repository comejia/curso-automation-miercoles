package com.automation.clase2;

import java.time.LocalDate;

public class Ej3DatosEstudiante {

    public static void main(String[] args) {
        String nombre = "Juan";
        String apellido = "Perez";
        int edad = 30;
        boolean trabaja = true;
        float promedio = 7.89f;
        String fechaNacimiento = "02/10/1995";

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("¿Trabaja? " + trabaja);
        System.out.println("Promedio: " + promedio);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);

        System.out.println("Resumen: El alumno " + nombre + " " + apellido + ", nacido el " + fechaNacimiento + ", de edad " + edad + " tiene un promedio de " + promedio + ".");

        // Uso de LocalDate para manejar fechas
        LocalDate fechaNacimiento2 = LocalDate.of(1995, 10, 2);
        System.out.println("Fecha usando LocalDate: " + fechaNacimiento2);
    }
}
