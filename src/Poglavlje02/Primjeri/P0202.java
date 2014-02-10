/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0202
 * Čitanje sa konzole pomoću readLine naredbe
 * napomena: OBAVEZNO pokrenuti iz command prompta
 */
public class P0202 {

    public static void main(String[] args) {

        String niz = System.console().readLine("Unesite niz: ");
        System.out.println("Uneseni niz je: " + niz);

        int in = Integer.parseInt(niz);
        double db = Double.parseDouble(niz);
        boolean boo = Boolean.parseBoolean(niz);

        System.out.printf(" Integer: %d \n Double: %.2f \n Boolean: %b \n ", in, db, boo);

    }
}
