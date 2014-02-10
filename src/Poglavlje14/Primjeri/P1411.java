/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje14.primjeri;

/**
 * Primjer p1411
 *
 * objekt koji implementira Runnable sučelje i run metodu.
 */
public class P1411 {

    public static void main(String[] args) {

        MyRunner01 rn = new MyRunner01();
        rn.run();

        Thread th = new Thread(rn);
        th.start();

    }
}
class MyRunner01 implements Runnable {

    @Override
    public void run() {
        System.out.println("Pozdrav !");
    }
}
