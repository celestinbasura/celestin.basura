/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Vje�ba V0206
 * Napisati program koji za zadanu godinu ispisuje poruku da li je ona prestupna
 * ili nije. Koristiti ternarni operator za računanje prijestupne godine.
 * Koristiti if naredbu za kontrolu toka.
 */
public class V0206 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Unesite godinu: ");
        int god = sc.nextInt();

        boolean godinaJePrestupna = (god % 100 == 0) ?
                (god % 400 == 0) : (god % 4 == 0);

        if(godinaJePrestupna) {
            System.out.println("Godina je prijestupna");
        }
        else {
            System.out.println("Godina nije prijestupna");
        }

    }
}