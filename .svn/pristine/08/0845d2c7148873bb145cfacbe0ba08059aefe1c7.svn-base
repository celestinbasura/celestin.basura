/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

import java.util.Scanner;

/**
 * P0531 Primjer koristenja Scanner klase
 */
public class P0531 {

    public static void main(String[] args) {

        Scanner scString = new Scanner("niz znakove      koje treba 23 puta analizirati");
        int broj = 0;

        while (scString.hasNext()) {

            if (scString.hasNextInt()) {
                broj += scString.nextInt();
            } else {
                System.out.println(scString.next());
            }

        }

        System.out.println("Broj: " + broj);
        scString.close();
    }
}
