/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Zadatak Z0304
 * Napisati program koji generira slu�ajne brojeve u intervalu 1 do 20 sve dok
 * slu�ajni broj nije 11. Na kraju je potrebno je ispisati ukupan broj
 * generiranih brojeva, njihovu sumu i srednju vrijednost.
 */
public class Z0304 {

    public static void main(String[] args) {

        System.out.println("Generiram slucajne brojeve [1..20];");
        int suma = 0;
        int br = 0;
        int slucajniBroj;

        do {
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException e) {
            };
            slucajniBroj = (int)(Math.random() * 19) + 1;
            br++;
            suma += slucajniBroj;
            System.out.print(slucajniBroj + ", ");
        } while(slucajniBroj != 11);

        System.out.println();
        System.out.printf("Broj generiranih brojeva: %d \n", br);
        System.out.printf("Suma niza generiranih brojeva: %d \n", suma);
        System.out.printf("Srednja vrijednost niza generiranih brojeva: %.3f \n",
                ((double)suma / br));

    }
}
