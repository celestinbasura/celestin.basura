/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje13.Primjeri.p1310;

/**
 * Primjer p1218 Primjer Error, Error možemo hvatati ali se od njega ne možemo 
 * oporaviti. Označava grešku prilikom rada virtualne mašine.
 */
public class p1318 {

    public static void main(String[] args) {

        try {
            int rek = rekurzija(1);
        } catch (Throwable t) {
            System.out.println(t);
        }
//        System.out.println("Uhvatio sam error: " + err.getMessage());

    }

    static int rekurzija(int broj) {
        return rekurzija(broj++);
    }
}
