/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1550;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * rad sa URL-om
 */
public class P1554 {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.tvz.hr");
            URLConnection conn = url.openConnection();
            conn.connect();

            Scanner in = new Scanner(conn.getInputStream());
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);

            }
            in.close();
        }
        catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
