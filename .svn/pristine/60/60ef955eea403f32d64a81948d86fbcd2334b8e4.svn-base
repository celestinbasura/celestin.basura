/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1540;

import Poglavlje15.Primjeri.p1530.*;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Primjer p1642 
 * Serializacija, citanje objekta iz datoteke, transient
 */
class P1542 {

    public static void main(String[] args) throws IOException {

        KontaktGrupa knt = new KontaktGrupa();

        try (ObjectInputStream os = new ObjectInputStream(
                        new FileInputStream("C:\\Users\\Tomislav\\Desktop\\kontaktGrupa.ble"))) {

            knt = (KontaktGrupa) os.readObject();
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }

        System.out.println(knt);

    }
}
