/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright Tomislav Novak @ NetAkademija
 */
package Poglavlje06.Rjesenja;

import java.util.Scanner;

/**
 * Z0602 Napisati program (interpreter) koji računa zadani matematički izraz,
 * npr. 2 + 5 ili 5.6 * 7.12. Program mora izvršavati računske operacije
 * zbrajanja, oduzimanja, množenja i dijeljenja sa decimalnom brojevima. Ukoliko
 * uneseni izraz ne može biti matematički interpretiran, npr. 5plus3 (niz znakova),
 * itd. program mora ispisati "Krivi izraz".
 * Program radi sve dok korisnik ne unese niz znakova "exit". 
 * Program podržava operator % koji vrača rezultat cijelobrojnog dijeljenja i ostatak
 * cjelobrojnog dijeljenja.
 *
 * @author Tomislav Novak
 */
public class Z0604 {

    public static void main(String[] args) {

        Scanner tipkovnica = new Scanner(System.in);
        String ulaz;

        System.out.println("Unesite izraz: ");

        while (!(ulaz = tipkovnica.nextLine()).equalsIgnoreCase("exit")) { //učitavanje linije sa tipkovnice dok ona ne odgovara stringu "exit".

            ulaz = ulaz.replaceAll("[\\+\\-\\*\\/\\%]", " $0 ");//korištenje regularnih izraza

            if (legalanIzraz(ulaz)) {
                switch (operator(ulaz)) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        System.out.println("Rezultat:" + parsing(ulaz));
                        break;
                    case "%":
                        if (legalanModulo(ulaz)) { //potrebna je posebna provjera da li su operandi cijeli brojevi
                            System.out.println("Ostatak:" + (int)parsing(ulaz));
                            /*
                             * U sljedećoj liniji zamijenjujemo operator % sa / kako 
                             * bismo pozvali postojeću metodu parsing() 
                             * koja će u ovom slučaju izračunati rezultat dijeljenja.
                             */
                            ulaz = ulaz.replace('%', '/');  
                            System.out.println("Rezultat dijeljenja:" + (int)parsing(ulaz));
                        } else {
                            System.out.println("Parametri za cjelobrojno dijeljenje moraju biti cijeli brojevi!");
                        }
                        break;
                }
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
        double broj2;
        double rezultat = 0;
        String operator = operator(izraz);

        broj1 = racunanje.nextDouble();
        racunanje.next();
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
            case "%":
                rezultat = broj1 % broj2;
                break;
        }
        return rezultat;
    }

    /**
     * Metoda koja vraća operator korišten u ulaznom izrazu.
     *
     * @param izraz Ulazni izraz.
     * @return Operator.
     */
    static String operator(String izraz) {

        Scanner sc = new Scanner(izraz);
        sc.nextDouble();
        return sc.next();

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
            case "%":
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

    /**
     * Metoda koja provjerava da li je izraz legalan za računanje cjelobrojnog ostatka.
     * 
     * @param izraz Izraz koji se provjerava.
     * @return True ako je izraz legalan, false inače.
     */
    static boolean legalanModulo(String izraz) {

        Scanner parser = new Scanner(izraz);

        if (parser.hasNextInt()) { //da li je prvi cijeli broj?
            parser.nextInt();
        } else {
            return false;
        }

        parser.next(); //počitati operator

        if (parser.hasNextInt()) {//da li je drugi cijeli broj?
            parser.nextInt();
        } else {
            return false;
        }

        return true;
    }
}
