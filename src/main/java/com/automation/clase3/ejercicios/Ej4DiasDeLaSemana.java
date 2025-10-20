package com.automation.clase3.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ej4DiasDeLaSemana {
    /*
    Se requiere mostrar los días de la semana mediante un bucle de iteración. Para esto es necesario
        Almacenar en una lista de string los días de la semana (“Lunes,” “Martes”, … “Domingo”)
        Utilizar un bucle para iterar
        Dentro del bucle acceder a la lista mediante la posición
        Imprimir en pantalla un mensaje como: “Hoy es: Lunes”
     */

    public static void main(String[] args) {
        List<String> diasDeLaSemana = new ArrayList<>();

        diasDeLaSemana.add("Lunes");
        diasDeLaSemana.add("Martes");
        diasDeLaSemana.add("Miercoles");
        diasDeLaSemana.add("Jueves");
        diasDeLaSemana.add("Viernes");
        diasDeLaSemana.add("Sabado");
        diasDeLaSemana.add("Domingo");

        for (int i = 0; i < diasDeLaSemana.size(); i++) {
            System.out.println("Hoy es: " + diasDeLaSemana.get(i));
        }

        // Otras formas de iterar por una lista

        /* for each imperativo: es una simplificacion del for clasico. Util cuando
        se quiere recorrer toda la lista y no interesa el indice (i)
        */
//        for (String dia : diasDeLaSemana) {
//            System.out.println("Hoy es: " + dia);
//        }

        /*
        for each declarativo: sigue el estilo "funcional" donde no esta explicito el bucle
        */
//        diasDeLaSemana.forEach(dia -> System.out.println("Hoy es: " + dia));
    }
}
