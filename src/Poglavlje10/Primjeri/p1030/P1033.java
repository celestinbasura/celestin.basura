/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje10.Primjeri.p1030;


/**
 * Primjer P1033
 * Primjer redosljeda izvršavanja inicijalizacijskih blokova prilikom
 * konstruiranja objekta.
 */
public class P1033 {

    public static void main(String[] args) {

        System.out.println(Klasa33.KONST);

        Klasa33 k1 = new Klasa33();
        System.out.println("-----");
        Klasa33 k2 = new Klasa33();

    }
}
class Klasa33 extends Klasa33super {

    public static final int KONST;

    static {
        KONST = 22;
        System.out.println("statički inicijalizacijski blok klase");
    }

    {
        System.out.println("inicijalizacijski blok klase");
    }

    public Klasa33() {
        super();
        System.out.println("konstruktor klase");
    }
}

class Klasa33super {

    static {
        System.out.println("statički inicijalizacijski blok superklase");
    }

    {
        System.out.println("inicijalizacijski blok superklase");
    }

    public Klasa33super() {
        System.out.println("konstruktor superklase");
    }
}