/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje08.Vjezbe.V0804;

import java.util.Scanner;

/**
 * Ispisuje instancu klase Osoba
 */
public class IspisOsobe {

    public static Osoba osoba1;
    public static Osoba osoba2;

    public static void main(String[] args) {

        String ime, prezime;
        int godina;
        Scanner sc = new Scanner(System.in);

        /*
         * unos i inicijalizacija 1. osobe
         */
        System.out.print("Unesite ime osobe: ");
        ime = sc.next();
        System.out.print("Unesite prezime osobe: ");
        prezime = sc.next();
        System.out.print("Unesite godinu rodjenja osobe: ");
        godina = sc.nextInt();

        osoba1 = new Osoba();
        osoba1.setImePrezime(ime, prezime);
        osoba1.setGodinaRodjenja(godina);

        /*
         * unos i inicijalizacija 2. osobe
         */
        System.out.print("Unesite ime osobe: ");
        ime = sc.next();
        System.out.print("Unesite prezime osobe: ");
        prezime = sc.next();
        System.out.print("Unesite godinu rodjenja osobe: ");
        godina = sc.nextInt();

        osoba2 = new Osoba();
        osoba2.setImePrezime(ime, prezime);
        osoba2.setGodinaRodjenja(godina);

        /*
         * provjera tko je stariji
         */
        if(osoba1.getGodinaRodjenja() < osoba2.getGodinaRodjenja()) {
            System.out.printf("Osoba %s je starija od osobe %s za %s godina.\n",
                    osoba1.getIme(), osoba2.getIme(),
                    osoba2.getGodinaRodjenja() - osoba1.getGodinaRodjenja());
        }
        else {
            System.out.printf("Osoba %s je starija od osobe %s za %d godina.\n",
                    osoba2.getIme(), osoba1.getIme(),
                    osoba1.getGodinaRodjenja() - osoba2.getGodinaRodjenja());
        }

        System.out.println("Hvala na koristenju programa !");

    }
}
