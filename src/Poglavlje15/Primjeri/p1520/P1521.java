/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1520;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Primjer p1621 
 * Pisanje teksta u datoteku
 */
public class P1521 {

    public static void main(String[] args) {

        try (PrintWriter pw = new PrintWriter(
                        new FileWriter(new File("C:\\Users\\Tomislav\\Desktop\\tekst.txt")))) {

            pw.println("prva linija teksta.");
            pw.println("druga linija teksta.");
            pw.flush();
        } catch (IOException ex) {
            System.err.println("Greška: " + ex);
        }

    }
}
