package com.automation.clase4;

public class Profesor extends Persona {

    private String curso;

    public Profesor(String apellido, String nombre, String curso) {
        super(apellido, nombre);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un profesor");
    }
}
