/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

import java.util.Scanner;

/**
 * P0531 Primjer koristenja Scanner klase
 */
public class V0502 {

    public static void main(String[] args) {
	

	
	Scanner scString = new Scanner(System.in);
    int suma = 0;
	int brojBrojeva = 0;
	float sredina;
	 System.out.printf("Unesite string \n");
		while (scString.hasNext()) {
		
		if(!scString.hasNextInt() && !scString.hasNext("Kraj")) {
			System.out.printf("Unesite Broj ili rijec Kraj");
			break;
			}else {
			if (/*scString.hasNextInt() && */!scString.hasNext("Kraj")) {
                suma += scString.nextInt();
				brojBrojeva++;
				System.out.printf("Suma je %d dok je sredina %d ",suma, brojBrojeva);
            } else {
				sredina = suma/brojBrojeva;
				System.out.printf("Suma je %d dok je sredina %.2f ",suma, sredina);
				//scString.close();
			break;
		   }
        }
	}
		
    }
}