/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje07.Rjesenja;

import java.util.Arrays;
import java.util.Scanner;

/**
 * vježba v0608
 * Napisati program koji upisuje imena u polje Stringova. Imena se upisuju iz
 * programa koristeći klasu Scanner. Svako uneseno ime se ubacuje u polje.
 * Početna veličina polja je 5,a faktor uvećanja polja je 1.3. Kada se zauzmu
 * sva mjesta u polju, potrebno je povećati polje na dimenziju uvećanu za faktor
 * uvećanja. Kako poljima nije moguće mijenjati veličinu potrebno je kreirati
 * novo polje uvećano za faktor uvećanja,zatim kopirati sadržaj polja u novo
 * polje. Program upisuje nova imena u listu sve dok korisnik ne unese znak '.'
 * kao ime. Prije nego što se program završi potrebno je ispisati statistiku
 * polja, sadržaj liste imena, te sortirani sadržaj liste imena. Za sortiranje
 * podataka polja koristite metodu Arrays.sort. Za kopiranje sadžaja polja
 * koristite metodu System.arraycopy
 *
 * Koristiti ovako definiranu metodu main:
 * PRILOŽITI METODU MAIN
 *
 * Statistika polja treba sadržati slijedeće podatke:
 *  - trenutna veličina polja, zauzeće polja
 *  - broj promjene dimenzija polja
 * ( potrebno je zabilježiti svako povećanje zbog nedostatka prostora)
 *
 * Primjer:
 * C:\>java PopisImena
 * > ana
 * > jure
 * > ivan
 * > sandra
 * > josip
 * > sanja
 * > vesna
 * > lovro
 * > gea
 * > .
 *
 * Broj imena u polju = 9
 * Alocirano prostora = 9
 * Faktor povecanja = 1.3
 * Broj realokacija = 5
 *
 * Sadrzaj polja
 * ana
 * jure
 * ivan
 * sandra
 * josip
 * sanja
 * vesna
 * lovro
 * gea
 *
 * Sortirani sadrzaj polja
 * ana
 * gea
 * ivan
 * josip
 * jure
 * lovro
 * sandra
 * sanja
 * vesna
 */
public class V0708 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] popis = new String[5];
        double faktorUvecanjaPolja = 1.3;

        int brojRelokacija = 0;

        char znak;
        String s;
        int duljinaPolja;
        do {
            System.out.print("> ");
            s = sc.nextLine();
            znak = s.trim().charAt(0);
            if(znak != '.') {
                duljinaPolja = popis.length;
                popis = dodajIme(popis, s, faktorUvecanjaPolja);
                if(duljinaPolja < popis.length) {
                    brojRelokacija++;
                }
            }
        } while(znak != '.');

        System.out.println("Broj imena u polju: " + getBrojImenaUPolju(popis));
        System.out.println("Alocirano prostora: " + getVelicinaPolja(popis));
        System.out.println("Faktor uvecanja: " + faktorUvecanjaPolja);
        System.out.println("Broj relokacija: " + brojRelokacija);
        System.out.println("Sadrzaj polja: " + Arrays.toString(popis));

    }

    static String[] dodajIme(String[] polje, String ime, double faktor) {

        if(polje[polje.length - 1] != null) {
            polje = Arrays.copyOf(polje, (int)(polje.length * faktor));
        }

        for(int i = 0; i < polje.length; i++) {
            if(polje[i] == null) {
                polje[i] = ime;
                break;
            }
        }

        return polje;
    }

    static int getBrojImenaUPolju(String[] polje) {
        int brojac = 0;
        for(int i = 0; i < polje.length; i++) {
            if(polje[i] != null) {
                brojac++;
            }
        }
        return brojac;
    }

    static int getVelicinaPolja(String[] polje) {
        return polje.length;
    }
}
