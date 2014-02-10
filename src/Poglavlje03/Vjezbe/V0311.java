

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
public class V0311 {

    public static void main(String[] args) {

  
	int MIN_N;
	int MAX_N;
	int suma = 0;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.printf("Unesite doljnju granicu\n");
		MIN_N =  sc.nextInt();
		System.out.printf("Unesite gornju granicu\n");
		MAX_N =  sc.nextInt();
		
		for(int k = MIN_N; k <= MAX_N; k++){
			for (int i = 2; i < k; i++){
			
				if(k % i == 0){
					break;			
					}
				if(k == (i+1)){
				
				suma++;
				break;
				}
			}		
		}
		System.out.printf("Ima ukupno %d prostih brojeva.\n", suma); 
	}
}
