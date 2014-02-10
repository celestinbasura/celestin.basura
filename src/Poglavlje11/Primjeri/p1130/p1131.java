/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje11.Primjeri.p1130;

import Poglavlje11.Primjeri.p1130.classes.Badem;
import Poglavlje11.Primjeri.p1130.classes.Cedevita;
import Poglavlje11.Primjeri.p1130.interfaces.Jestiv;

/**
 * Primjer p1131
 * Svojsvo objekta definirano suceljem koje implementira
 */
public class p1131 {

    public static void main(String[] args) {

        Jestiv d1 = new Badem();
        Jestiv d2 = new Cedevita();

        System.out.println(d1.kakoKonzumirati());
        System.out.println(d2.kakoKonzumirati());

    }
}
