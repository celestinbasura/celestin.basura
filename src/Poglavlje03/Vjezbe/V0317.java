

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
public class V0317 { 
public static void main(String args[]) { 

	int unosBroja;
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.printf("Unesite broj znamenki za fibonacijev niz. \n"); 
	unosBroja =  sc.nextInt();
	int br1=0;
	int br2=1;
	int br3=0; 
	System.out.printf("%d %d", br1,br2); 
		for(int i=1;i<=unosBroja;i++) { 
		br3 = br1 + br2; 
		System.out.printf(" %d ",br3); 
		br1 = br2; 
		br2 = br3; 
		} 
	} 
}

