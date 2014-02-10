/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Vjezbe.v0804;


import p08.zadaci.z0801.Racun;
import p08.zadaci.z0801.StedniRacun;
import p08.zadaci.z0801.TekuciRacun;

/**
 * Klasa Osoba sadrzi nekoliko racuna, te postavlja i ispisuje njihovo stanje.
 * Napomen: zadatak se nemože napisati kako je zadan jer kod korištenja
 * polimorfizma kalse moraju biti iz iste hijerarhije klasa, tj. mora vrijediti
 * rezultat true instanceof operatora.
 */
public class Osoba {

    public static void main(String[] args) {

        Racun[] racuni = {
            new Racun(),
            new Racun(),
            new TekuciRacun(),
            new TekuciRacun(),
            new StedniRacun(),
            new StedniRacun()
        };

        for(int i=0; i<racuni.length; i++) {

            racuni[i].setBrojRacuna("2340001-110123243");
            racuni[i].setStanje(1243.23);

            if (racuni[i] instanceof TekuciRacun) {
                ((TekuciRacun)racuni[i]).setDozvoljeniMinus(1200);
            }

            if (racuni[i] instanceof StedniRacun) {
                ((StedniRacun)racuni[i]).setKamataPrinosa(6.22);
                ((StedniRacun)racuni[i]).setBrojMjeseciStednje(12);
            }
        }

        double ukupnoStanje = 0;

        for(Racun r : racuni) {
            System.out.println("Racun: " + r);
            ukupnoStanje += r.getStanje();
        }

        System.out.printf("Ukupno stanje svih racuna je %.2f kn\n", ukupnoStanje);

    }

}
