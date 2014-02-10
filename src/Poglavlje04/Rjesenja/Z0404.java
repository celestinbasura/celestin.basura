/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje04.Rjesenja;

/**
 * Zadatak Z0404
 * Napisati program koji pomo�u rekurzivne metode ra�una vrijednost sume
 * brojeva od 1 do n.
 */
class Z0404 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Unesite zanji broj: ");
        int n = sc.nextInt();

        System.out.println("Suma brojeva je: " + sumaRek(n));

    }

    static int sumaRek(int n) {

        if(n == 1) {
            return 1;
        }
        return (n + sumaRek(n - 1));

    }
}
