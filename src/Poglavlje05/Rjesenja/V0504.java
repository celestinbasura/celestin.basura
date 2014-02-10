/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Tomislav Novak - NetAkademija
 */
package Poglavlje05.Rjesenja;

import java.util.Date;

/**
 * V0504
 * Napraviti program koji za dan pokretanja programa ispisuje koji je to dan u tjednu.
 * (Napomena: pogledati metodu printf() klase PrintStream,
 * odnosno klasu Formatter za informacije o formatiranom ispisu). 
 * Koristiti klasu Date.
 *
 * @author Tomislav Novak
 * @version 1.0
 */
public class V0504 {
    
    public static void main(String[] args) {
        
        System.out.format("%1$tA\n", new Date());
        
    }
}