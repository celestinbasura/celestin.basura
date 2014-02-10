/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Vje�ba VB0212
 * Napisati program koji ispisuje koji od �etiri zadana broja je najve�i a koji
 * najmanji.
 */
public class VB0212 {

    public static void main(String[] args) {

        long a = 7;
        long b = 9;
        long c = 12;
        long d = 10;

        if((a >= b) && (a >= c) && (a >= d)) {
            System.out.println("a je najveci");
        }
        if((a <= b) && (a <= c) && (a <= d)) {
            System.out.println("a je najmanji");
        }

        if((c >= b) && (c >= a) && (c >= d)) {
            System.out.println("c je najveci");
        }
        if((c <= b) && (c <= a) && (c <= d)) {
            System.out.println("c je najmanji");
        }

        if((b >= a) && (b >= c) && (b >= d)) {
            System.out.println("b je najveci");
        }
        if((b <= a) && (b <= c) && (b <= d)) {
            System.out.println("b je najmanji");
        }

        if((d >= a) && (d >= b) && (d >= c)) {
            System.out.println("d je najveci");
        }
        if((d <= a) && (d <= d) && (d <= c)) {
            System.out.println("d je najmanji");
        }

    }
}
