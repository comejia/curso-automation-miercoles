package com.automation.clase3;

import java.util.HashMap;
import java.util.Map;

public class P2Map {

    public static void main(String[] args) {

        Map<String, Integer> mapaDeNombreYEdades = new HashMap<>();

        mapaDeNombreYEdades.put("Juan", 25);
        mapaDeNombreYEdades.put("Pepe", 20);

        System.out.println("Valores del mapa: " + mapaDeNombreYEdades);

        System.out.println("Edad de Pepe: " + mapaDeNombreYEdades.get("Pepe"));
    }
}
