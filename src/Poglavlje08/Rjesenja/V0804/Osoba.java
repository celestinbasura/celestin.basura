/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje08.Vjezbe.V0804;

/**
 * Klasa opisuje jednu osobu.
 */
public class Osoba {

    private String ime;
    private String prezime;
    private int godinaRodjenja;

    /**
     * Metoda vraća godinu rođenja osobe.
     *
     * @return vrijednost godine rođenja osobe.
     */
    public int getGodinaRodjenja() {

        return godinaRodjenja;
    }

    /**
     * Metoda postavlja godinu rođenja osobi.
     *
     * @param novaGodina vrijednost koju postavljamo atributu godinaRodjenja.
     */
    public void setGodinaRodjenja(int novaGodina) {

        this.godinaRodjenja = novaGodina;
    }

    /**
     * Metoda vraća ime osobe.
     *
     * @return vrijednost imena osobe.
     */
    public String getIme() {

        return ime;
    }

    /**
     * Metoda vraća prezime osobe.
     *
     * @return vrijednost prezimena osobe.
     */
    public String getPrezime() {

        return prezime;
    }

    /**
     * Metoda postavlja ime i prezime osobi.
     *
     * @param novoIme vrijednost imena.
     * @param novoPrezime vrijednost prezimena.
     */
    public void setImePrezime(String novoIme, String novoPrezime) {

        this.ime = novoIme;
        this.prezime = novoPrezime;
    }

    /**
     * Metoda vraća string za ispis.
     *
     * @return string za ispis.
     */
    public String stanje() {

        return "Ime: " + ime + ", Prezime: " + prezime + ", Godina: "
                + godinaRodjenja + ".";
    }

    /**
     * Meoda provjerava da li je osoba bila punoljetna u zadanoj godini.
     *
     * @param trenutnaGodina godina za koju provjeravamo.
     * @return true ukoliko je osoba bila punoljetna.
     */
    public boolean isPunoljetan(int trenutnaGodina) {

        return (18 < (trenutnaGodina - godinaRodjenja));
    }
}
