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
public class Z0204 {

    public static void main(String[] args) {
	
		double r;
		double O;
		double P; 
		final double Pi = 3.1415926535;
		
		java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.printf("Unesite radijus\n");
        r = sc.nextDouble();
		
		O = 2. * r * Pi;
		P = r * r * Pi;
		System.out.printf("Radijus je  %.2f \n Opseg je %f \n a povrsina je %f", r, O, P);
	}
}