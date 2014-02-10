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
class V0402 {

    public static void main(String[] args) {

        int a = 3;
        System.out.println("program: parametar koji dajemo: " + a);
		if (provjeriBroj(a)) {
			System.out.printf("\n Broj je paran");
		}else {
        System.out.println("Broj nije paran");
		}
    }

    static boolean provjeriBroj(int a) {
		if (a % 2 == 0) {
			return true;
		}
        return false;
    }
    
}
