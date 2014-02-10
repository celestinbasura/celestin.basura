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
class V0405 {

    public static void main(String[] args) {

        int N = 7;
		int M = 69;
		int rezultat;
		
		rezultat = zbrajajLimit(M, N);
		System.out.printf(" Suma je %d ", rezultat);
	}		
       
	

    static int zbrajajLimit(int limit, int max) {
		int suma = 0;
		for( int i = 0; i < max; i++) {
			if(suma >= limit) {
				return suma;
			}
			suma = suma + i;		
		}
		return suma;
    }
 }   

