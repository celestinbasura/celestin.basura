

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
public class V0312 {

    public static void main(String[] args) {

  
	int MIN_N;
	int MAX_N;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.printf("Unesite doljnju granicu\n");
		MIN_N =  sc.nextInt();
		System.out.printf("Unesite gornju granicu\n");
		MAX_N =  sc.nextInt();
		
		for( int s = 2,k=0; s <= 9; s++){
			for(int i = MIN_N; i <= MAX_N; i++){
				if(i % s == 0){
					k++;
				}
					if(i == MAX_N){
					System.out.printf("%d brojeva dijeljivih sa %d\n",k, s);
					k = 0;
					break;
				}			
			}			
		}
	}
}
