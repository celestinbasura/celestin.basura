/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje10.Primjeri.p1050;

abstract class Zivotinja {

    protected String rod;
    protected String ime;

    public abstract String govori();

    public String getIme() {
        return ime;
    }

    public String getRod() {
        return rod;
    }

    @Override
    public String toString() {
        return rod + " " + ime;
    }
}
