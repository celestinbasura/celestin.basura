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
class V0404 {

    public static void main(String[] args) {

        int N = 7;
		int M = 69;
		for(int i = N; i < M; i++){
			if(prostBroj(i)){
				System.out.printf("\t %d", i);
			}		
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

