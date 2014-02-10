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
public class V0501 {

    public static void main(String[] args) {
	
	String str;	
    System.out.println("Unesite string\n");
    Scanner sc = new java.util.Scanner(System.in);
	str = sc.nextLine();
	StringBuilder sb = new StringBuilder();
	sb.append(str);
	System.out.println(sb);
	zamijeniSamoglasnik(sb, 'a');
	zamijeniSamoglasnik(sb, 'e');
	zamijeniSamoglasnik(sb, 'i');
	zamijeniSamoglasnik(sb, 'o');
	zamijeniSamoglasnik(sb, 'u');
	
    System.out.println(sb);
 }	 
	static void zamijeniSamoglasnik (StringBuilder a, char samoglasnik) {
		int duljina = a.length();
		String zamjena = "A";

		if (samoglasnik == 'e') {
			zamjena = "E";
		}
		if (samoglasnik == 'i') {
			zamjena = "I";
		}
		if (samoglasnik == 'o') {
			zamjena = "O";
		}
		if (samoglasnik == 'u') {
			zamjena = "U";
		}
		for(int i = 0; i < duljina; i++) {
			if(a.charAt(i) == samoglasnik) {
				 //System.out.println("zamjena");
				a.replace(i,i, zamjena);
				a.deleteCharAt(i+1);
			}
			// System.out.println("Petlja");
		}
	}       
	
}
