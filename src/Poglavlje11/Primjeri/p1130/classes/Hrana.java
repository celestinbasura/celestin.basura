/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje11.Primjeri.p1130.classes;

import Poglavlje11.Primjeri.p1130.interfaces.Jestiv;

public abstract class Hrana implements Jestiv {

    private String ime;
    private int kcal;

    public Hrana(String ime, int kcal) {
        this.ime = ime;
        this.kcal = kcal;
    }

    public String getIme() {
        return ime;
    }

    public int getKcal() {
        return kcal;
    }

    @Override
    public String toString() {
        return String.format("Ime: %s, kcal: %d ", ime, kcal);
    }


}
