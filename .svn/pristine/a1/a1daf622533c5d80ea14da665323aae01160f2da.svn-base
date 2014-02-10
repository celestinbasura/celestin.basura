/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje08.Zadaci.Z0802;

/**
 * Glavni program
 */
public class Program {

    public static void main(String[] args) {

        SimKartica simk = new SimKartica();
        Mobitel mob = new Mobitel();
        mob.setSim(simk);

        Imenik im = simk.getImenik();

        System.out.println("Kapacitet: " + im.slobodniKapacitet());

        Kontakt k1 = new Kontakt();
        k1.setIme("Ivan");
        k1.setBroj("0912232423");

        Kontakt k2 = new Kontakt();
        k2.setIme("Marko");
        k2.setBroj("0913342121");

        im.dodajKontakt(k1);
        im.dodajKontakt(k2);
        System.out.println("Kapacitet: " + im.slobodniKapacitet());
        System.out.print("Ispis" + im.ispisImenika());

        Kontakt k3 = im.pretraziPoImenu("Ivan");
        System.out.printf("Pronađen kontakt: %s, %s\n",
                k3.getIme(), k3.getBroj());

        Kontakt k4 = im.pretraziPoBroju("0913342121");
        System.out.printf("Pronađen kontakt: %s, %s\n",
                k4.getIme(), k4.getBroj());

        System.out.println("Brisanje po broju:");
        im.brisiKontaktPoBroju(k3);
        System.out.print(im.ispisImenika());

        System.out.println("Brisanje po imenu:");
        im.brisiKontaktPoImenu(k4);
        System.out.print(im.ispisImenika());

    }
}
