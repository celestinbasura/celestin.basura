/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Vje�ba VB0214
 * Napisati program koji ispisuje kvocijent (rezultat dijeljenja) dva decimalna
 * broja. Napisati provjeru da li je dijeljenje mogu�e (a/b, b ne smije biti
 * nula). �to se dogodi kada dijelimo sa nulom?
 */
public class VB0214 {

    public static void main(String[] args) {

        double a = 7;
        double b = -9;

        if(b != 0) {
            System.out.println("Dijeljnje je: " + a / b);
        }

    }
}
