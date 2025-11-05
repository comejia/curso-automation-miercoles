package com.automation.clase5;

import java.io.IOException;

public class P3Main {
    public static void main(String[] args) {

        P3Reader reader = new P3Reader("texto.txt");

        String textoLeido;

        try {
            textoLeido = reader.read();
        } catch (IOException e) {
            System.out.println("Problemas al leer el archivo");
        }
    }
}
