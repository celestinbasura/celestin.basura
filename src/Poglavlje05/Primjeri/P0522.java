/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Tomislav Novak - NetAkademija
 */

import java.util.Date;

/**
 * P0522 Primjer gubljenje referenci na objekt.
 */
public class P0522 {

    public static void main(String[] args) {

        // dvije reference pokazuju na razlizite objekte
        Date d1 = new Date();//1
        Date d2 = new Date();//2


        d2 = d1; //koga ce GC pokupiti?

    }
}
