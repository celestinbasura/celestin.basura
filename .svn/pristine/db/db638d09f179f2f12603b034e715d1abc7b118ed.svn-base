/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Vje�ba V0313
 * Program koji pronalazi zajedni�ke faktore dva cijela broja ve�a od 0.
 * Faktori su samo prosti  brojevi koji pomno�eni daju broj koji rastavljamo.
 *
 * Primjer:
 * a = 330, 330 = 2 * 3 * 5 * 11
 * b = 462, 462 = 2 * 3 * 7 * 11
 * zajednicki faktori broja 330 i 462 su 2, 3 i 11
 */
public class V0313 {

    public static void main(String[] args) {

        int a = 330;
        int b = 462;

        for(int i = 2; i < a; i++) {

            boolean prost = true;
            for(int j = 2; j < (i / 2); j++) {
                if(i % j == 0) {
                    prost = false;
                    break;
                }
            }

            if((a % i == 0) && (b % i == 0) && (prost)) {
                System.out.println(i);
            }
        }

    }
}
