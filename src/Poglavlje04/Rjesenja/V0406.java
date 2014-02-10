/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje04.Rjesenja;

/**
 * Vje�ba V0406
 * Napisati program koji ima metodu provjeriGodinu koja prima godinu u
 * parametru te vra�a broj dana u toj godini. Godina se u�itava sa konzole,
 * dok se broj dana ispisuje u main metodi.
 */
public class V0406 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Unesite godinu: ");
        int godina = sc.nextInt();

        int brojDana = provjeriGodinu(godina);
        System.out.println("Broj dana u godini: " + brojDana);

    }

    public static int provjeriGodinu(int godina) {

        if((godina % 4 == 0) && ((godina % 100 != 0) || (godina % 400 == 0))) {
            return 366;
        }

        return 365;

    }
}
