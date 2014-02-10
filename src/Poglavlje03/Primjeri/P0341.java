package babic.juraj.Poglavlje03.Primjeri;

/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0341 Primjer naredbe break. Naredba break se koristi samo unutar petlje za
 * prijevremeni izlazak iz petlje.
 */
public class P0341 {

    public static void main(String[] args) {

        int i = 0;
        while (i < 5) {

            System.out.println("Prolazak br: " + i);
            if (i == 3) {
                break;
            }
            i = i + 1;

        }

    }
}
