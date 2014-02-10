/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0423
 * Primjer call-by-value pri pozivu metode. Java nema call-by reference poziv.
 *
 * Problem: Zelimo promijeniti vrijednost varijable koju proslijedjujemo kao
 * parametar unutar metode.
 */
class P0423 {

    public static void main(String[] args) {

        int a = 3;

        System.out.println("program: parametar koji dajemo: " + a);
        metodaCall(a);
        System.out.println("program: parametar koji smo dali: " + a);
    }

    static void metodaCall(int a) {

        System.out.println("metoda: parametar koji smo dobili: " + a);
        a = a + 3;
        System.out.println("metoda: parametar nakon povećanja: " + a);
    }
}
