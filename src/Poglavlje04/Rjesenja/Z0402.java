/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje04.Rjesenja;

/**
 * Zadatak Z0402
 * Napisati metodu avgOfSum koja prima jedan cjelobrojni parametar n i jedan
 * decimalni parametar parametar avg. Metoda vra�a true ako je avg srednja
 * vrijednost sume brojeva od 1 do n.
 */
class Z0402 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Unesite n: ");
        int n = sc.nextInt();

        System.out.print("Unesite avg: ");
        double avg = sc.nextInt();

        System.out.print("Rezultat je: ");
        System.out.println(avgOfSum(n, avg));

    }

    static boolean avgOfSum(int n, double avg) {

        double sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        return ((sum / n) == avg);

    }
}
