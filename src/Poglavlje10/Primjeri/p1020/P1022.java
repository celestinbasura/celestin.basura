/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje10.Primjeri.p1020;


/**
 * Primjer P1022
 * Primjer ovlerloadanja konstruktora, pozivanje drugog konstruktora.
 */
public class P1022 {

    public static void main(String[] args) {

        Klasa22 k1 = new Klasa22();
        Klasa22 k2 = new Klasa22(43);
        Klasa22 k3 = new Klasa22(58, "Neki drugi string");

        System.out.println("k1: " + k1);
        System.out.println("k2: " + k2);
        System.out.println("k3: " + k3);

    }
}
class Klasa22 {

    public int KONST;
    private int atr1;
    private String atr2;
    private int[] polje = new int[10000];
    {
        for (int i = 0; i < 10; i++) {
            polje[i] =  i;
        }
    }
    public Klasa22() {
        KONST = 22;
    }

    public Klasa22(int atr1) {
        this();
        this.atr1 = atr1;
    }

    public Klasa22(int atr1, String atr2) {
        this(atr1);
        this.atr2 = atr2;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, KONST: %d",
                atr1, atr2, KONST);
    }
}
