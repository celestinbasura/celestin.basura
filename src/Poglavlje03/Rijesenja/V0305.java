/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Vje�ba V0305
 * Napisati program koji ispisuje sumu svih brojeva većih od 5 a manjih od 20.
 */
public class V0305 {

    public static void main(String[] args) {

        int i = 5;
        int sum = 0;
        while(i <= 20) {
            sum = sum + i; // ovo mo�emo napisati kao sum += i;
            i++;
        }
        System.out.println("Suma brojeva je: " + sum);

    }
}
