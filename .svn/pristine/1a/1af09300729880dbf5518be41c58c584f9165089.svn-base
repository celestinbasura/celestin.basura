/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje06.Rjesenja;

/**
 * V0504
 * Napisati program koji sa standardnog ulaza (System.in) pomo�u objekta klase
 * Scanner u�itava jedan string (cijelu zadanu liniju, zajedno sa razmacima) te
 * ispisuje u�itani string, i broj pojavljivanja svakog slova.
 * Napomena: ispisati pojavljivanja samo malih slova 'a' do 'z'.
 */
import java.util.Scanner;

class V0504 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tekst i potvrdite sa Enter:");
        String s = sc.nextLine();


        for(char c = 'a'; c <= 'z'; c++) {
            int brojac = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == c) {
                    brojac++;
                }
            }
            if(brojac > 0) {
                System.out.format("Slovo %c : %d \n", c, brojac);
            }
        }

    }
}
