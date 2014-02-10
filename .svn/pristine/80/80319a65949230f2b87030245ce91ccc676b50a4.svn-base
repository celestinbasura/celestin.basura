/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1520;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Primjer p1622 
 * DataInput klase, čitanje osnovnih tipova podataka
 */
public class P1525 {

    public static void main(String[] args) {

        try {
            DataInput din = new DataInputStream(
                    new FileInputStream("C:\\Users\\Tomislav\\Desktop\\osnovni.bin"));

            char c = din.readChar();
            System.out.println("chr: " + c);
            int i = din.readInt();
            System.out.println("int: " + i);

            

            double d = din.readDouble();
            System.out.println("dbl: " + d);

        } catch (FileNotFoundException ex) {
            System.err.println("Greška: " + ex);
        } catch (IOException ex) {
            System.err.println("Greška: " + ex);
        }

    }
}
