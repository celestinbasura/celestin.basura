/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1520;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Primjer p1621 
 * DataOutput klase, zapisivanje osnovnih tipova podataka
 */
public class P1524 {

    public static void main(String[] args) {

        try (DataOutputStream din = new DataOutputStream(
                        new FileOutputStream("C:\\Users\\Tomislav\\Desktop\\osnovni.bin"))) {

            din.writeInt(23);
            din.writeChar('a');
            din.writeDouble(45.987);
        } catch (FileNotFoundException ex) {
            System.err.println("Greška: " + ex);
        } catch (IOException ex) {
            System.err.println("Greška: " + ex);
        }

    }
}
