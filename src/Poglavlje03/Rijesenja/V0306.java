/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Vje�ba V0306
 * Napisati program koji ispisuje sumu svih brojeva većih od 5 a manjih od 20
 * koji su djeljivi sa 3.
 */
public class V0306 {

    public static void main(String[] args) {

        int sum = 0;
        for(int i = 5; i <= 20; i++) {
            if(i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Suma brojeva je: " + sum);

    }
}
