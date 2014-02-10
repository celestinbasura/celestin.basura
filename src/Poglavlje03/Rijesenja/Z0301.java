/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Marijan Matic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Zadatak Z0301
 * Napisati program koji za brojeve X unutar intervala 1..100 koji su djeljivi
 * sa 3 ispisuje samo one �ija je suma od 1 do X ve�a od 30, a manja od 80.
 */
public class Z0301 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Unesite broj X: ");
        int brojX = sc.nextInt();

        int br = 0;
        int suma = 0;

        while(br <= brojX) {
            br++;
            if(br % 3 == 0) {
                suma = suma + br;
                if((suma >= 30) && (suma <= 80)) {
                    System.out.print(br + ", ");
                }
            }
        }

    }
}
