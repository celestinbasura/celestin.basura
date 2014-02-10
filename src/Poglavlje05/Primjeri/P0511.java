/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

import java.util.Date;

/**
 * P0511 Primjer deklaracije reference i instanciranja objekta.
 */
public class P0511 {

    public static void main(String[] args) {

        Date dt = null;
        System.out.println(dt);

        dt = new Date();
        System.out.println(dt);

    }
}
