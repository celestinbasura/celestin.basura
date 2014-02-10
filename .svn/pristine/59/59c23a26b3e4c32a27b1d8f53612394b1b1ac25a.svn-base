/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1530;

import java.io.Serializable;

public class Kontakt implements Serializable {

    Adresa kuca;
    Adresa posao;

    public Kontakt(Adresa kuca, Adresa posao) {
        this.kuca = kuca;
        this.posao = posao;
    }

    public Adresa getKuca() {
        return kuca;
    }

    public Adresa getPosao() {
        return posao;
    }

    @Override
    public String toString() {
        return String.format("home: %s\nwork: %s", kuca, posao);
    }
}
