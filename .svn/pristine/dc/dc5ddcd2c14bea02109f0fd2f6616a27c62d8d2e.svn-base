/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje14.primjeri;

/**
 * Primjer p1412
 *
 * pokretanje dretvi
 */
public class P1412 {

    public static void main(String[] args) {

        new MyRunner02().run();

        System.out.println("Gotova main metoda !");

    }
}
class MyRunner02 implements Runnable {

    public void run() {

        int i = 0;
        while(i < 10) {
            System.out.println("Pozdrav broj " + (i++));
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

    }
}
