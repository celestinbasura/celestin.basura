/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0422
 * Primjer parametara metode.
 */
class P0422 {

    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        double d = 5.32;

        int z = metodaZbroji(a, b);
        double p = metodaPodijeli(b, d);

        System.out.format("%d + %d = %d \n", a, b, z);
        System.out.format("%.2f / %.2f = %.2f \n", (double)b, d, p);
        System.out.println("Svi su jednaki: " + metodaProvjeriJesuLiSviJednaki(a, b, (int)d));
    }

    static int metodaZbroji(int a, int b) {

        return a + b;
    }

    static double metodaPodijeli(int a, double b) {

        if(b != 0) {
            return a / b;
        }

        return 0;
    }

    static boolean metodaProvjeriJesuLiSviJednaki(int i, int j, int k) {

        return ((i == j) && (i == k) && (j == k));
    }
    
}
