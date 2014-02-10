/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje11.Zadaci.z1102;

import java.util.Arrays;

/**
 * Klasa Korisnik opisuje jednog korisnika. Prirodno sortiranje korisnika
 * se vrši preko njihovih imena i prezimena.
 */
public class Korisnik implements Comparable {

    private String ime, prezime, mbr;

    public Korisnik(String ime, String prezime, String mbr) {
        this.ime = ime;
        this.prezime = prezime;
        this.mbr = mbr;
    }

    /**
     * Korisnike usporedjujemo prvo po prezimenu a ukoliko im je prezime
     * jednako tada po imenu zanemarujuci velika i mala slova.
     *
     * @param o objekt koji usporedjujemo.
     * @return rezultati usporedbe.
     */
    @Override
    public int compareTo(Object o) {

        if(o == null) {
            return 99;
        }

        if(!(o instanceof Korisnik)) {
            return 99;
        }

        Korisnik other = (Korisnik)o;

        if(this.prezime.equalsIgnoreCase(other.prezime)) {
            return this.ime.compareToIgnoreCase(other.ime);
        }

        return this.prezime.compareToIgnoreCase(other.prezime);

    }

    @Override
    public String toString() {
        return String.format("ime:%s, prezime:%s, mbr:%s", ime, prezime, mbr);
    }

    public static void main(String[] args) {

        Korisnik[] korisnici = {
            new Korisnik("marko", "makrić", "223423123"),
            new Korisnik("darko", "dakrić", "423423123"),
            new Korisnik("barko", "bakrić", "523423123"),
            new Korisnik("carko", "cakrić", "823423123"),
            new Korisnik("harko", "hakrić", "723423123"),
            new Korisnik("narko", "nakrić", "123423123"),
            new Korisnik("sarko", "sakrić", "023423123"),
            new Korisnik("karko", "kakrić", "323423123"),
            new Korisnik("jarko", "jakrić", "563423123"),
            new Korisnik("rarko", "rakrić", "723423123")
        };

        System.out.println("Inicijalizirani niz:");
        System.out.println(Arrays.toString(korisnici));

        System.out.println("Sortirani niz:");
        Arrays.sort(korisnici);
        System.out.println(Arrays.toString(korisnici));

    }
}
