/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje14.primjeri;

/**
 * Primjer p1414
 *
 * pokretanje dretvi
 */
public class P1414 {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            Thread t = new Thread(new MyRunner04(i));
            t.setName(String.format("Dretva %d", i));
            t.start();
        }
        System.out.println("Gotova main metoda !");

    }
}
class MyRunner04 implements Runnable {

    int number;

    public MyRunner04(int no) {
        number = no;
    }

    public void run() {

        int i = 0;
        while(i < 20) {
            System.out.printf("%s, Pozdrav broj %d\n",
                    Thread.currentThread().getName(), i++);
            try {
                Thread.sleep(500 + (number * 100));
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.printf(" --- Dretva %d, gotova ! --- \n", number);

    }
}
