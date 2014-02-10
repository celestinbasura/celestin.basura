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
public class V0204 {

    public static void main(String[] args) {
	
		double tempUFar;
		double tempUCelz;
		
		java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Unesite prvu temperaturu? ");
        tempUFar = sc.nextDouble();
		
		tempUCelz = (tempUFar - 32)* (5./9); 
		System.out.printf(" Temperatura od %.3f(F)jednaka je temperaturi od %.3f(C)", tempUFar, tempUCelz);
		
	}
}