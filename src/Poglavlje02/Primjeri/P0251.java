/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0251
 * Primjer aritmetičkih operatora
 */
public class P0251 {

    public static void main(String[] args) {

        int a = 30;
        long b = 40;
        double d = 32.14;
        float f = 12.5f;

        int ostatak = (int)(b % a);

        System.out.println("Ostatak djeljenja " + b + " i " + " a "
                + " je jednak " + ostatak);

        System.out.println("Umnozak brojeva " + d + " i " + f
                + " je jednak " + (d * f));

    }
}