/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Marijan Matic - NetAkademija
 */
package Poglavlje04.Rjesenja;

/**
 * Zadatak Z0406
 * Napisati program koji za neparni cijeli broj ispisuje uzorak romba.
 * Implementirati metodu koja prima jedan cjelobrojni parametar i ispisuje
 * zadani obrazac na konzolu. Cjeloborojni parametar mora biti neparan broj,
 * u protivnom program ispisuje gre�ku.
 *
 * Primjer romba za zadani parametar 7:
 * ...*...
 * ..***..
 * .*****.
 * *******
 * .*****.
 * ..***..
 * ...*...
 */
class Z0406 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Unesite velicinu: ");
        printRomb(sc.nextInt());

    }

    static void printRomb(int velicina) {

        if(velicina < 0 || velicina % 2 == 0) {
            System.out.println("Parametar mora biti neparan broj veci od nule!");
            return;
        }
        for(int red = 1; red <= (velicina + 1) / 2; red++) {
            printRed(red, velicina);
        }
        for(int red = velicina / 2; red >= 1; red--) {
            printRed(red, velicina);
        }

    }

    static void printRed(int red, int velicina) {

        int brZvjezica = red * 2 - 1;
        int brTockicaSaJedneStrane = (velicina - brZvjezica) / 2;

        for(int i = 0; i < brTockicaSaJedneStrane; i++) {
            System.out.print('.');
        }
        for(int i = 0; i < brZvjezica; i++) {
            System.out.print('*');
        }
        for(int i = 0; i < brTockicaSaJedneStrane; i++) {
            System.out.print('.');
        }
        System.out.println();

    }
}
