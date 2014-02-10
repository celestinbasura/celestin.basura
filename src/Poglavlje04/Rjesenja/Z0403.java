/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje04.Rjesenja;

/**
 * Zadatak Z0403
 * Napisati metode srednjaVrijednost za slijedeću kombinaciju parametara:
 * short, short         -> short
 * short, short, short  -> short
 * float, float         -> float
 * float, float, float  -> float
 *
 * Primjer:
 * a = 10;
 * b = 20;
 * c = 25;
 * srednjaVrijednost(a, b)     == 15
 * srednjaVrijednost(a, b, c)  == 18
 */
class Z0403 {

    public static void main(String[] args) {

        short sa = 7;
        short sb = 3;
        short sc = 12;
        float fa = 3.4F;
        float fb = 8.54F;
        float fc = 2.6F;

        System.out.println("sr.vrijednost dvije var short: "
                + srednjaVrijednost(sa, sb));
        System.out.println("sr.vrijednost tri var short: "
                + srednjaVrijednost(sa, sb, sc));
        System.out.println("sr.vrijednost dvije var float: "
                + srednjaVrijednost(fa, fb));
        System.out.println("sr.vrijednost tri var float: "
                + srednjaVrijednost(fa, fb, fc));

    }

    static short srednjaVrijednost(short a, short b) {
        return (short)((a + b) / 2);
    }

    static short srednjaVrijednost(short a, short b, short c) {
        return (short)((a + b + c) / 3);
    }

    static float srednjaVrijednost(float a, float b) {
        return (float)((a + b) / 2.);
    }

    static float srednjaVrijednost(float a, float b, float c) {
        return (float)((a + b + c) / 3.);
    }
}
