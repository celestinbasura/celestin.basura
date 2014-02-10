/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Vje�ba V0311
 * Napisati program koji ispisuje koliko ima prostih brojeva u zadanom
 * intervalu od MIN_N do MAX_N i ispisuje ih. MIN_N i MAX_N su cjelobrojne
 * konstante koje unosi korisnik.
 */
public class V0311 {

    public static void main(String[] args) {

        final int START = 9;
        final int END = 56;

        int brojac = 0;
        boolean prost;
        String s = "";

        for(int broj = START; broj <= END; broj++) {
            prost = true;
            for(int i = 2; i < broj; i++) {
                if(broj % i == 0) {
                    prost = false;
                }
            }
            if(prost) {
                brojac++;
                s = s + broj + ", ";
            }
        }

        System.out.printf("U intervalu od %d do %d ima %d prostih brojeva: \n "
                + "Brojevi: %s \n", START, END, brojac, s);

    }
}