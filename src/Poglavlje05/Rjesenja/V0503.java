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
 * V0503
 * Napraviti program koji koristi objekt klase Date (pogledati API) te ispisuje
 * koji je datum, vrijeme i dan u tjednu to�no 8 000 000 minuta nakon 1.1.1970.
 *
 * @author Tomislav Novak
 * @version 1.0
 */
public class V0503 {

    public static void main(String[] args) {
        
        Date dt = new Date(60_000 * 8_000_000L);
        System.out.printf("%1$tc",dt);
//        System.out.format("%1$tc\n", new Date());

    }
}
