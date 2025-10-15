package com.automation.clase3;

public class P4EstructurasCondicionales {

    public static void main(String[] args) {

        int var1 = 100;
        int var2 = 340;

        if(var1 < var2) {
            System.out.println("Se cumple la condicion, var1 es menor a var2");
        }

        if(var1 > var2) {
            System.out.println("Var1 es mayor a var2");
        } else {
            System.out.println("Var1 no es mayor a var2");
        }

        if(var1 < var2) {
            System.out.println("Var1 es menor a var2");
            if(10 != 20) {
                System.out.println("10 es distinto de 20");
            }
        } else {
            System.out.println("Var1 no es mayor a var2");
        }


        String diaDeLaSemana = "Miercoles";

        if (diaDeLaSemana == "Lunes") {
            System.out.println("Hoy es Lunes");
        } else if (diaDeLaSemana == "Martes") {
            System.out.println("Hoy es Martes");
        } else if (diaDeLaSemana == "Miercoles") {
            System.out.println("Hoy es miercoles");
        } else {
            System.out.println("No es lu, ma ni mie");
        }

        switch (diaDeLaSemana) {
            case "Lunes": // diaDeLaSemana == "Lunes"
                System.out.println("Hoy es Lunes");
                break;
            case "Martes": // diaDeLaSemana == "Martes"
                System.out.println("Hoy es Martes");
                break;
            case "Miercoles": // diaDeLaSemana == "Miercoles"
                System.out.println("Hoy es miercoles");
                break;
            default:
                System.out.println("No es lu, ma ni mie");
                break; // esto es opcional
        }

        // ....
    }
}
