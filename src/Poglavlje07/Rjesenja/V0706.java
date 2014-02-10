/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje07.Rjesenja;

/**
 * vježba v0606
 * Napisati program u u Javi koji ispisuje sadržaj svih članova nekog
 * dvodimenzionalnog polja koristeći for-each petlju.
 */
public class V0706 {

    public static void main(String[] args) {

        int[][] polje2D = {{4, 6, 2, 3, 9, 7},
            {2, 6, 9, 2},
            {3, 9, 2, 3, 5, 1, 9},
            {8, 3, 9},
            {1, 4, 2, 9, 6}};

        for (int[] is : polje2D) {
            for (int i : is) {
                
            }
        }
        
        for(int[] polje1D : polje2D) {
            System.out.print("[ ");
            for(int element : polje1D) {
                System.out.print(element + " ");
            }
            System.out.println("]");
        }

    }
}
