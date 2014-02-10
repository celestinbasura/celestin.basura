/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje13.Primjeri.p1320;

/**
 * Primjer p1221
 * Primjer kreiranja i bacanaj iznimke. Iznimka je objekt. Iznimku koju
 * moramo uhvatiti (catched exception) možemo obraditi na dva načina:
 * - Iznimka se hvata koristeći try/catch/finally blokove
 * - Iznimka se proslijeđuje dalje u stogu
 */
class p1321 {

    public static void main(String[] args) {

        try {
            new p1321().metodaBacaIznimku();
        }
        catch(MojException ex) {
            System.err.println("Dogodila se iznimka !");
            System.err.println("Klasa iznimke: " + ex.getClass().toString());
            System.err.println("Poruka iznimke: " + ex.getMessage());
        }

    }

    /**
     * U ovoj metodi dolazi do bacanja iznimke. Ova metoda ne obrađuje
     * iznimku već ju proslijeđuje dalje.
     *
     * Slučaj u kojem postoji mogućnost da se dogodi iznimka mora biti
     * detaljno opisana.
     *
     * @throws MojException opis slučaja kada se događa iznimka.
     */
    public void metodaBacaIznimku() throws MojException {

        MojException ex = new MojException("Poruka iznimke");
        throw ex;

    }
}
