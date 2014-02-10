/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Vje�ba V0304
 * Napisati program koji ispisuje sve brojeve djeljive sa 7 u zadanom
 * intervalu od M do N
 */
public class V0304 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Unesite broj pocetak intervala: ");
        int M = sc.nextInt();
        System.out.print("Unesite broj kraj intervala: ");
        int N = sc.nextInt();

        for(int i = M; i <= N; i++) {
            if(i % 7 == 0) {
                System.out.print(i + ", ");
            }
        }

    }
}