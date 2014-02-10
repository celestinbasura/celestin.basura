/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0421 Primjer parametara metode.
 */
class P0421 {

    public static void main(String[] args) {

        int zbroj1 = metodaZbroji(5, 7);

        int a = 5;
        int b = 7;
        int zbroj2 = metodaZbroji(a, b);
    }

    static int metodaZbroji(int i, int j) {

        return i + j;
    }
}
