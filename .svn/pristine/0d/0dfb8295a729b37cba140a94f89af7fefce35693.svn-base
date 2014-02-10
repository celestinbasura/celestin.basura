/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje08.Zadaci.Z0801;

/**
 * Glavni program
 */
public class Program {

    public static void main(String[] args) {

        SimKartica simk = new SimKartica();
        Mobitel mob = new Mobitel();

        mob.setSim(simk);

        System.out.println("Tel. broj: " + simk.getTelBroj());
        System.out.println("Ser. broj: " + simk.getSerijskiBroj());

        System.out.printf("Provjeravam da li je %s pin: %s\n",
                "2212", simk.provjeriPin("2212"));

        System.out.printf("Provjeravam da li je %s puk: %s\n",
                "1012321989", simk.provjeriPuk("1012321989"));

        System.out.printf("Mijenjam pin na %s: %s\n",
                "2212", simk.promijeniPin("2212", "2244"));

        System.out.printf("Resetiram pin: %s\n",
                simk.resetirajPin("2244", "1012321989"));

    }

}
