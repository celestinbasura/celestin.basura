/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Marijan Matic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * zadatak Z0305
 * Napisati program koji ispisuje tablicu mno�enja kako je prikazano u primjeru.
 * Unosi se po�etni i zavr�ni faktor u rasponu 1..10.
 *
 * Primjer:
 *
 * 	   |03  04  05  06  07  08
 *	---+---+---+---+---+---+---+
 *	03 |09  12  15  18  21  24
 *	04 |12  16  20  24  ...
 *	   .
 *	   .
 *	   .
 *
 */
public class Z0305 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Unesite prvi faktor: ");
        int prvi = sc.nextInt();
        System.out.print("Unesite zadnji faktor: ");
        int zadnji = sc.nextInt();

        System.out.printf("   |");
        for(int i = prvi; i <= zadnji; i++) {
            System.out.printf("%02d  ", i);
        }
        System.out.printf("\n");

        System.out.printf("---+");
        for(int i = prvi; i <= zadnji; i++) {
            System.out.printf("---+");
        }
        System.out.printf("\n");

        for(int i = prvi; i <= zadnji; i++) {
            System.out.printf("%02d |", i);
            for(int j = prvi; j <= zadnji; j++) {
                System.out.printf("%02d  ", i * j);
            }
            System.out.printf("\n");
        }

    }
}
