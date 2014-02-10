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
 * vježba vb0605
 * Napisati program koji učitava 10 brojeva sa konzole. Program mora ispisati
 * učitani niz, sortirani učitani niz te "udaljenosti" svakog elementa od
 * slijedećeg elementa u sortiranom polju. Udaljenosi je potrebno spremiti u
 * novo polje te na kraju ispisati prosječnu udaljenost elemenata.
 */
public class VB0705 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] polje = new int[10];
        for(int i = 0; i < polje.length; i++) {
            System.out.print("Unesite element " + i + " : ");
            polje[i] = sc.nextInt();
        }

        System.out.println("Ucitani niz : " + Arrays.toString(polje));
        Arrays.sort(polje);
        System.out.println("Sortirani niz : " + Arrays.toString(polje));

        int[] udaljenosti = new int[polje.length - 1];
        for(int i = 0; i < udaljenosti.length; i++) {
            udaljenosti[i] = polje[i + 1] - polje[i];
        }

        double prosjecnaUdaljenost = 0;
        for(int i = 0; i < udaljenosti.length; i++) {
            prosjecnaUdaljenost += udaljenosti[i];
        }

        System.out.println("Prosjecna udaljenost je : "
                + prosjecnaUdaljenost / udaljenosti.length);

    }
}
