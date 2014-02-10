package babic.juraj.Poglavlje03.Primjeri;

/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0335 Kori�tenje povratnih vrijednosti metoda u bloku uvjeta
 */
public class P0335 {

    public static void main(String[] args) {

//        java.util.Scanner sc = new java.util.Scanner("1 2 3 4 5 6 7 8 9");
        java.util.Scanner sc = new java.util.Scanner(System.in);

        /*
         * u bloku uvjeta mo�emo koristiti bilo koju metodu koja vra�a tip boolean
         * naredbu is bloka naredbi mo�emo upisati u inkrementalni blok
         */

        for (int i = 0; sc.hasNext(); i = sc.nextInt(), System.out.println(i));

    }
}
