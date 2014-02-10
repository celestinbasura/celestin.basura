/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Tomislav Novak - NetAkademija
 */
package Poglavlje05.Rjesenja;

import java.util.Scanner;

/**
 * V0502
 * Napisati program koji u�itava cijele brojeve sve dok korisnik ne unese: �Kraj�. 
 * Program ra�una srednju vrijednost unesenih vrijednosti i ispisuje na ekran.
 * (Napomena: ukoliko se �eli uspore�ivati dva Stringa potrebno je koristiti metodu equals 
 * kao u primjeru sa predavanja: P0514.)
 */
public class V0502 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ulaz;
        int suma = 0;
        int brojac = 0;
        double avg;

        while (!(ulaz = sc.next()).equals("Kraj")) {
            suma += Integer.parseInt(ulaz);
            brojac++;
        }

        if (brojac > 0) {
            System.out.println("Srednja vrijednost iznosi: " + ((double) suma / brojac));
        } else {
            System.out.println("Nije unesena niti jedna vrijednost.");
        }
    }
}
