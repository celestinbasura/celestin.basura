/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Primjeri.p0940;

import Poglavlje09.Primjeri.p0940.klase.Hrcak;
import Poglavlje09.Primjeri.p0940.klase.Macka;
import Poglavlje09.Primjeri.p0940.klase.Riba;
import Poglavlje09.Primjeri.p0940.klase.Zivotinja;
import Poglavlje09.Primjeri.p0940.klase.Pas;


/**
 * Primjer p0942
 * Objekte različitih klasa možemo grupirati po njihovim zajedničkim svojstvima.
 * Klase imaju zajednička svojstva kada naslijeđuju istu klasu.
 */
public class p0942 {

    public static void main(String[] args) {

        Zivotinja[] zoo = {
            new Pas().setZivotinja("Rex", "Pas"),
            new Macka().setZivotinja("Tula", "Macka"),
            new Hrcak().setZivotinja("Fifi", "Hrcak"),
            new Riba().setZivotinja("Blub", "Riba")
        };

        for (int i = 0; i < zoo.length; i++) {
            System.out.println(zoo[i] + ", Klasa: "
                    + zoo[i].getClass().getSimpleName());
        }

    }
}
