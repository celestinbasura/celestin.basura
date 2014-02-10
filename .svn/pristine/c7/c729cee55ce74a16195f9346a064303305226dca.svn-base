/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje10.Primjeri.p1030;


/**
 * Primjer P1031
 * Primjer inicijalizacijskog bloka instance.
 */
public class P1031 {

    public static void main(String[] args) {

        Klasa31 k1 = new Klasa31(7, "Neki string");
        System.out.printf("k1: %s\n", k1);

    }
}
class Klasa31 {

    public final int KONST;
    private int atr1;
    private String atr2;
    int[] polje = new int[1000];
    
    
    {
        KONST = 235;
        for(int i = 0;i < 1;){}
    }

    public Klasa31(int a1, String a2) {
        atr1 = a1;
        atr2 = a2;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, KONST: %d", atr1, atr2, KONST);
    }
}