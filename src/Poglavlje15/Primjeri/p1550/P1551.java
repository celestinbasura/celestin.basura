/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1550;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class P1551 {

    private InputStream ins;

    public void sayHi() {

        SocketAddress sca = new InetSocketAddress("localhost", 8898);
        try (Socket sc = new Socket()) {
            sc.setSoTimeout(5000);
            sc.connect(sca);

            ins = sc.getInputStream();
            Scanner s = new Scanner(ins);

            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
        }
        catch (SocketException ex) {
        }
        catch (IOException ex) {
        }
    }

    public static void main(String[] args) {

        new P1551().sayHi();

    }
}
