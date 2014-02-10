/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0404 Primjer imena metode i varijable.
 */
class P0404 {

    public static void main(String[] args) {

        int suma = 7;

        suma++;
        suma();
        suma2();
    }

    static void suma() {

        System.out.println("pozdrav, ja sam metoda suma.");
    }
    static void suma2() {

        System.out.println("pozdrav, ja sam metoda suma2.");
    }
}
