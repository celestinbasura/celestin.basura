/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje07.Primjeri;

/**
 * p0613
 * Ispisivanje elemenata polja
 */
class P0713 {

    public static void main(String[] args) {

        int[] polje = new int[]{2, 4, 6, 8};
        int[] polje1 = new int[4];        

        System.out.println("Polje: " + polje);
        System.out.println("Elementi polja: ");
        elementiPolja(polje);

    }

    private static void elementiPolja(int[] p) {

        for(int i = 0; i < p.length; i++) {
            System.out.print(p[i] + ", ");
        }

    }
}
