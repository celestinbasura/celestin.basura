/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Vje�ba VB0203
 * Napisati program koji ispisuje rezultat zbroja, razlike, umno�ka i dijeljenja
 * dvije decimalne broj�ane konstante. Obje konstante treba deklarirati i
 * inicijalizirati u istoj naredbi.
 */
public class VB0203 {

    public static void main(String[] args) {

        final double a = 8;
        final double b = 21;

        System.out.println("Zbroj: " + (a + b));
        System.out.println("Razlika: " + (a - b));
        System.out.println("Mnozenje: " + (a * b));
        System.out.println("Dijeljenje: " + (a / b));

    }
}
