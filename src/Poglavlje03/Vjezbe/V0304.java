

/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0311 Primjer while petlje, ukoliko �elimo naredbe unutar petlje izvr�iti
 * npr. 5 puta potrebna nam je kontrolna varijabla �iju vrijednost mo�emo
 * pove�ati u svakom prolazu petlje. Petlja �e se izvr�avati dok je uvjet
 * istinit varijablu i pove�avamo za 1 prilikom svakog prolaska, kao zadnju
 * naredbu.
 */
public class V0304 {

    public static void main(String[] args) {

    final int MIN_N = 5;
	final int MAX_N = 35;
		for(int i = MIN_N; i <= MAX_N; i++){
			if(i % 7 == 0){
			System.out.printf("\n Broj %d je djeljiv sa 7.\n", i);
			}
		
		}
		
   }
}