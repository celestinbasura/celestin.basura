/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Vjezbe.V0902.klase;

/**
 * Osnovni bankovni racun klijenta. Ovaj racun ima osnovno stanje i broj
 * racuna u banci. Ne dozvoljava minus ni kamate.
 */
class Racun {

    private double stanje;
    private String brojRacuna;

    /**
     * Metoda vraca trenutno stanje racuna, tj. iznos raspoloziv za isplatu.
     * @return iznos raspoloziv za isplatu.
     */
    public double getStanje() {
        return stanje;
    }

    /**
     * Metoda postavlja stanje racuna.
     * @param novoStanje novo stanje racuna.
     */
    public void setStanje(double novoStanje) {
        this.stanje = novoStanje;
    }

    /**
     * Metoda vraca broja racuna.
     * @return broja racuna u banci.
     */
    public String getBrojRacuna() {
        return brojRacuna;
    }

    /**
     * Metoda postavalja broj racuna u banci.
     * @param brojRac broj racuna.
     */
    public void setBrojRacuna(String brojRac) {
        brojRacuna = brojRac;
    }

    /**
     * Metoda ispisuje iznos raspoloziv za isplatu i broj racuna.
     */
    @Override
    public String toString() {
        return String.format("Racun broj %s sa stanjem %.2f kn", brojRacuna,
                getStanje());
    }

}
