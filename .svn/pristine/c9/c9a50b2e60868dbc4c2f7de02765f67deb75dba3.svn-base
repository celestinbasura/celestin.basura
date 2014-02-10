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
public class V0505 {

    public static void main(String[] args) {
		
	float avgInt = 0;
	float avgDb = 0;
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	
	avgInteger(new Scanner(str));
	avgDouble(new Scanner(str));
	
    }


	static void avgInteger(Scanner sc) {
	
		float avgInt = 0;
		int suma = 0;
		int brojBrojeva = 0;
		do{
		if(sc.hasNextInt() ){
			suma += sc.nextInt();
			brojBrojeva++;
		}
		else {
			sc.next();
		}
		}
		while(sc.hasNext());
		if(brojBrojeva != 0){
		avgInt = suma / brojBrojeva;
		System.out.printf("\n Sredina integera je %.2f dok je suma bila %d a broj brojeva %d",
		avgInt, suma, brojBrojeva);
		} else {
			System.out.printf("\n nema INT brojeva");
		}
	}
	
	
	static void avgDouble(Scanner sc) {
	
		float avgDb = 0;
		int suma = 0;
		int brojBrojeva = 0;
		do{
		if(sc.hasNextDouble() && !sc.hasNextInt() ){
			suma += sc.nextDouble();
			brojBrojeva++;
		}
		else {
			sc.next();
		}
		}
		while(sc.hasNext());
		if(brojBrojeva != 0){
		avgDb = suma / brojBrojeva;
		System.out.printf("\n Sredina double je %.2f dok je suma bila %d a broj brojeva %d",
		avgDb, suma, brojBrojeva);
		} else {
			System.out.printf("\n nema double brojeva");
		}
	}

}	
   
		
