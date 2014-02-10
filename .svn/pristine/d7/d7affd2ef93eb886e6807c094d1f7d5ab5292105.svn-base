/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Vjezbe.V0902;

import Poglavlje09.Vjezbe.V0902.klase.TekuciRacun;

/**
 * Klasa Osoba sadrzi nekoliko racuna, te postavlja i ispisuje njihovo stanje.
 */
public class Osoba {

    public static void main(String[] args) {

        TekuciRacun r1 = new TekuciRacun();
        r1.setBrojRacuna("2340001-110123243");
        r1.setStanje(1243.23);
        r1.setDozvoljeniMinus(1200);

        TekuciRacun r2 = new TekuciRacun();
        r2.setBrojRacuna("2320099-100022253");
        r2.setStanje(258.42);
        r2.setDozvoljeniMinus(400);

        TekuciRacun r3 = new TekuciRacun();
        r3.setBrojRacuna("2440006-110056573");
        r3.setStanje(2122.77);
        r3.setDozvoljeniMinus(600);

        System.out.println("Racun: " + r1);
        System.out.println("Racun: " + r2);
        System.out.println("Racun: " + r3);
        System.out.printf("Osoba ima ukupno %.2f kn na racunima \n",
                (r1.getStanje() + r2.getStanje() + r3.getStanje()));

    }

}
