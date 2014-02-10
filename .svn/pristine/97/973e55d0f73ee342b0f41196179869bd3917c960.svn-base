/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Vje�ba V0308
 * Napisati program koji ispisuje broj obrnutim redoslijedom znamenki.
 * Koristiti do-while petlju. Npr.
 *
 * Originalni broj : 12345
 * Obrnuti redoslijed : 54321
 */
public class V0308 {

    public static void main(String[] args) {

        int n = 12345;
        int t = 0;
        int r = 0;

        System.out.println("Originalni broj : " + n);

        while(n > 0) {
            t = n % 10;
            r = r * 10 + t;
            n = n / 10;
        }

        System.out.println("Obrnuti redosljed : " + r);

    }
}
