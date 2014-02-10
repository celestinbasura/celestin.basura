/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Vje�ba V0207
 * Napisati program koji sortira 4 broja pohranjena u 4 lokalne varijable.
 * Ne koristiti petlje, ve� samo if naredbe.
 */
public class V0207 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Unesite 1. broj broj: ");
        int broj1 = sc.nextInt();
        System.out.print("Unesite 2. broj broj: ");
        int broj2 = sc.nextInt();
        System.out.print("Unesite 3. broj broj: ");
        int broj3 = sc.nextInt();
        System.out.print("Unesite 4. broj broj: ");
        int broj4 = sc.nextInt();
        int tmp;

        if(broj1 > broj4) {
            tmp = broj1;
            broj1 = broj4;
            broj4 = tmp;
        }
        if(broj2 > broj3) {
            tmp = broj2;
            broj2 = broj3;
            broj3 = tmp;
        }
        if(broj1 > broj2) {
            tmp = broj1;
            broj1 = broj2;
            broj2 = tmp;
        }
        if(broj3 > broj4) {
            tmp = broj3;
            broj3 = broj4;
            broj4 = tmp;
        }
        if(broj2 > broj3) {
            tmp = broj2;
            broj2 = broj3;
            broj3 = tmp;
        }

        System.out.printf("Sort: %d, %d, %d, %d", broj1, broj2, broj3, broj4);

    }
}
