/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0262
 * Primjer automatske promocije tipa podataka.
 */
public class P0262 {

    public static void main(String[] args) {

        byte a = 8;
        byte b = 5;

        byte c = (byte) (a + b);
        /* a i b su promovirani u int, te je rezultat ove operacije int */

        byte d = (byte)(a + b);
        /* ručni cast, ovo je ok */

        System.out.println("Vrijednost a: " + (a));
        System.out.println("Vrijednost b: " + (b));
        System.out.println("Vrijednost c: " + (c));
        System.out.println("Vrijednost d: " + (d));

    }
}