

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
public class V0301 {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            System.out.printf("%d\n ",i);
            i++;
        }
		do{
			i--;
			System.out.printf("%d\n ",i);
			
		}while (i > 0);
		
    }
}