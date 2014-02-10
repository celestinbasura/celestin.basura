package Poglavlje07.Rjesenja;

/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright Tomislav Novak @ NetAkademija
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program koji racuna proste brojeve manje od nekog zadanog broja pomocu
 * Eratostenovog sita.
 *
 * @author Tomislav Novak
 */
public class V0709 {

    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);
        int maksimalniBroj;

        do {
            System.out.println("Unesite do kojeg broja želite ispisati proste brojeve: ");
            maksimalniBroj = unos.nextInt();

            if (maksimalniBroj < 2) {
                System.out.println("Broj ne smije biti manji od 2!");
            }
        } while (maksimalniBroj < 2);

        ArrayList<Integer> prosti = prostiErastoten(maksimalniBroj);

        if (prosti != null) {
            System.out.println("Prosti brojevi su:");

            for (Integer broj : prosti) {
                System.out.println(broj);
            }
        }
    }

    /**
     * Metoda koja vrača kolekciju svih prostih brojeva manjih i jednakih zadanom broju.
     * 
     * @param zadaniBroj
     * @return Kolekcija svih prostih brojeva manjih i jednakih zadanom broju.
     */
    static ArrayList<Integer> prostiErastoten(int zadaniBroj) {

        /* Prosti brojevi su pozitivni brojevi ve�i od 1 */
        if (zadaniBroj < 2) {
            return null;
        }
        int trenutniProstak = 0;
        ArrayList<Integer> brojevi = new ArrayList<>();

        /* Postavljanje inicijalne liste brojeva - [2, zadaniBroj>*/
        for (int i = 2; i < zadaniBroj; i++) {
            brojevi.add(i);
        }

        /* Izbacivanje iz liste brojeva prema algoritmu Erastotenovog sita.
         * Algoritam:
         *  1. - oznacavanje prvog broja iz liste kao prostog.
         *  2. - izbacivanje svih brojeva koji su vi�eratnici tog broja iz liste.
         *  3. - ozna�avanja sljede�eg broja koji nije izba�en u listi.
         *  4. - ponavljanje koraka 2 dok se ne do�e do kraja liste.
         */
        for (int i = 0; i < brojevi.size(); i++) {

            trenutniProstak = brojevi.get(i);

            for (int j = i + 1; j < brojevi.size(); j++) {
                if (brojevi.get(j) % brojevi.get(i) == 0) {
                    brojevi.remove(j);
                }
            }
        }
        return brojevi;
    }
}
