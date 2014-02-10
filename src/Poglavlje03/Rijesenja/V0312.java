/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Vje�ba V0312
 * Napisati program koji ra�una koliko u nekom intervalu ima brojeva djeljivih
 * sa 2,3,4,5,6,7,8,9.
 *
 * Primjer:
 * U intervalu od 9 do 56 ima:
 * 24 brojeva dijeljivih sa 2
 * 16 brojeva dijeljivih sa 3
 * 12 brojeva dijeljivih sa 4
 * 10 brojeva dijeljivih sa 5
 * 8 brojeva dijeljivih sa 6
 * 7 brojeva dijeljivih sa 7
 * 6 brojeva dijeljivih sa 8
 * 6 brojeva dijeljivih sa 9
 */
public class V0312 {

    public static void main(String[] args) {

        final int START = 9;
        final int END = 56;

        int brojac2 = 0;
        int brojac3 = 0;
        int brojac4 = 0;
        int brojac5 = 0;
        int brojac6 = 0;
        int brojac7 = 0;
        int brojac8 = 0;
        int brojac9 = 0;

        for(int broj = START; broj <= END; broj++) {

            if(broj % 2 == 0) {
                brojac2++;
            }
            if(broj % 3 == 0) {
                brojac3++;
            }
            if(broj % 4 == 0) {
                brojac4++;
            }
            if(broj % 5 == 0) {
                brojac5++;
            }
            if(broj % 6 == 0) {
                brojac6++;
            }
            if(broj % 7 == 0) {
                brojac7++;
            }
            if(broj % 8 == 0) {
                brojac8++;
            }
            if(broj % 9 == 0) {
                brojac9++;
            }

        }

        System.out.printf("U intervalu od %d do %d ima:\n"
                + "%d brojeva dijeljivih sa 2 \n"
                + "%d brojeva dijeljivih sa 3 \n"
                + "%d brojeva dijeljivih sa 4 \n"
                + "%d brojeva dijeljivih sa 5 \n"
                + "%d brojeva dijeljivih sa 6 \n"
                + "%d brojeva dijeljivih sa 7 \n"
                + "%d brojeva dijeljivih sa 8 \n"
                + "%d brojeva dijeljivih sa 9 \n",
                START, END, brojac2, brojac3, brojac4, brojac5, brojac6,
                brojac7, brojac8, brojac9);

    }
}