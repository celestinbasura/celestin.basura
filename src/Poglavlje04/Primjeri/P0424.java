/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0424
 * Primjer call-by-value pri pozivu metode. Java nema call-by reference poziv.
 *
 * Rijesenje: vrijednost koju smo izra�unali moramo vratiti natrag pozivatelju.
 */
class P0424 {

    public static void main(String[] args) {

        int a = 3;

        System.out.println("program: parametar koji dajemo: " + a);
        a = metodaCall(a);
        System.out.println("program: parametar koji smo dali: " + a);
    }

    static int metodaCall(int a) {

        System.out.println("metoda: parametar koji smo dobili: " + a);
        a = a + 3;
        System.out.println("metoda: parametar koji vraćamo: " + a);
        return a;
    }
    
}
