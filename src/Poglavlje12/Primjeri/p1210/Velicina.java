/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje12.Primjeri.p1210;

/**
 * Enum klasa može imati deklarirane konstruktore, metode i overridane metode
 * klase Object.
 */
public enum Velicina {

    XXS("2xExtra small"),
    XS("Extra small"),
    S("Small"),
    M("Medium"),
    L("Large"),
    XL("Extra large"),
    XXL("2xExtra large");

    private String opis;

    public String getOpis() {
        return opis;
    }

    public void setOpis(String s) {
        opis = s;
    }

    Velicina(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return getOpis();
    }
};
