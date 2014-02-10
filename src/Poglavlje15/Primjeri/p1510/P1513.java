/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1510;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Primjer p1613 
 * Čitanje i pisanje sa BufferedWriter i BufferedReader objektima
 */
class P1513 {

    public static void main(String[] args) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(
                        new FileWriter(new File("C:\\Users\\Tomislav\\Desktop\\test2.txt")))) {

            bw.write("neki string");
            bw.flush();
        }

        try (BufferedReader br = new BufferedReader(
                        new FileReader(new File("C:\\Users\\Tomislav\\Desktop\\test2.txt")))) {

            String line = br.readLine();
            System.out.println(line);
        }

    }
}
