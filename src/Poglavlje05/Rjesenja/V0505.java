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
 * V0505
 * Napisati program koji u�itava jednu liniju teksta sa standardnog ulaza 
 * te u navedenoj liniji zbraja sve Integer vrijednosti i sve Double vrijednosti
 * te ispisuje srednju vrijednost svih Integer vrijednosti te srednju vrijednost
 * svih Double vrijednosti. Cjeline iz ulaznog teksta koje se ne mogu interpretirati
 * kao tipovi Integer ili Double potrebno presko�iti. Za zbrajanje i ra�unanje 
 * srednje vrijednosti pojedinih tipova podataka (Integer i Double) napisati dodatne
 * metode (avgInteger(Scanner sc) i avgDouble(Scanner sc)).
 *
 * @author Tomislav Novak
 * @version 1.0
 */
public class V0505 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite tekst:");
        String str = sc.nextLine();

        Scanner sc1 = new Scanner(str);

        System.out.println("Integer average: " + avgInteger(sc1));

        sc1 = new Scanner(str); //potreban nam je novi objekt klase Scanner koji nije do�ao do kraja ulaznog stringa.

        System.out.println("Double average: " + avgDouble(sc1));
    }

    /**
     * Metoda koja ra�una srednu vrijednost svih cjelina u uaznom bufferu objekta
     * Scanner koji se mogu interpretirati kao cijeli brojevi.
     * 
     * @param sc Ulazni objekt klase Scanner
     * @return srednja vrijednost cijelih brojeva.
     */
    static double avgInteger(Scanner sc) {

        int sumaInt = 0;

        int brInt = 0;

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                sumaInt += sc.nextInt();
                brInt++;
            } else {
                sc.next();
            }
        }
        return ((double) sumaInt / brInt);
    }

    /**
     * Metoda koja ra�una srednu vrijednost svih cjelina u uaznom bufferu objekta
     * Scanner koji se mogu interpretirati kao decimalni brojevi.
     * 
     * @param sc Ulazni objekt klase Scanner
     * @return srednja vrijednost decimlanih brojeva.
     */
    static double avgDouble(Scanner sc) {

        double sumaDouble = 0;

        int brDouble = 0;

        while (sc.hasNext()) {
            if (sc.hasNextInt()) { //zato �to �e ina�e cijele brojeve interpretirati kao double
                sc.nextInt();
            } else if (sc.hasNextDouble()) {
                sumaDouble += sc.nextDouble();
                brDouble++;
            } else {
                sc.next();
            }
        }
        return (sumaDouble / brDouble);
    }
}
