package com.automation.clase3.ejercicios;

public class Ej2MenuV2 {
    /*
    Se requiere mostrar al cliente del restaurante “El bodegón” la opción (tipo int)
    que eligió para confirmar su pedido. Usando el menú de la imagen o el que desarrollaron ustedes,
    cuando el cliente elige la opción 3, mostrar en pantalla:
        “Usted eligió la opción 3 (24 piezas de sushi variadas), desea confirmar su orden??”
     */

    public static void main(String[] args) {
        int opcion = 3; // cambiar la opción para verificar que ingresa en cada case

        switch (opcion) {
            case 1:
                System.out.println("Usted eligió la opción 1 (Hamburguesas con papas fritas), desea confirmar su orden??");
                break;
            case 2:
                System.out.println("Usted eligió la opción 2 (Guiso de lentejas), desea confirmar su orden??");
                break;
            case 3:
                System.out.println("Usted eligió la opción 3 (24 piezas de sushi variadas), desea confirmar su orden??");
                break;
            case 4:
                System.out.println("Usted eligió la opción 4 (Pizza de jamon y morron), desea confirmar su orden??");
                break;
            case 5:
                System.out.println("Usted eligió la opción 5 (Empanadas de carne), desea confirmar su orden??");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }
}
