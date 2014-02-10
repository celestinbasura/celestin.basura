/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Vje�ba V0317
 * Napisati program koji pomo�u while petlje ra�una vrijednost fibonaccijevog
 * niza za neku konstantu N tipa int koja je u intervalu 2..10.
 *
 * F(n) = 0, ako je n = 0
 * F(n) = 1, ako je n = 1
 * F(n) = F(n-1) + F(n-2), ako je n > 1
 *
 * Primjer niza fibonnacijevih brojeva: F(7): 1, 1, 2, 3, 5, 8, 13
 */
public class V0317 {

    public static void main(String[] args) {

        final int N = 7;

        int F0 = 0;
        int F1 = 1;
        int br = 2;
        int Fn = 1;

        while(br <= N) {
            Fn = F1 + F0;
            F0 = F1;
            F1 = Fn;
            br++;
        }

        System.out.println("Vrijednost niza je: " + Fn);

    }
}