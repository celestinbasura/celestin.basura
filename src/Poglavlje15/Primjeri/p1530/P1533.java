/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1530;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/**
 * Primjer p1633 
 * Serializacija, pisanje objekta u datoteku
 */
class P1533 {

    public static void main(String[] args) throws IOException {

        Kontakt knt = new Kontakt(
                new Adresa("Slovenska", "Zagreb"),
                new Adresa("Konavoska", "Zagreb"));
        System.out.println(knt);

        try (ObjectOutputStream os = new ObjectOutputStream(
                        new FileOutputStream("C:\\Users\\Tomislav\\Desktop\\kontakt.ble"))) {

            os.writeObject(knt);
        }

    }
}
