/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Vje�ba V0316
 * Napisati program koji za ulazni cijeli broj ispisuje trokutaski uzorak
 *
 * Primjer: za broj 5 program ispis:
 *
 *     *****
 *     .****
 *     ..***
 *     ...**
 *     ....*
 */
public class V0316 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Unesite velicinu trokuta: ");
        int trokut = sc.nextInt();

        for(int i = 0; i < trokut; i++) {
            for(int j = 0; j < trokut; j++) {
                if(j < i) {
                    System.out.print(".");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
