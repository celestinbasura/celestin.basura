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
public class V0508 {

    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	
	
	brojRijeci(new Scanner(str));
	
    }


	static void brojRijeci(Scanner sc) {
	
		
		int brojRijeci = 0;
		do{
		if(sc.hasNext() && sc.equals("a") || sc.equals("A") ){
			
			brojRijeci++;
		}
		else {
			sc.next();
		}
		} while(sc.hasNext());
		System.out.printf("\n ima %d rijeci sa a", brojRijeci);
	}
	
	
}	
   
		
