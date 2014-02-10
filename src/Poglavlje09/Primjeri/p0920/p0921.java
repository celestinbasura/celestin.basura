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
 * Primjer p0921
 * Primjer prikazuje overriding metoda. Primjetimo kako sva tri objekta
 * pozivaju metodu istog imena, ali sa rezličitim povratnim rezultatima.
 */
public class p0921 {

    public static void main(String[] args) {

        SuperHeroj heroj = new SuperHeroj();
        Superman spam = new Superman();
        Spiderman spider = new Spiderman();

        System.out.println(heroj.mojProgram());
        System.out.println(spam.mojProgram() + spam.mojSuperProgram());
        System.out.println(spider.mojProgram());

    }
}
