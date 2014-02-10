/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Vjezbe.V0903;

import Poglavlje09.Vjezbe.V0903.klase.StedniRacun;

/**
 * Klasa Osoba sadrzi nekoliko racuna, te postavlja i ispisuje njihovo stanje.
 */
public class Osoba {

    public static void main(String[] args) {

        StedniRacun r1 = new StedniRacun();
        r1.setBrojRacuna("2340001-110123243");
        r1.setStanje(1243.23);
        r1.setBrojMjeseciStednje(28);
        r1.setKamataPrinosa(8.33);

        StedniRacun r2 = new StedniRacun();
        r2.setBrojRacuna("2320099-100022253");
        r2.setStanje(258.42);
        r2.setBrojMjeseciStednje(12);
        r2.setKamataPrinosa(4.53);

        StedniRacun r3 = new StedniRacun();
        r3.setBrojRacuna("2440006-110056573");
        r3.setStanje(2122.77);
        r3.setBrojMjeseciStednje(68);
        r3.setKamataPrinosa(6.72);

        System.out.println("Racun: " + r1);
        System.out.println("Racun: " + r2);
        System.out.println("Racun: " + r3);
        System.out.printf("Osoba ima ukupno %.2f kn na racunima \n",
                (r1.getStanje() + r2.getStanje() + r3.getStanje()));

    }

}
