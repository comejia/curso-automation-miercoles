package com.automation.clase4;

public class P4Herencia {

    /*
    Crear una clase (padre) Persona y las clases Alumno y Profesor
    que hereden de Persona.
    Persona debe tener los atributos nombre y apellido (ambos strings).
    Alumno debe tener los atributos legajo (string), promedio de nota (double).
    Profesor debe tener los atributos curso a cargo (string)
    y si es ayudante o no (boolean)

    Todas las clases deben contar con sus constructores correspondientes
    y métodos getters & setters
     */
    public static void main(String[] args) {

        Profesor profesor = new Profesor("Perez", "Juan", "Automation");

        System.out.println("Nombre del profesor: " + profesor.getNombre());
    }
}
