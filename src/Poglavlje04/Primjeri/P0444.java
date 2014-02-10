package Poglavlje04.Primjeri;

/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0444
 * Primjer preopterecenja metoda, potpis metode, gre�ke.
 */
class P0444 {

    public static void main(String[] args) {

        int i = 5;
        long l = 10;

        // greska, pozivamo metodu kojoj je povratna vrijednost tipa long, z1 je int
        int z1 = (int) metodaZbroji(i, (int) l);
    }

    static int metodaZbroji7(int a, int b) {
        return a + b;
    }

    // gre�ka, povratni tip nije u potpisu metode, vec imamo metodu s ovim potpisom
    static long metodaZbroji(int c, int d) {
        return c + d;
    }

    static long metodaOverload(int a, long b) {
        return a + b;
    }
}
