/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje04.Rjesenja;

/**
 * Vje�ba V0404
 * Napisati program koji ima metodu prostBroj. Metoda prostBroj prima cijeli
 * broj kao parametar i vra�a vrijednost boolean true ako je parametar prost
 * broj ili false ukoliko nije.
 * Napomena: Glavna metoda main ispisuje proste brojeva u nekom intervalu
 * od M do N.
 */
public class V0404 {

    public static void main(String[] args) {

        final int START = 5;
        final int END = 68;

        System.out.format("U intervalu od %d do %d su prosti brojavi: ",
                START, END);
        for(int i = START; i <= END; i++) {
            if(prostBroj(i)) {
                System.out.print(i + " ");
            }
        }

    }

    static boolean prostBroj(int broj) {
        for(int i = 2; i < broj; i++) {
            if(broj % i == 0) {
                return false;
            }
        }
        return true;
    }
}
