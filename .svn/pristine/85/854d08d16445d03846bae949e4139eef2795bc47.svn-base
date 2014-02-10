/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje04.Rjesenja;

/**
 * Vje�ba V0405
 * Napisati program koji ima metodu zbrajajLimit. Metoda zbrajajLimit prima
 * kao parametre dva cijela broja max i limit. Metoda ra�una sumu svih brojeva
 * od 1 do max dok god je ta suma manja od limita i vra�a izra�unatu vrijednost.
 */
public class V0405 {

    public static void main(String[] args) {

        int max = 55;
        int limit = 68;

        System.out.format("Suma je: %d", zbrajajLimit(max, limit));

    }

    static int zbrajajLimit(int max, int limit) {
        int suma = 0;
        for(int i = 1; i <= max; i++) {
            suma += i;
            System.out.printf("suma: %d, i: %d \n", suma, i);
            if(suma > limit) {
                suma -= i;
                return suma;
            }
        }
        return suma;
    }
}
