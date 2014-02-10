/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Zadaci.Z0901;


/**
 * Klasa Osoba sadrzi nekoliko racuna, te postavlja i ispisuje njihovo stanje.
 * Napomen: zadatak se nemože napisati kako je zadan jer kod korištenja
 * polimorfizma kalse moraju biti iz iste hijerarhije klasa, tj. mora vrijediti
 * rezultat true instanceof operatora.
 */
public class Osoba {

    private String ime, prezime;
    private Racun[] racuni = new Racun[20];


    /**
     * Metoda postavlja ime osobi.
     * @param ime ime osobe.
     */
    public void setIme(String ime) {
        this.ime = ime;
    }

    /**
     * Metoda postavlja prezime osobe.
     * @param prezime prezime osobe.
     */
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    /**
     * Metoda vraca string sa stanjem osobe: ime, prezime, i ukupno stanje
     * po svim racunima.
     * @return stanje osobe.
     */
    @Override
    public String toString() {

        return String.format("Ime: %s, Prezime: %s, Ukupno stanje: %.2f kn \n",
                ime, prezime, getUkupnoStanje());
    }

    /**
     * Metoda racuna ukupno stanje po svim racunima osobe.
     * @return ukupno stanje.
     */
    private double getUkupnoStanje() {

        double ukupnoStanje = 0;
        for (Racun r : racuni) {
            if (r != null) {
                ukupnoStanje += r.getStanje();
            }
        }
        return ukupnoStanje;
    }

    /**
     * Metoda vraca ukupni iznos dozvoljenog minusa.
     * @return ukupni iznos dozvoljenog minusa.
     */
    public double getDozvoljeniMinus() {

        double ukupno = 0;
        for (Racun r : racuni) {
            if ((r != null) && (r instanceof TekuciRacun)) {
                ukupno += ((TekuciRacun) r).getDozvoljeniMinus();
            }
        }
        return ukupno;
    }

    /**
     * Metoda dodaje racun korisniku.
     * @param rac racun koji treba dodati korisniku.
     * @return true ukoliko je racun uspjesno dodan.
     */
    public boolean addRacun(Racun rac) {

        for (int i = 0; i < racuni.length; i++) {
            if (racuni[i] == null) {
                racuni[i] = rac;
                return true;
            }
        }

        return false;
    }

    /**
     * Metoda brise racun korisniku.
     * @param rac racun koji treba izbrisati korisniku.
     * @return true ukoliko je racun uspjesno izbrisan.
     */
    public boolean removeRacun(Racun rac) {

        for (int i = 0; i < racuni.length; i++) {
            if ((racuni[i] != null) && (racuni[i] == rac)) {
                racuni[i] = null;
                return true;
            }
        }

        return false;
    }
}
