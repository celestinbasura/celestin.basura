/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Tomislav Novak - NetAkademija
 */
package Poglavlje07.Primjeri;

/**
 * p0742 Vararg vs widening vs Autoboxing
 */
class P0742 {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        metoda(a, b);

    }

    static void metoda(int prvi, int drugi) {
        System.out.println("obično!");
    }
    
    static void metoda(long prvi, long drugi) {
        System.out.println("widenind!");
    }
    static void metoda(Integer a, Integer b) {
        System.out.println("Autoboxing!");
    }

    static void metoda(int... polje) {
        System.out.println("vararg!");
    }
}
