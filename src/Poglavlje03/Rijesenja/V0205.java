/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Vje�ba V0205
 * Napisati program koji za zadanu godinu ispisuje poruku da li je ona
 * prestupna ili nije. Koristiti if naredbu za kontrolu toka.
 *
 * Godina koja je djeljiva s 4, a nije djeljiva sa 100 je prestupna
 * Godina koja je djeljiva s 400 i djeljiva sa 100 je prestupna
 */
public class V0205 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Unesite godinu: ");
        int god = sc.nextInt();

        if(god % 100 == 0) {
            if(god % 400 == 0) {
                System.out.print("Godina je prijestupna");
            }
            else {
                System.out.print("Godina nije prijestupna");
            }
        }
        else {
            if(god % 4 == 0) {
                System.out.print("Godina je prijestupna");
            }
            else {
                System.out.print("Godina nije prijestupna");
            }
        }

    }
}