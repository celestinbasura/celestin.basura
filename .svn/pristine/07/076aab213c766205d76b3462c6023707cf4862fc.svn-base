/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje07.Rjesenja;

import java.util.Arrays;
import java.util.Scanner;

/**
 * vježba v0604
 * Implementirati metodu koja za ulazno polje realnih brojeva izračunava
 * prosječnu vrijednost svih članova polja. Članovi polja se unose putem
 * parametara metode main, a u slučaju da je polje ulaznih parametara prazno,
 * članove polja potrebno je učitati putem konzole ( koristiti klase
 * Console,Float,Double ili Scanner).Nule ne ulaze u izračun prosječnih
 * vrijednosti ! Izračun prosječne vrijednosti treba biti implementiran
 * unutar metode. Pokušati realizirati zadatak korištenjem for-each petlje.
 *
 * Primjer:
 * C:\>java SumaPolja  4 1. 0  3. 4.
 * Prosječna vrijednost polja [ 1.0, 0.0, 3.0, 4.0 ] = 2.6667
 *
 * Primjer:
 * C:\>java SumaPolja
 * Ulazni parametri nisu specificirani!
 * Unesite broj članova polja: 3
 * Unesite 1. član polja: 1.5
 * Unesite 2. član polja: 2.5
 * Unesite 3. član polja: 2.0
 * Prosječna vrijednost polja [ 1.5, 2.5, 2.0 ] = 2.0
 */
public class V0704 {

    public static void main(String[] args) {

        double[] polje;

        if(args.length == 0) {
            System.out.print("Nema ulaznih parametara, unesite broj clanova "
                    + "polja: ");
            Scanner sc = new Scanner(System.in);
            polje = new double[sc.nextInt()];

            for(int i = 0; i < polje.length; i++) {
                System.out.printf("Unesite %d. clan polja: ", i + 1);
                polje[i] = sc.nextDouble();
            }
        }
        else {
            polje = new double[Integer.parseInt(args[0])];
            for(int i = 0; i < polje.length; i++) {
                polje[i] = Double.parseDouble(args[i + 1]);
            }
        }

        System.out.printf("prosjecna vrijednost polja: %s = %.3f",
                Arrays.toString(polje), avg(polje));

    }

    static double avg(double[] p) {

        double sum = 0.0;
        for(double d : p) {
            sum += d;
        }
        return (sum / p.length);

    }
}
