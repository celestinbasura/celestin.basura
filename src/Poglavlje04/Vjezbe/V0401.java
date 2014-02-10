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
class V0401 {

    public static void main(String[] args) {

        int a = 3;
		double b;
        System.out.println("program: parametar koji dajemo: " + a);
        b = vracaDouble(a);
        System.out.println("program: parametar koji smo dali: " + b);
    }

    static double vracaDouble(int a) {

        return a;
    }
    
}
