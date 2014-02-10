/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje06.Rjesenja;

/**
 * V0503
 * Napisati program koji sa standardnog ulaza (System.in) pomo�u objekta klase
 * Scanner u�itava jedan string (cijelu zadanu liniju, zajedno sa razmacima) te
 * ispisuje u�itani string, i koliko u njemu ima samoglasnika.
 */
import java.util.Scanner;

class V0503 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tekst i potvrdite sa Enter:");
        String s = sc.nextLine();

        int brojac = 0;

        for(int i = 0; i < s.length(); i++) {

            switch(s.charAt(i)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                brojac++;
            }
        }

        System.out.format("Tekst: %s \n"
                + "ima %d samoglasnika. \n", s, brojac);

    }
}
