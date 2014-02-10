/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje13.Primjeri.p1310;

/**
 * Primjer p1212
 * Primjer hvatanja iznimke kod parsiranja broja iz stringa u integer se
 * može pojaviti iznimka NumberFormatException
 */
public class p1312 {

    public static void main(String[] args) {

        String broj = "12n";

        try {
            int num = Integer.parseInt(broj);
            System.out.printf("Broj je: %d \n", num);
        }
        catch(NumberFormatException ex) {
            System.out.println("Parsiranje broja nije uspjelo: \n"
                    + ex);
        }

        System.out.println("Program gotov!");

    }
}
