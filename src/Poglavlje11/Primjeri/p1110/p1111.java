/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje11.Primjeri.p1110;

import java.util.Arrays;

/**
 * Primjer p1111
 * Primjer kreiranja polja i ispisivanja elemenata polja. Elementi polja se
 * ispisuju pomoću Arrays.toString metode i to poredani po indeksu  polju.
 */
public class p1111 {

    public static void main(String[] args) {

        ImePrezime[] osobe = {
            new ImePrezime(7, "Marko", "Markovic"),
            new ImePrezime(12, "stanko", "Stankovic"),
            new ImePrezime(4, "Darko", "darkovic"),
            new ImePrezime(5, "janko", "jankovic")
        };

        System.out.println("Polje: " + Arrays.toString(osobe));
    }
}
