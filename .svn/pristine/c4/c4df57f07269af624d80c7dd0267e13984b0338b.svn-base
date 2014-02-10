/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje11.Primjeri.p1120;

import java.util.Comparator;
import Poglavlje11.Primjeri.p1110.ImePrezimeSortPrezime;

/**
 * Komparator klasa za sortiranje dva objekta
 *
 */
public class ImePrezimeSortPoImenu implements Comparator {

    public int compare(Object o1, Object o2) {

        String prvoIme = ((ImePrezimeSortPrezime) o1).getIme().toLowerCase();
        String drugoIme = ((ImePrezimeSortPrezime) o2).getIme().toLowerCase();

        return prvoIme.compareTo(drugoIme);
    }
}
