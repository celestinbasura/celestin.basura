/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje08.Primjeri;

import java.util.Arrays;


/**
 * p0811
 * Deklaracija klase i atributa. Deklariranje i inicijaliziranje instance
 * klase je objekt. Dva različita objekta imaju različita stanja i neovisni
 * su jedan od drugog.
 */
class P0811 {

    public static void main(String[] args) {

        Klasa11 objekt1 = new Klasa11();
        Klasa11 objekt2 = new Klasa11();

        System.out.println("Objekt1 : " + objekt1.atributBroj);
        System.out.println("Objekt2 : " + objekt2.atributBroj);

        objekt1.atributBroj = 3;
        objekt2.atributBroj = 7;

        System.out.println("Objekt1 : " + objekt1.atributBroj);
        System.out.println("Objekt2 : " + objekt2.atributBroj);

        objekt1.atributIme = "Marko";
        objekt1.atributPolje[1] = 'e';

        System.out.println("Objekt1 ime: " + objekt1.atributIme);
        System.out.println("Objekt1 polje: " + Arrays.toString(objekt1.atributPolje));

    }
}

class Klasa11 {

    String atributIme = "Ivan";
    int atributBroj = 2;
    char[] atributPolje = new char[]{'a', 'b', 'c'};
}
