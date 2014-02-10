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
public class V0202 {

    public static void main(String[] args) {
	
		boolean majmun1;
		boolean majmun2;
		
		java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Da li je prvi majmun sretan? ");
        majmun1 = sc.nextBoolean();
		System.out.print("Da li je drugi majmun sretan? ");
        majmun2 = sc.nextBoolean();
			
			if(majmun1 && majmun2 || !majmun1 && !majmun2 ) {
				System.out.print("Sve je uredu!!! ");
			} else {
				System.out.print("Nesto nije uredu!!! ");
			}
	}
}