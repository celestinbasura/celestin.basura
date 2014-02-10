/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje11.Primjeri.p1120;

import java.util.Arrays;
import Poglavlje11.Primjeri.p1110.ImePrezimeSortPrezime;

/**
 * Primjer p1122
 * Sortiranje objekata koristeći prirodno sortiranje implementirano metodom
 * compare sučelja Comparator
 */
public class p1122 {

    public static void main(String[] args) {

        ImePrezimeSortPrezime[] osobe = {
            new ImePrezimeSortPrezime(7, "Marko", "Stankovic"),
            new ImePrezimeSortPrezime(12, "stanko", "Darkovic"),
            new ImePrezimeSortPrezime(4, "Darko", "jankovic"),
            new ImePrezimeSortPrezime(5, "janko", "markovic")
        };

        Arrays.sort(osobe, new ImePrezimeSortPoImenu());
        System.out.println("Polje: " + Arrays.toString(osobe));
    }
}
