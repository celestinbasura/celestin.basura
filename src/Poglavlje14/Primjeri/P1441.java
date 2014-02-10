/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje14.primjeri;

/**
 * Volatile
 */
class p1441 {

    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {
            new Thread(new VolTest41()).start();
        }

    }
}
class VolTest41 implements Runnable {

    static volatile int a = 0;

    static void one() {
        a++;
    }

    static void two() {
        System.out.println("a=" + a);
    }

    public void run() {
        for(int i = 0; i < 100; i++) {
            one();
            two();
        }
    }
}
