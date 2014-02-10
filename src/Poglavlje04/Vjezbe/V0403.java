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
class V0403 {

    public static void main(String[] args) {

        int a = 7;
        System.out.println("program: parametar koji dajemo: " + a);
		if (prostBroj(a)) {
			System.out.printf("\n Broj je prost");
		}else {
        System.out.println("Broj nije prost");
		}
    }

    static boolean prostBroj(int a) {
		for(int i = 2; i < a; i++) {
			if(a % i == 0) {
				return false;
			}
		}
		return true;
    }
    
}
