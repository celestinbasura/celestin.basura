/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Vje�ba V0303
 * Napisati program koji uzlazno i silazno ispisuje sve brojeve od MIN_N do
 * MAX_N, gdje su MIN_N i MAX_N cjelobrojne konstante koriste�i petlju for.
 * Podsjetnik: klju�na rije� final deklarira konstantu.
 */
public class V0303 {

    public static void main(String[] args) {

        final int MAX_N = 32;
        final int MIN_N = 21;

        System.out.printf("\n --- Uzlazno od %d do %d --- \n", MIN_N, MAX_N);
        for(int i = MIN_N; i <= MAX_N; i++) {
            System.out.printf("%d, ", i);
        }

        System.out.printf("\n --- Silazno od %d do %d --- \n", MAX_N, MIN_N);
        for(int i = MAX_N; i >= MIN_N; i--) {
            System.out.printf("%d, ", i);
        }

    }
}
