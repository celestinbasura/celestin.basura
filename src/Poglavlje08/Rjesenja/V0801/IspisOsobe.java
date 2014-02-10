/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje08.Vjezbe.V0801;

/**
 * Ispisuje instancu klase Osoba
 */
public class IspisOsobe {

    public static void main(String[] args) {

        Osoba os = new Osoba();
        os.setImePrezime("Ivan", "Ivić");
        os.setGodinaRodjenja(1978);

        System.out.println("Ime osobe: " + os.getIme());
        System.out.println("Prezime osobe: " + os.getPrezime());
        System.out.println("Godina rodjenja osobe: " + os.getGodinaRodjenja());

    }
}
