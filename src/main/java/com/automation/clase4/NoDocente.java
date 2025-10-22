package com.automation.clase4;

public class NoDocente extends Persona {

    public NoDocente(String apellido, String nombre) {
        super(apellido, nombre);
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy un no docente");
    }
}
