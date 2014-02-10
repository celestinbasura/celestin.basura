/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Marijan Matic - NetAkademija
 */
package Poglavlje06.Rjesenja;

/**
 * V0504
 * Napisati program koji sa standardnog ulaza (System.in) pomo�u objekta klase
 * Scanner u�itava jedan string (cijelu zadanu liniju, zajedno sa razmacima) i
 * jedan string bez razmaka. Program treba ispisati da li prvi u�itani string
 * ima podstring jednak drugom u�itanom stringu.
 */
import java.util.Scanner;

class V0505 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tekst i potvrdite sa Enter:");
        String s = sc.nextLine();
        System.out.println("Unesite jedan string i potvrdite sa Enter:");
        String p = sc.next();

        int brojac = 0;

        if(s.length() >= p.length()) {
            for(int i = 0; i <= (s.length() - p.length()); i++) {
                String sub = s.substring(i, i + p.length());
                if(sub.equals(p)) {
                    brojac++;
                }
            }
        }

        System.out.printf("U prvom stringu se %d puta pojavljuje drugi string. \n", brojac);

    }
}
