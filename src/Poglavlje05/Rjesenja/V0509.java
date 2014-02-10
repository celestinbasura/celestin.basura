/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Tomislav Novak - NetAkademija
 */
package Poglavlje05.Rjesenja;

import java.util.Scanner;

/**
 * V0509
 * Napisati program koji tra�i od korisnika da unese tekst i potvrdi unos sa enterom.
 * Program mora sadr�avati metodu koja broji koliko je uneseno brojeva u tekstu 
 * bilo kojeg primitivnog numeri�kog tipa (byte, short, int, itd.).
 * (Napomena: koristiti objekte Scanner). 
 *
 * @author Tomislav Novak
 * @version 1.0
 */
public class V0509 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite tekst:");
        String str = sc.nextLine();

        Scanner sc1;

        sc1 = new Scanner(str);

        System.out.println("Brojeva ima: " + countNumbers(sc1));
    }

    /**
     * Metoda koja broji koliko ima brojeva u stringu koji ulazni objekt klase
     * Scanner �ita.
     * 
     * @param sc Objekt klase Scanner.
     * @return Broj brojeva u stringu.
     */
    static int countNumbers(Scanner sc) {

        int count = 0;

        while (sc.hasNext()) {
            if (sc.hasNextDouble()) { //zato jer �e se svi brojevi mo�i interpretirati kao double
                count++;
            }
            sc.next();
        }
        return count;
    }
}
