/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Vje�ba VB0211
 * Napisati program koji ispisuje koji od tri zadana broja je najve�i a koji
 * najmanji.
 */
public class VB0211 {

    public static void main(String[] args) {

        double a = 7.54;
        double b = 9.73;
        double c = 12.4;

        if((a >= b) && (a >= c)) {
            System.out.println("a je najveci");
        }
        if((a <= b) && (a <= c)) {
            System.out.println("a je najmanji");
        }

        if((c >= b) && (c >= a)) {
            System.out.println("c je najveci");
        }
        if((c <= b) && (c <= a)) {
            System.out.println("c je najmanji");
        }

        if((b >= a) && (b >= c)) {
            System.out.println("b je najveci");
        }
        if((b <= a) && (b <= c)) {
            System.out.println("b je najmanji");
        }

    }
}
