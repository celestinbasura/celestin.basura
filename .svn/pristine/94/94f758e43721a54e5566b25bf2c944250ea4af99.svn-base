/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje12.Primjeri.p1220;

/**
 * Primjer p1222
 * Instanciranje objekta unutarnje klase mora biti napravljano preko objekta
 * vanjske klase dok referenciranje radimo preko imena vanjske klase.
 */
public class p1222 {

    public static void main(String[] args) {

        Parovi p = new Parovi(10);
        Parovi p2 = new Parovi(10);
        Parovi.Par pr = p2.new Par(1322, "cetvrti");
        System.out.print(pr);

        pr.setIme("peti");
        System.out.println(pr);

    }
}
