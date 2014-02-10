/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * vježba V0208
 * Napisati program koji za zadani broj kalendarskog mjeseca (1 .. 12 ) ispisuje
 * odgovarajući naziv istog. Broj mjeseca učitati sa konzole kao cjelobrojnu
 * vrijednost. Koristiti switch case naredbu.
 */
public class V0208 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Unesite mjesec: ");
        int mj = sc.nextInt();

        switch(mj) {
        case 1:
            System.out.println("Sijecanj");
            break;
        case 2:
            System.out.println("Veljaca");
            break;
        case 3:
            System.out.println("Ožujak");
            break;
        case 4:
            System.out.println("Travanj");
            break;
        case 5:
            System.out.println("Svibanj");
            break;
        case 6:
            System.out.println("Lipanj");
            break;
        case 7:
            System.out.println("Srpanj");
            break;
        case 8:
            System.out.println("Kolovoz");
            break;
        case 9:
            System.out.println("Rujan");
            break;
        case 10:
            System.out.println("Listopad");
            break;
        case 11:
            System.out.println("Studeni");
            break;
        case 12:
            System.out.println("Prosinac");
            break;
        default:
            System.out.println("Nema takvog mjeseca u godini.");
            break;
        }

    }
}