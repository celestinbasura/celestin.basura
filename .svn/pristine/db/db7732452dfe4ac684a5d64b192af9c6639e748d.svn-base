/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje08.Vjezbe.V0803;

import java.util.Scanner;

/**
 * Ispisuje instancu klase Osoba
 */
public class IspisOsobe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite ime osobe: ");
        String ime = sc.next();

        System.out.print("Unesite prezime osobe: ");
        String prezime = sc.next();

        System.out.print("Unesite godinu rodjenja osobe: ");
        int godina = sc.nextInt();

        Osoba os = new Osoba();
        os.setImePrezime(ime, prezime);
        os.setGodinaRodjenja(godina);

        int godinaZaProvjeru;
        do {
            System.out.print("Unesite godinu za provjeru: ");
            godinaZaProvjeru = sc.nextInt();

            if(godinaZaProvjeru >= os.getGodinaRodjenja()) {
                System.out.print(os.stanje());
                System.out.printf(" Godine %d %s bila punoljetna \n",
                        godinaZaProvjeru,
                        (os.isPunoljetan(godinaZaProvjeru)) ? "je" : "nije");
            }

        } while(godinaZaProvjeru != 0);

        System.out.println("Hvala na koristenju programa !");

    }
}
