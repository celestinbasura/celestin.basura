/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje11.Primjeri.p1110;

public class ImePrezimeSortId extends ImePrezime implements Comparable {

    public ImePrezimeSortId(int id, String ime, String prezime) {
        super(id, ime, prezime);
    }

    @Override
    public int compareTo(Object referenca) {

        return getId() - ((ImePrezimeSortId) referenca).getId();
    }
}
