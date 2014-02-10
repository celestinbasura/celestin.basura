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
import Poglavlje09.Primjeri.p0940.klase.Pas;
import Poglavlje09.Primjeri.p0940.klase.Riba;
import Poglavlje09.Primjeri.p0940.klase.Zivotinja;


/**
 * Primjer p0941
 * Primjer polimorfizna klasa. Klase Pas, Macka, Riba i Hrcak naslijeđuju
 * klasu Zivotinaj te možemo instance (objekte) navedenih klasa promatrati
 * kao objekte klase Zivotinja.
 */
public class p0941 {

    public static void main(String[] args) {

        Zivotinja z1 = new Pas();
        z1.setZivotinja("Rex", "Pas");

        Zivotinja z2 = new Macka();
        z2.setZivotinja("Tula", "Macka");

        Zivotinja z3 = new Hrcak();
        z3.setZivotinja("Fifi", "Hrcak");

        Zivotinja z4 = new Riba();
        z4.setZivotinja("Blub", "Riba");

        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
        System.out.println(z4);


    }
}
