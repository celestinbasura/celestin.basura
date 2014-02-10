/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1530;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Primjer p1638 
 * Serializacija, citanje objekta iz datoteke, transient
 */
class P1538 {

    public static void main(String[] args) throws IOException {

        KontaktParanoid knt = null;
        File f = new File("C:\\Users\\Tomislav\\Desktop\\kontakt.ble");
        try (ObjectInputStream os = new ObjectInputStream(
                        new FileInputStream(f))) {

            knt = (KontaktParanoid) os.readObject();
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }

        System.out.println(knt);

    }
}
