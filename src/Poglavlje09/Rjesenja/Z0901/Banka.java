/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Zadaci.Z0901;

/**
 * Banka inicijalizira dviej Osobe i dodaje im nekoliko Racuna.
 */
public class Banka {

    public static void main(String[] args) {

        Osoba marko = new Osoba();
        marko.setIme("Marko");
        marko.setPrezime("Ivic");


        TekuciRacun markoR1 = new TekuciRacun();
        markoR1.setBrojRacuna("2242002-110123223");
        markoR1.setStanje(1232.33);
        markoR1.setDozvoljeniMinus(133.52);
        if (marko.addRacun(markoR1)) {
            System.out.println("Racun je uspjesno postavljen");
        }

        StedniRacun markoR2 = new StedniRacun();
        markoR2.setBrojRacuna("2242002-110123223");
        markoR2.setStanje(2213.04);
        markoR2.setKamataPrinosa(3.53);
        markoR2.setBrojMjeseciStednje(31);
        if (marko.addRacun(markoR2)) {
            System.out.println("Racun je uspjesno postavljen");
        }

        System.out.println(marko);

        markoR1.uplata(122.56);
        System.out.print("Uplata, " + marko);
        markoR2.uplata(486.21);
        System.out.print("Uplata, " + marko);

        markoR1.isplata(246.38);
        System.out.print("Isplata, " + marko);
        markoR2.isplata(2365.72);
        System.out.print("Isplata, " + marko);

    }

}
