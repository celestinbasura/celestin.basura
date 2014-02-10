/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje07.Rjesenja;

/**
 * vježba vb0603
 * Napisati program koji ispisuje sve elemente polja integera duljine 10.
 * Potrebno je deklarirati i inicijalizirati polje, te pomoću petlje u polje
 * pospremiti slučajno generirane brojeve između 1 i 100 pomoću funkcije
 * Math.random(). Pokušati ispisati elemente pomoću for each petlje.
 */
public class VB0703 {

    public static void main(String[] args) {

        int[] polje = new int[10];
        for(int i = 0; i < polje.length; i++) {
            polje[i] = (int)(Math.random() * 100 + 1);
        }

        System.out.print("[");

        for (int i : polje) {
            System.out.print(i + " ");
        }
        System.out.print("]");

    }
}
