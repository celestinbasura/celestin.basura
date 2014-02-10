/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje12.Primjeri.p1220;

/**
 * Primjer p1221
 * Korištenje unutarnje klase.
 */
public class p1221 {

    public static void main(String[] args){

        Parovi p = new Parovi(10);
        p.add(1021, "prvi");
        p.add(1357, "drugi");
        p.add(1421, "treci");
        System.out.println(p);

    }

}
