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
public class Z0206 {


	
    public static void main(String[] args) {
	
	double X1;
	double X2;
	double b;
	double a;
	double c;
	double D;
	double korijen;
	double realni;
	double imaginarni;
		java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.printf("Unesite konstantu a\n");
        a = sc.nextDouble();
		System.out.printf("Unesite konstantu b\n");
        b = sc.nextDouble();
		System.out.printf("Unesite konstantu c\n");
        c = sc.nextDouble();
		
		D = b * b - 4 * a*c;
		System.out.printf("Diskrimanata je %.2f \n", D);
		b = b * (-1);
			if(D >= 0) {
			korijen = Math.sqrt(D);
			X1 = (b + korijen) / (2 * a);
			X2 = (b - korijen) / (2 * a);
			System.out.printf("X1 je %.2f , a X2 je %.2f" , X1, X2);
		} else {
			realni = b / (2 * a);
			imaginarni = Math.sqrt(-D);
			imaginarni = imaginarni / (2 * a);
			System.out.printf("X1 je %.2f + %.2fi \n" , realni, imaginarni);
			System.out.printf("X2 je %.2f - %.2fi \n" , realni, imaginarni);
		}
	}	
}