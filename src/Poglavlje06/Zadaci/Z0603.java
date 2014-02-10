/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright Tomislav Novak @ NetAkademija
 */
package Poglavlje06.Zadaci;

import java.util.Scanner;

/**
 * Z0602 Napisati program (interpreter) koji računa zadani matematički izraz,
 * npr. 2 + 5 ili 5.6 * 7.12. Program mora izvršavati računske operacije
 * zbrajanja, oduzimanja, množenja i dijeljenja sa decimalnom brojevima. Ukoliko
 * uneseni izraz ne može biti matematički interpretiran npr. 5plus3 (niz znakova),
 * itd. program mora ispisati "Krivi izraz".
 * Program podržava izraze oblika 1+ 2, 1+2 , 1 * 2, 1  +2, itd. * 
 * Program radi sve dok korisnik ne unese niz znakova "exit".
 *
 * @author Tomislav Novak
 */
public class Z0603 {

    public static void main(String[] args) {

        Scanner tipkovnica = new Scanner(System.in);
        String ulaz;
        double rezultat;

        System.out.println("Unesite izraz: ");

        while (!(ulaz = tipkovnica.nextLine()).equalsIgnoreCase("exit")) {
            ulaz = ulaz.replaceAll("[\\+\\-\\*\\/]{1}", " $0 ");//korištenje regularnih izraza

            if (legalanIzraz(ulaz)) {
                System.out.println("Rezultat:" + parsing(ulaz));
            } else {
                System.out.println("Ulaz se ne može parsirati kao izraz!");
            }
        }
    }

    /**
     * Metoda koja računa izraz koji predstavlja rečunsku operaciju dva broja.
     * Izraz se dobije kao String.
     *
     * @param izraz String koji predstavlja računsku operaciju.
     * @return Vraća rezultat računske operacije koju predstavlja ulazni string.
     */
    static double parsing(String izraz) {

        Scanner racunanje = new Scanner(izraz);
        double broj1;
        String operator;
        double broj2;
        double rezultat = 0;

        broj1 = racunanje.nextDouble();
        operator = racunanje.next();
        broj2 = racunanje.nextDouble();

        switch (operator) {
            case "+":
                rezultat = broj1 + broj2;
                break;
            case "-":
                rezultat = broj1 - broj2;
                break;
            case "*":
                rezultat = broj1 * broj2;
                break;
            case "/":
                rezultat = broj1 / broj2;
                break;
        }
        return rezultat;
    }

    /**
     * Metoda provjerava da li se izraz može interpretirati kao računska
     * operacija dva broja. Npr. "1 + 2" ili "2 / 3", itd.
     *
     * @param izraz Izraz koji se prvijerava.
     * @return True ako se izraz može parsirati, false inače.
     */
    static boolean legalanIzraz(String izraz) {
        Scanner parser = new Scanner(izraz);

        if (parser.hasNextDouble()) {
            parser.nextDouble();
        } else {
            return false;
        }
        switch (parser.next()) {
            case "+":
            case "-":
            case "*":
            case "/":
                break;
            default:
                return false;
        }

        if (parser.hasNextDouble()) {
            parser.nextDouble();
        } else {
            return false;
        }

        return true;
    }
}
