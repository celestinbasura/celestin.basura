/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje07.Rjesenja;

/**
 * vježba v0601
 * Napisati program koji ispisuje sve prosljeđene parametre metodi main.
 * Primjer:
 * c:\>java MainArgs 1 zelje 3 mrkva pet 6
 *
 * U naš program preneseni su slijedeći parametri:
 * 	1
 * 	zelje
 * 	3
 * 	mrkva
 * 	pet
 * 	6
 */
public class V0701 {

    public static void main(String[] args) {
        System.out.println("U naš program preneseni su slijedeci parametri:");
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }
}
