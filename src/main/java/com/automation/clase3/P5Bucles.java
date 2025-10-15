package com.automation.clase3;

public class P5Bucles {

    public static void main(String[] args) {

        // While
        int contador = 0;

        while(contador < 5) { // < =
            System.out.println("Hola Muna desde while!");
            contador++; // contador = contador + 1;
        }

        // Do-while
        int contador2 = 0;

        do {
            System.out.println("Hola Mundo desde do-while!");
            contador2++;
        } while (contador2 < 5);

        for(int i = 0; i < 5; i++) {
            System.out.println("Hola Mundo desde for!");
        }

        // Fin de archivo
    }
}
