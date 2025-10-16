package com.automation.clase4;

public class P2MainEstudiante {

    public static void main(String[] args) {

        P1Estudiante estudiante = new P1Estudiante();

        P1Estudiante estudiante2 = new P1Estudiante(20, "Juan Perez", 8.6f);

        //System.out.println("Datos del estudiante (vacio): " + estudiante);
        System.out.println("Id del estudiante: " + estudiante.getId());
        System.out.println("Nombre del estudiante: " + estudiante.getNombreCompleto());
        System.out.println("Promedio del estudiante: " + estudiante.getPromedio());

        System.out.println("Id del estudiante2: " + estudiante2.getId());
        System.out.println("Nombre del estudiante2: " + estudiante2.getNombreCompleto());
        System.out.println("Promedio del estudiante2: " + estudiante2.getPromedio());

        estudiante2.setPromedio(10.0f);

        System.out.println("Promedio del estudiante2: " + estudiante2.getPromedio());

        // float prom = estudiante.promedio; // esto no se pued hacer porque el atributo es privado.
    }
}
