/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje11.Primjeri.p1110;

public class ImePrezimeSortPrezime extends ImePrezime implements Comparable {

    public ImePrezimeSortPrezime(int id, String ime, String prezime) {
        super(id, ime, prezime);
    }

    @Override
    public int compareTo(Object o) {

        String mojePrezime = this.getPrezime();
        String tudjePrezime = ((ImePrezimeSortPrezime) o).getPrezime();
        return mojePrezime.compareTo(tudjePrezime);

    }
}
