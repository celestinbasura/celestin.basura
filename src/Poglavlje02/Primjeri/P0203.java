/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0203
 * Čitanje sa standardnog ulaza pomoću Scannera
 */
public class P0203 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Unesite jedan cijeli broj: ");
        int in = sc.nextInt();

        System.out.print("Unesite jedan decimalni broj: ");
        double db = sc.nextDouble();

        System.out.print("Unesite jedan boolean: ");
        boolean boo = sc.nextBoolean();

        System.out.printf(" Integer: %d \n Double: %.2f \n Boolean: %b \n ", in, db, boo);
    }
}