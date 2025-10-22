package com.automation.clase4;

public class P5Polimorfismo {
    /*
    Siguiendo la Práctica 4, agregar una clase NoDocente que herede de Persona.
    Dentro de Persona definir un método saludar()
    que imprima “Hola, soy una persona”.
    Sobreescribir saludar() en cada clase hija:
        Alumno debe imprimir “Hola, soy un alumno”
        Profesor debe imprimir “Hola, soy un profesor”
        NoDocente debe imprimir “Hola, soy un no docente”
    En Profesor se debe implementar un método calificar() sobrecargado
    Si calificar recibe una nota, se debe mostrar “La nota del curso es: <nota>”
    Si calificar solo una nota y un Alumno, se debe mostrar “La nota del
    alumno <nombre> es: <nota>”
     */
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Juan", "Juan", "123456", 8.5);
        Profesor profesor = new Profesor("Perez", "Perez", "automaion");
        NoDocente noDocente = new NoDocente("NoDocente", "NoDocente");

        printer(alumno);
        printer(profesor);
        printer(noDocente);
    }

    public static void printer(Persona persona) {
        persona.saludar();
    }
}
