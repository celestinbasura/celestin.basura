/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0264
 * Promocija u najveći tip unutar constant izraza
 */
public class P0264 {

    public static void main(String[] args) {

        int a = 85;
        float b = 55.2F;
        double c = 42.7;

        double d = (a + b + c);

        System.out.println("Vrijednost a: " + (a));
        System.out.println("Vrijednost b: " + (b));
        System.out.println("Vrijednost c: " + (c));
        System.out.println("Vrijednost d: " + (d));

    }
}