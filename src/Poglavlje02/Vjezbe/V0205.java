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
public class V0205 {

    public static void main(String[] args) {
	
		int godina;
		
		java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Unesite godinu? ");
        godina = sc.nextInt();
		
			if ( godina % 4 == 0 && godina % 100 != 0) {
				System.out.printf(" Godina %d je prestupna!", godina);
			} else {
				if( godina % 400 == 0 && godina % 100 == 0) {
					System.out.printf(" Godina %d je prestupna!", godina);
				} else {
				System.out.printf(" Godina %d NIJE prestupna!", godina);
				}
			}
		
	}
}