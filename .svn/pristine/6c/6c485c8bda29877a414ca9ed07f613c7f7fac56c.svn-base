/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje11.Zadaci.z1101;

/**
 * Klasa Polaznik opisuje jednog polaznika.
 */
public class Polaznik implements Ispisljiv {

    private String ime, prezime, mjesto, adresa;

    public Polaznik(String ime, String prezime, String mjesto, String adresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.mjesto = mjesto;
        this.adresa = adresa;
    }

    /**
     * Implenetacija metode ispisi ispisuje sve atribute polaznika.
     * @return stanje objekta
     */
    @Override
    public String ispisi() {
        return String.format("ime:%s, prezime:%s, mjesto:%s, adresa:%s",
                ime, prezime, mjesto, adresa);
    }
}
