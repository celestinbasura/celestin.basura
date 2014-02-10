/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 NetAkademija
 */
package Poglavlje05.Rjesenja;

import java.util.Scanner;

/**
 * Z0501 <br/>
 * Napisati program (interpreter) koji računa zadani matematički izraz, npr. 2 +
 * 5 ili 5.6 * 7.12. Program mora izvršavati računske operacije zbrajanja,
 * oduzimanja, množenja i dijeljenja sa decimalnom brojevima. Ukoliko uneseni
 * izraz ne može biti matematički interpretiran, npr. 5+3 (fale razmaci), 5plus3
 * (niz znakova), itd. program mora ispisati "Krivi izraz". Program radi sve dok
 * korisnik ne unese niz znakova "exit".
 */
public class Z0501 {

	public static void main(String[] args) {

		Scanner scInput = new Scanner(System.in);

		String operator = "";
		double prviBroj = 0;
		double drugiBroj = 0;
		double rezultat = 0;

		boolean nextStep;
		String input;

		System.out.println("Unesite zadatak.");

		do {

			input = scInput.nextLine();
			Scanner sc = new Scanner(input);

			nextStep = true;

			if (sc.hasNextDouble()) {
				prviBroj = sc.nextDouble();
				operator = sc.next();
			} else {
				nextStep = false;
			}

			if (nextStep && sc.hasNextDouble()) {
				drugiBroj = sc.nextDouble();
			} else {
				nextStep = false;
			}

			switch (operator) {
			case "+":
				rezultat = prviBroj + drugiBroj;
				break;
			case "-":
				rezultat = prviBroj - drugiBroj;
				break;
			case "*":
				rezultat = prviBroj * drugiBroj;
				break;
			case "/":
				rezultat = prviBroj / drugiBroj;
				break;
			default:
				nextStep = false;
				break;
			}

			if (nextStep) {

				System.out.printf("%s %s %s = %s\n", Double.toString(prviBroj),
						operator, Double.toString(drugiBroj),
						Double.toString(rezultat));
			} else {
				System.out.println("Krivi unos.");
			}

		} while (!input.equals("exit"));

		System.out.println("Hvala na koristenju.");
	}

}
