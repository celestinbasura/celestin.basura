/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Marijan Matic - NetAkademija
 */
package Poglavlje04.Rjesenja;

/**
 * Zadatak Z0405
 * Usporediti brzinu izra�una fiboneccijevog niza kori�tenjem petlje i
 * rekurzivne metode. koristiti zadanu main metodu.
 *
 * !! PRILO�ITI MAIN METODU !!
 *
 * Formula za izra�un niza je slijede�a:
 * F(n) = 0, ako je n = 0
 * F(n) = 1, ako je n = 1
 * F(n) = F(n-1) + F(n-2), ako je n > 1
 *
 * Primjer niza fibonnacijevih brojeva: F(7): 1, 1, 2, 3, 5, 8, 13
 */
class Z0405 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Unesite zadnji element niza: ");
        int n = sc.nextInt();


        System.out.println("Fibonacci petlja:");
        long start = System.currentTimeMillis();
        System.out.printf("F(%d) = %d \n", n, fibPetlja(n));
        System.out.printf("Trajanje: %d \n", System.currentTimeMillis() - start);


        System.out.println("Fibonacci rekurzija:");
        start = System.currentTimeMillis();
        System.out.printf("F(%d) = %d \n", n, fibRek(n));
        System.out.printf("Trajanje: %d \n", System.currentTimeMillis() - start);

    }

    static int fibPetlja(int n) {

        int F0 = 0;
        int F1 = 1;
        int Fn = 1;

        for(int i = 2; i <= n; i++) {
            Fn = F1 + F0;
            F0 = F1;
            F1 = Fn;
        }

        return Fn;

    }

    static int fibRek(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return (fibRek(n - 1) + fibRek(n - 2));
    }
}
