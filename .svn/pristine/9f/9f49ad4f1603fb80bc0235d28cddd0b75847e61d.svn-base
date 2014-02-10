/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje10.Primjeri.p1040;


/**
 * Primjer P1041
 * Razlika između metoda i konstruktora: konstruktor nema povratni tip.
 * Ime metode i potpis mogu biti isti kao ime i potpis konstruktora.
 */
public class P1041 {

    public static void main(String[] args) {

        Klasa41 k1 = new Klasa41();
        Klasa41 k2 = k1.Klasa41();

        System.out.println("k1: " + k1);
        System.out.println("k2: " + k2);

    }
}
class Klasa41 {

    public int atr;

    public Klasa41() {
        atr = 5;
    }

    public Klasa41 Klasa41() {
        return this;
    }
}
