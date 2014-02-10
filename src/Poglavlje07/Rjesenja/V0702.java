/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje07.Rjesenja;

/**
 * vježba v0602
 * Napisati program u Javi koji ulazne parametre metode main pretvara u brojeve
 * i računa njihovu sumu. Za pretvorbu brojeva koristiti se pomoćnim metodama
 * klase java.lang.Integer. Prilikom ispisa rezultata ispisati sve članove
 * polja koristeći metodom toString klase java.util.Arrays
 *
 * Primjer:
 * c:\>java SumaMainArgs 1 2 3 4 5
 * Suma brojeva [1, 2, 3, 4, 5] je : 15
 */
public class V0702 {

    public static void main(String[] args) {

        int sum = 0;
        for(int i = 0; i < args.length; i++) {
            sum += Integer.decode(args[i]);
        }

        System.out.println("Suma brojeva " + java.util.Arrays.toString(args)
                + " je " + sum);

    }
}
