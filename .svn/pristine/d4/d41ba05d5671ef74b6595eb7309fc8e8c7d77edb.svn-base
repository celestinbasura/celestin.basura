/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Marijan Matic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Zadatak Z0207
 * Napisati program koji za u�itanu po�etnu i zavr�nu godinu ispisuje koliko je
 * izme�u njih prestupnih godina. Obje su godine uklju�ene u izra�un, ne
 * koristitit polja i petlje.
 */
public class Z0207 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Unesite prvu godinu: ");
        int pocetna = sc.nextInt();
        System.out.print("Unesite zadnju godinu: ");
        int zavrsna = sc.nextInt();

        boolean pocetnaJePrestupna = (pocetna % 100 == 0) ? (pocetna % 400 == 0) : (pocetna % 4 == 0);
        boolean zavrsnaJePrestupna = (zavrsna % 100 == 0) ? (zavrsna % 400 == 0) : (zavrsna % 4 == 0);

        int brojGodina = zavrsna - pocetna + 1;
        int broj4 = ((pocetna % 4) + brojGodina) / 4;
        int broj100 = ((pocetna % 100) + brojGodina) / 100;
        int broj400 = ((pocetna % 400) + brojGodina) / 400;
        int brojPrestupnih = broj4 - broj100 + broj400;

        if(pocetnaJePrestupna && zavrsnaJePrestupna) {
            brojPrestupnih++;
        }

        System.out.println("Broj prestupnih godina: " + brojPrestupnih);

    }
}