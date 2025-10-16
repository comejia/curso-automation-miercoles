package com.automation.clase4;

public class P1Estudiante {
    /*
    Crear la clase Estudiante que tiene como atributos
     el id (int), nombre completo (string) y
     promedio (float). Además, agregar el constructor vacío,
     el constructor con todos los parámetros (“completo”) y
     los métodos getters & setters.
     */

    private int id;
    private String nombreCompleto;
    private float promedio;

    public P1Estudiante() {
        this.id = 0;
        this.nombreCompleto = "";
        this.promedio = 5;
    }

    public P1Estudiante(int id, String nombreCompleto, float promedio) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.promedio = promedio;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
}
