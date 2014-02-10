/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje12.Primjeri.p1210;

import java.util.Arrays;

/**
 * Primjer p1213
 * Primjer values() metode klase java.lang.Enum
 */
public class p1213 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Boja.values()));

        for(Boja b : Boja.values()) {
            System.out.printf("Instanca %s je %s \n", b, getOpisBoja(b));
        }
       

    }

    private static String getOpisBoja(Boja b) {

        switch(b) {
        case CRVENA:
            return "Crvena boja";
        case PLAVA:
            return "Plava boja";
        case ZELENA:
            return "Zelena boja";
        case ZUTA:
            return "Zuta boja";
        }
        return "";

    }
}
