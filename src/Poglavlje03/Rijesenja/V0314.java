/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Vje�ba V0314
 * Napisati program koji ispisuje brojeve od 1 do N pod uvijetom da je njihova
 * suma manja od neke konstantne vrijednosti SUMA_MAX.
 */
public class V0314 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        final int SUMA_MAX = 100;
        System.out.print("Unesite broj kraj intervala: ");
        int N = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= N; i++) {
            sum += i;
            if(sum >= SUMA_MAX) {
                break;
            }
            System.out.print(i + ", ");
        }

    }
}