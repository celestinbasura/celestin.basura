/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje13.Primjeri.p1330;

/**
 * Primjer p1231
 * Assertions.
 */
public class p1331 {

	public static void main(String[] args){
		System.out.println("Dijeli: " + podijeli(2,1));
                vratiBroj(-1);
//                nekiTest(4);
                
	}

	static double podijeli(double a, double b){
            assert (b != 0) : "greška, b==0";
            return a/b;
	}

        static void vratiBroj(int broj){
            
            assert( broj >= 0 && broj <= 20 ) : "Invalid number: " + broj;
        }

	static void nekiTest(int stanje){
            switch(stanje) {
                case 1: /*napravi nesto*/ break;
                case 2: /*napravi nesto*/ break;
                case 3: /*napravi nesto*/ break;
                default: assert false : "katastrofa";
            }
	}

}


