

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
public class V0315 {

    public static void main(String[] args) {

  
	int unosBroja= 1;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while(unosBroja != 0){
			System.out.printf("Unesite broj, za izlaz 0   ");
			unosBroja =  sc.nextInt();
			System.out.printf("Uneseni broj je %d \n\n", unosBroja);		
		}
		System.out.printf("Izlazim iz programa jer je nula upisana");	
	}
}
