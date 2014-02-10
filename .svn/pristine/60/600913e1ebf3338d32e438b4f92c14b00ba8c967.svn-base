/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Vje�ba V0307
 * Napisati program koji ra�una vrijednost faktorijela za neki zadani broj
 * MAX_N gdje je MAX_N konstanta koja ne smije biti ve�a od 10.
 *
 * n ! = 1 * 2 * 3 * 4 * 5 * 6 * ... * n
 *
 * Pitanje: �to se dogodi kad poku�amo izra�unati faktorijelu od 20
 * (maknuti uvjet da mora biti manji od 10).
 */
public class V0307 {

    public static void main(String[] args) {

        final int MAX_N = 10;
        int faktorijela = 1;


        if(MAX_N <= 10) {
            for(int i = 1; i <= MAX_N; i++) {
                faktorijela *= i;
            }
        }
        else {
            System.out.println("Prevelik N, ne smije biti veći od 10");
        }

        System.out.printf("%d ! = %d ", MAX_N, faktorijela);

    }
}
