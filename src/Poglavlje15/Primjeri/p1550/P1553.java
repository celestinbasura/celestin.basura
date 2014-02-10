/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1550;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * rad sa socketom citanje i pisanje
 */
public class P1553 {

    public static void main(String[] args) {

        try {
            Socket s = new Socket();
            s.setSoTimeout(1000);
            try (PrintWriter pw = new PrintWriter(new File("C:\\Users\\cisco\\Desktop\\net.html"))){
                
                s.connect(new InetSocketAddress("www.net.hr", 80));

                InputStream inS = s.getInputStream();
                OutputStream outS = s.getOutputStream();

                Scanner in = new Scanner(inS);
                PrintWriter out = new PrintWriter(outS);

                out.print("GET / HTTP/1.0 \r\n");
                out.print("\r\n");
                out.flush();

                while (in.hasNextLine()) {
                    String line = in.nextLine();
                    pw.println(line);
                    System.out.println(line);
                }
            }
            catch (ConnectException e) {
                System.out.println("Socket timeout!");
            }
            finally {
                s.close();
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
