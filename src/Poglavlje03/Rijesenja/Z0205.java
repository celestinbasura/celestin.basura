/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Marijan Matic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Zadatak Z0205
 * Dva se magarca nalaze blizu bunara s vodom. Kada je magarac �edan on ide do
 * bunara i pije. U slu�aju da su oba magarca �edna tada mogu piti vodu samo
 * ako je vodostaj bunara visok.
 *
 * Napisati program koji koristi logi�ke varijable (boolean) za opis �ednosti
 * magaraca i vodostaja bunara te ovisno o njihovim vrijednostima ispisuje
 * poruku na ekran koliko magaraca trenutno pije vodu.
 */
public class Z0205 {

    public static void main(String[] args) {

        boolean m1Zedan = false;
        boolean m2Zedan = false;
        boolean visokVodostaj = false;

        if(visokVodostaj) {
            if(m1Zedan && m2Zedan) {
                System.out.print("piju oba magaraca");
            }
            else if(m1Zedan || m2Zedan) {
                System.out.print("pije jedan magarac");
            }
            else {
                System.out.print("niti jedan magarac ne pije");
            }
        }
        else if(m1Zedan || m2Zedan) {
            System.out.print("pije jedan magarac");
        }
        else {
            System.out.print("niti jedan magarac ne pije");
        }
    }
}