/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje04.Rjesenja;

/**
 * Vje�ba V0403
 * Napisati program koji ima metodu prostBroj. Metoda prostBroj prima cijeli
 * broj kao parametar i vra�a vrijednost boolean true ako je parametar prost
 * broj ili false ukoliko nije.
 * Napomena: Glavna metoda main ispisuje da li je zadani broj prost.
 */
public class V0403 {

    public static void main(String[] args) {

        int broj = 13;
        System.out.println(prostBroj(broj) ? "Broj je prost" : "Broj nije prost");

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
