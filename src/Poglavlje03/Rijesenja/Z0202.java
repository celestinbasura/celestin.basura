/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Zadatak z0202 
 * Imamo dvije varijable tipa int. Napisati program koji ispisuje
 * true ukoliko su vrijednosti obje varijable u intervalu 20..30 uklju�ivo, ili
 * su obje u intervalu 40..50 uklju�ivo.
 */
public class Z0202 {

    public static void main(String[] args) {

        int var1 = 37;
        int var2 = 45;

        boolean rez1 = (((var1 >= 20) && (var1 <= 30)) && ((var2 >= 20) && (var2 <= 30)));
        boolean rez2 = (((var1 >= 40) && (var1 <= 50)) && ((var2 >= 40) && (var2 <= 50)));
        boolean rez = rez1 || rez2;

        System.out.println("Rezultat: " + rez);

    }
}