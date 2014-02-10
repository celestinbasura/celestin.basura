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
public class Z0205 {

    public static void main(String[] args) {
	
		boolean magare1;
		boolean magare2;
		boolean vodostaj;
		java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.printf("Da li je prvi magarac zedan?\n");
        magare1 = sc.nextBoolean();
		System.out.printf("Da li je drugi magarac zedan?\n");
        magare2 = sc.nextBoolean();
		System.out.printf("Da li je vodostaj visok?\n");
        vodostaj = sc.nextBoolean();
			
			if( magare1 && magare2) {
				if(vodostaj) {
					System.out.printf(" Oba magarca piju vodu");	
				} else {
					System.out.printf( "Samo jedan magarac pije vodu");
				}
			} else {
				if (magare1 || magare2) {
					System.out.printf( "Samo jedan magarac pije vodu");
				} else {
					System.out.printf( "Nijedan magarac ne pije vodu");
				}
			}
	}	
}