/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Vje�ba V0309
 * Napisati program koji ispisuje da li je zadani broj prost. Cjeli broj ve�i
 * od nule je prost ukoliko je djeljiv samo sa 1 i sa samim sobom,
 * npr: 2, 3, 5, 7, ...
 */
public class V0309 {

    public static void main(String[] args) {

        int broj = 4;
        boolean prost = true;

        if(broj > 0) {
            for(int i = 2; i < broj; i++) {
                if(broj % i == 0) {
                    prost = false;
                }
            }
            System.out.println(prost ? "Broj je prost" : "Broj nije prost");
        }
        else {
            System.out.println("Unesite cijeli broj veći od nule !");
        }

    }
}