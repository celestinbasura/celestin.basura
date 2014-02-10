/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje12.Primjeri.p1210;

/**
 * Primjer p1215
 * Primjer apstraktne metode enum klase
 */
public class p1215 {

    public static void main(String[] args) {

        double d1 = 7;
        double d2 = 12;

        System.out.printf(" %.2f %s %.2f = %.2f \n",
                d1, Operacije.DIJELJENO,
                d2, Operacije.DIJELJENO.apply(d1, d2));

        
        for(Operacije o : Operacije.values()) {
            System.out.printf(" %.2f %s %.2f = %.2f \n",
                    d1, o, d2, o.apply(d1, d2));
        }

    }
}
