/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje11.Vjezbe.v1101;

import java.util.Arrays;

/**
 * Klasa Posuda, kod implementacije metode equals paziti na contract.
 */
public class Posuda implements Comparable {

    private int velicina;

    public Posuda(int velicina) {
        this.velicina = velicina;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj == null) {
            return false;
        }

        if(!(obj instanceof Posuda)) {
            return false;
        }

        Posuda other = (Posuda)obj;
        return this.velicina == other.velicina;
    }

    /*
     * kada objekt koji usporedjujemo nije instanciran, tj. je null ili nije
     * iste klase vracamo neki veliki broj.
     */
    @Override
    public int compareTo(Object o) {
        if(o == null) {
            return 99;
        }

        if(!(o instanceof Posuda)) {
            return 99;
        }

        Posuda other = (Posuda)o;
        return this.velicina - other.velicina;
    }

    @Override
    public String toString() {
        return "[" + velicina + "]";
    }

    public static void main(String[] args) {

        Posuda[] posude = new Posuda[100];
        for(int i = 0; i < posude.length; i++) {
            posude[i] = new Posuda((int)(Math.random() * 100));
        }
        System.out.println("Inicijalizirani niz:");
        System.out.println(Arrays.toString(posude));

        System.out.println("Sortirani niz:");
        Arrays.sort(posude);
        System.out.println(Arrays.toString(posude));
    }
}
