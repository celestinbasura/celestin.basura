/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje07.Rjesenja;

/**
 * vježba vb0604
 * Napisati program koji ispisuje sumu parnih elemente polja i sumu neparnih
 * elemenata polja. Duljina polja je 10 a elemenit polja su integeri. Potrebno
 * je deklarirati i inicijalizirati polje, te pomoću petlje u polje pospremiti
 * slučajno generirane brojeve između 1 i 100 pomoću funkcije Math.random().
 */
public class VB0704 {

    public static void main(String[] args) {

        int[] polje = new int[10];
        for(int i = 0; i < polje.length; i++) {
            polje[i] = (int)(Math.random() * 100 + 1);
        }

        int sumaParnih = 0;
        int sumaNeparnih = 0;
        for(int i = 0; i < polje.length; i++) {
            if(i % 2 == 0) {
                sumaParnih += polje[i];
            }
            else {
                sumaNeparnih += polje[i];
            }
        }

        System.out.println("Suma parnih elemenata : " + sumaParnih);
        System.out.println("Suma neparnih elemenata : " + sumaNeparnih);

    }
}
