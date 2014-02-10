/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Primjeri.p0930;

import Poglavlje09.Primjeri.p0930.klase.AlanFordLikKojiGovori;

/**
 * Primjer p0932
 * Primjer prikrivanja metode toString();
 */
public class p0932 {

    public static void main(String[] args) {

        AlanFordLikKojiGovori likSuperhik = new AlanFordLikKojiGovori();
        likSuperhik.setImeGrupa("Superhik", "Bilo koja, samo da nije TNT");

        System.out.println(likSuperhik);

    }
}
