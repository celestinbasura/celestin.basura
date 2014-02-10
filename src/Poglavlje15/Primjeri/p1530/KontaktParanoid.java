/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1530;

public class KontaktParanoid extends Kontakt {

    private transient Adresa trenutnaLokacija;

    public KontaktParanoid(Adresa kuca, Adresa posao, Adresa trenutnaLokacija) {
        super(kuca, posao);
        this.trenutnaLokacija = trenutnaLokacija;
    }

    @Override
    public String toString() {
        return String.format("home: %s\nwork: %s\nloc: %s", 
                kuca, posao, trenutnaLokacija);
    }
}
