/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

import java.util.Date;

/**
 * P0521 Primjer gubljenje referenci na objekt
 */
public class P0521 {

    public static void main(String[] args) {

        // dvije reference pokazuju na isti objekt
        Date d1 = new Date();
        Date d2 = d1;

        // samo jedna referenca na objekt je ostala
        d1 = null;

        // nema vi�e referenci na objekt, objekt �e biti izbrisan od GC-a.
        d2 = null;

    }
}
