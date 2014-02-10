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
class V0406 {

    public static void main(String[] args) {

        int godina = 1900;
		
		System.out.printf(" Godina ima %d dana", provjeriGodinu(godina));
	}		
       
	

    static int provjeriGodinu(int god) {
		if(god % 4 == 0 && god % 100 != 0) {
			if(god % 400 == 0 && god % 100 == 0) {
				return 366;
			}
		}
		return 355;
    }	

 }   

