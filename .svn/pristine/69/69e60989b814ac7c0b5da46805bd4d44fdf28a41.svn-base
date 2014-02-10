/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

package Poglavlje09.Primjeri.p0920;

import Poglavlje09.Primjeri.p0920.klase.Spiderman;
import Poglavlje09.Primjeri.p0920.klase.SuperHeroj;
import Poglavlje09.Primjeri.p0920.klase.Superman;

/**
 * Primjer p0922
 * Private atributi i metode se ne prenose u podklase, a final metode nije
 * moguće prikriti (override).
 *
 * Metoda getIme nije private te svaka klasa koja nasljeđuje klasu SuperHeroj
 * ima metodu getIme, no atribut ime klase SuperHeroj je private.
 */
public class p0922 {

    public static void main(String[] args) {

        SuperHeroj heroj = new SuperHeroj();
        Superman spam = new Superman();
        Spiderman spider = new Spiderman();

        System.out.println(heroj.getIme());
        System.out.println(spam.getIme() + spam.getMojeIme());
        System.out.println(spider.getIme() + spider.getMojeIme());

    }
}
