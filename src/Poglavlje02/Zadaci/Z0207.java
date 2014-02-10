/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * V0201
 */
public class Z0207 {


	
    public static void main(String[] args) {
	

	int prvaGodina;
	int drugaGodina;
	int zbrojGodina = 0;
	int razlikaGodina;
	int temp;
	java.util.Scanner sc = new java.util.Scanner(System.in);

       
	System.out.printf("Unesite prvu godinu \n");
        prvaGodina = sc.nextInt();
		System.out.printf("Unesite drugu godinu \n");
        drugaGodina = sc.nextInt();		
	if (prvaGodina >= drugaGodina) {
			temp = prvaGodina;
			prvaGodina = drugaGodina;
			drugaGodina = temp;
			System.out.printf(" Unesene su godine naopako pa sam ih ja za tebe zamijenio :)\n");
		}
		if (prvaGodina >= 1600) {	
		
			if ( prvaGodina % 4 == 0 && prvaGodina % 100 != 0) {
				zbrojGodina++;
			} else {
				if( prvaGodina % 400 == 0 && prvaGodina % 100 == 0) {
					zbrojGodina++;
				} else {}
			}
			if ( drugaGodina % 4 == 0 && drugaGodina % 100 != 0) {
				zbrojGodina++;
			} else {
				if( drugaGodina % 400 == 0 && drugaGodina % 100 == 0) {
					zbrojGodina++;
				} else {}
		razlikaGodina = drugaGodina - prvaGodina;
		zbrojGodina = zbrojGodina + (int)(razlikaGodina / 4);
		//System.out.printf(" razlika je %d.\n", razlikaGodina);
		System.out.printf(" U tom periodu je bilo %d prestupnih godina.\n", zbrojGodina);
		}	
	}else {
		System.out.printf(" Prestupne godine pocinju od 1600god.\n");
		}
	}
 }