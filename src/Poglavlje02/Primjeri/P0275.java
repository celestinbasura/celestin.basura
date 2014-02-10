/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0275
 * Primjer trajanja varijable, scope
 */
public class P0275 {

    public static void main(String[] args) {             // vanjski blok naredbi

        int a = 6;

        if (true) {                                       // unutarnji blok
            int b = 10;
            System.out.printf("a: %d, b: %d \n", a, b);
        }

        if (a < 5) {                                       // unutarnji blok
            int b = 11;
            System.out.printf("a: %d, b: %d  \n", a, b);
        }
        else {                                          // unutarnji blok
            int b = 12;
            System.out.printf("a: %d, b: %d  \n", a, b);
        }

    }
}
