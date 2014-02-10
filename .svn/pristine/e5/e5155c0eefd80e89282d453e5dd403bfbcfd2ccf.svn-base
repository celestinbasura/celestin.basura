/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje07.Rjesenja;

import java.util.Arrays;

/**
 * vježba v0607
 * Napisati program u Javi koju ispisuje sumu redaka i sumu stupaca za zadanu
 * matricu. Potrebno je putem argumenata metode main pročitati dimenzije
 * matrice (n x m), zatim sve elemente te matrice. Implementirati metode double
 * sumRow i sumCol koje računaju sumu zadanog retka/stupca matrice te vraćaju
 * rezultat u glavni program. Koristiti pomoćne metode klase java.lang.Double
 * za koverziju podataka. Koristiti metodu deepToString klase java.util.Arrays
 * za ispis matrice.
 *
 * Primjer:	C:\>java SumaMatrice 2 3 1. 2. 3. 4. 5. 6.
 * Matrica:[[1.0, 2.0, 3.0], [4.0, 5.0, 6.0]]
 *
 * Suma 1. retka je: 6.0
 * Suma 2. retka je: 15.0
 *
 * Suma 1. stupca je: 5.0
 * Suma 2. stupca je: 7.0
 * Suma 3. stupca je: 9.0
 */
public class V0707 {

    public static void main(String[] args) {

        int brojPolja = Integer.parseInt(args[0]);
        int brojElemenata = Integer.parseInt(args[1]);

        double[][] matrica = new double[brojPolja][brojElemenata];
        int element = 2;
        for(int i = 0; i < matrica.length; i++) {
            for(int j = 0; j < matrica[i].length; j++) {
                matrica[i][j] = Double.parseDouble(args[element]);
                element++;
            }
        }

        System.out.println("Matrica: " + Arrays.deepToString(matrica));

        for(int i = 0; i < matrica.length; i++) {
            System.out.println("Suma " + (i + 1) + ". retka je: "
                    + sumRow(matrica, i));
        }

        for(int i = 0; i < matrica[0].length; i++) {
            System.out.println("Suma " + (i + 1) + ". stupca je: "
                    + sumCol(matrica, i));
        }

    }

    static double sumRow(double[][] matrix, int row) {

        double sum = 0;
        for(int i = 0; i < matrix[row].length; i++) {
            sum += matrix[row][i];
        }
        return sum;

    }

    static double sumCol(double[][] matrix, int col) {

        double sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            sum += matrix[i][col];
        }
        return sum;

    }
}
