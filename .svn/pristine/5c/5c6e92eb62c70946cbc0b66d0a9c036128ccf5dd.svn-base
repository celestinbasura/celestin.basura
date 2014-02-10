package babic.juraj.Poglavlje03.Primjeri;

/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0343 Primjer ozna�ene break naredbe. Oznakama ozna�avamo deklaraciju petlje
 * navode�i u liniji prije deklaracije petlje. Kori�tenjem break ili continue
 * naredbe sa oznakom definiramo na koju petlju se break ili continue odnosi.
 */
public class P0343 {

    public static void main(String[] args) {

        oznaka1:
        for (int i = 0; i < 10; i++) {

            oznaka2:
            for (int j = 0; j < 10; j++) {

                System.out.println("varijabla i: " + i);
                System.out.println("varijabla j: " + j);
                break oznaka2;

            }

            System.out.println("--- kraj unutarnje petlje ---");
        }

    }
}
