/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1520;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Primjer p1623 
 * Čitanje tekstualne datoteke
 */
public class P1523 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new FileReader(
                    new File("C:\\Users\\Tomislav\\Desktop\\tekst2.txt")));
            while (sc.hasNext()) {
                System.out.print(sc.nextLine() + "\n");
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Greška: " + ex);
        }

    }
}
