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
public class V0209 {

    public static void main(String[] args) {
	
		int mjesec;
		int dan;
		int zbroj = 0;
		
		java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.printf("Unesite mjesec koji zelite \n");
        mjesec = sc.nextInt();
		System.out.printf("Unesite datum koji zelite \n");
        dan = sc.nextInt();
		mjesec--;
		switch (mjesec) {
			case 12:
			zbroj += 31;
			case 11:
			zbroj += 30;
			case 10:
			zbroj += 31;
			case 9:
			zbroj += 30;
			case 8:
			zbroj += 31;
			case 7:
			zbroj += 31;
			case 6:
			zbroj += 30;
			case 5:
			zbroj += 31;
			case 4:
			zbroj += 30;
			case 3:
			zbroj += 31;
			case 2:
			zbroj += 28;
			case 1:
			zbroj += 31;
			break;
			case 0:
			zbroj += 0;
			break;
			default:
			System.out.printf("Mjesec ne postoji");
		}
		
		zbroj += dan;
		System.out.printf("Proslo je %d dana", zbroj);
	}
}