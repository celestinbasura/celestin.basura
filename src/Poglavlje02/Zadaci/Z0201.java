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
public class Z0201 {

    public static void main(String[] args) {
	
		boolean papigaPjeva;
		int kolikoJeSati;
		
		java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.printf("Unesite koliko je sati  (24h format)\n");
        kolikoJeSati = sc.nextInt();
		System.out.printf("Unesite da li papiga pjeva \n");
        papigaPjeva = sc.nextBoolean();
		
			if(papigaPjeva && kolikoJeSati < 7 || papigaPjeva && kolikoJeSati > 20) {
				System.out.printf("Susjedi su ljuti!!!!!");
			}
			else {
				System.out.printf("Sve je OK");
			}
		
	}
}