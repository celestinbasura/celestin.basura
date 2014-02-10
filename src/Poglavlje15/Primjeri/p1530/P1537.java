/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1530;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/**
 * Primjer p1637 
 * Serializacija, pisanje objekta u datoteku.
 */
class P1537 {

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Tomislav\\Desktop\\kontakt.ble");
        KontaktParanoid knt = new KontaktParanoid(
                new Adresa("Slovenska", "Zagreb"),
                new Adresa("Konavoska", "Zagreb"),
                new Adresa("Srednjaci", "Zagreb"));
        System.out.println(knt);

        try (ObjectOutputStream os = new ObjectOutputStream(
                        new FileOutputStream(f))) {

            os.writeObject(knt);
        }

    }
}
