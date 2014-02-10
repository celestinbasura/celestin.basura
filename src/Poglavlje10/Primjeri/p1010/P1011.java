/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje10.Primjeri.p1010;


/**
 * Primjer P1011
 * Primjer pozivanja podrazumijevanog konstruktora. Primjetimo kako konstruktor
 * nismo deklarirali u klasi. Java kompajler je sam dodao podrazumjevani
 * konstruktor, onaj koji ne prima niti jedan argument. Svaka klasa mora imati
 * barem jedan konstruktor.
 */
public class P1011 {

    public static void main(String[] args) {

        Klasa11 k1 = new Klasa11();
        System.out.println(k1);

    }
}
class Klasa11 {

    private int atr;

    @Override
    public String toString() {
        return String.format("Objekt atr: %d", atr);
    }

}
