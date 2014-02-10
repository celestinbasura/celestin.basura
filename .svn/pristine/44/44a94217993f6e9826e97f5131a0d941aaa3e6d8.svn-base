/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Vje�ba V0310
 * Napisati program koji za u�itani broj sa konzole provjerava da li je prost.
 * Korisnik mo�e provjeravati brojeve dok ne unese 0. Ukoliko unese 0 izlazimo
 * iz programa.
 */
public class V0310 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int broj;
        boolean prost;

        do {
            System.out.print("Unesite broj za provjeru: ");
            broj = sc.nextInt();
            prost = true;

            if(broj > 0) {
                for(int i = 2; i < broj; i++) {
                    if(broj % i == 0) {
                        prost = false;
                    }
                }
                System.out.println(prost ? "Broj je prost" : "Broj nije prost");
            }
            else {
                if(broj < 0) {
                    System.out.println("Unesite cijeli broj veci od 0 ili 0 za izlaz !");
                }
                else {
                    System.out.println("Hvala na koristenju.");
                }
            }
        } while(broj != 0);

    }
}