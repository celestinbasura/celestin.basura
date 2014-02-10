/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje07.Rjesenja;

import java.util.Scanner;

/**
 * vježba v0603
 * Napisati program putem ulaznih parametara čita rečenice i za svaku od njih
 * ispisuje koliko ima riječi.
 * - Korištenjem metode split() klase String
 * - Korištenjem metode next() klase Scanner
 *
 * Primjer:
 * c:\>java BrojeanjeRijeci "Danas je lijep dan" "Sutra se budimo"
 * Rečenica: "Danas je lijep dan" - 4 riječi.
 * Rečenica: "Sutra se budimo" - 3 riječi.
 */
public class V0703 {

    public static void main(String[] args) {

        for(int i = 0; i < args.length; i++) {
            System.out.println("Recenica: '" + args[i] + "' ima "
                    + impNext(args[i]) + " rijeci (split)");
            System.out.println("Recenica: '" + args[i] + "' ima "
                    + impNext(args[i]) + " rijeci (next)");
        }

    }

    static int impSplit(String s) {

        String[] rijeci = s.split(" ");
        return rijeci.length;

    }

    static int impNext(String s) {

        Scanner sc = new Scanner(s);

        int br = 0;
        while(sc.hasNext()) {
            br++;
            sc.next();
        }

        return br;

    }
}
