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
import Poglavlje11.Primjeri.p1130.classes.Hrana;
import Poglavlje11.Primjeri.p1130.classes.Jabuka;
import Poglavlje11.Primjeri.p1130.interfaces.Cookable;
import Poglavlje11.Primjeri.p1130.interfaces.Jestiv;

/**
 * Primjer p1133
 * Svojsvo objekta definirano suceljem koje implementira
 */
public class p1133 {

    public static void main(String[] args) {

        Hrana[] jela = {
            new Badem(),
            new Jabuka(),
            new Cedevita()
        };

        for (Hrana f : jela) {
            System.out.print("\n\n" + f);
            if (f instanceof Cookable) {
                System.out.printf("\n    pripremiti: %s",
                        ((Cookable) f).kakoPripremiti());
            }
            if (f instanceof Jestiv) {
                System.out.printf("\n    konzumirati: %s",
                        ((Jestiv) f).kakoKonzumirati());
            }
        }


    }
}
