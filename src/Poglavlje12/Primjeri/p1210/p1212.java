/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje12.Primjeri.p1210;

/**
 * Primjer p1212
 * Primjer korištenja enum varijable u switch/case naredbi
 */
public class p1212 {

    public static void main(String[] args) {
        Boja b = Boja.PLAVA;
        String s = "";

        switch(b) {
        case CRVENA:
            s = "Crvena boja";
            break;
        case PLAVA:
            s = "Plava boja";
//            break;
        case ZELENA:
            s = "Zelena boja";
            break;
        case ZUTA:
            s = "Zuta boja";
            break;
        }

        System.out.println(b + " - " + s);

    }
}
