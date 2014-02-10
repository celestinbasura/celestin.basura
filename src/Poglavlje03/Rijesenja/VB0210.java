/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Vje�ba VB0210
 * Napisati program koji ispisuje da li je umno�ak dva broja paran ili neparan.
 */
public class VB0210 {

    public static void main(String[] args) {

        double a = 7.22;
        double b = 9.91;

        if((a * b) % 2 == 0) {
            System.out.println("umnozak je paran");
        }
        else {
            System.out.println("umnozak je neparan");
        }

    }
}
