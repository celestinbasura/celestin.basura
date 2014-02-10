/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Tomislav Novak - NetAkademija
 */
package Poglavlje14.Primjeri;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Program koji predstavlja deadlock. Javlja se jer postoje dvije metode koje
 * obje koriste dva lock objekta. Ukoliko jedna dretva dobije lock nad prvim
 * objektom a druga dretva dobije lock nad drugim objektom i to istovremeno onda
 * će prva dretva cekati lock nad drugim a druga dretva lock nad prvim objektom
 * što će rezultirati deadlockom.
 */
public class P1433 {

    public static void main(String[] args) {
        final PrvaKlasa k1 = new PrvaKlasa();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 1;
                while (i <= 10000) {
                    try {
                        k1.metodaPrva(i);
                    } catch (InterruptedException ex) {
                    }
                    i++;
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 1;
                while (i <= 10000) {
                    try {
                        k1.metodaDruga(i);
                    } catch (InterruptedException ex) {
                    }
                    i++;
                }
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
        }
    }
}

class PrvaKlasa {

    private Object lock1 = new Object();
    ReentrantLock lock2 = new ReentrantLock();

    public void metodaPrva(int i) throws InterruptedException {
        synchronized (lock1) {
//            Thread.sleep(1);//u ovom trenutku se može dogoditi deadlock
            lock2.lock();
            //neki kod
            lock2.unlock();
        }
        System.out.println("Izveo " + i + ". puta metoduPrvu " + Thread.currentThread().getName());

    }

    public void metodaDruga(int i) throws InterruptedException {
        lock2.lock();
//        Thread.sleep(1); //u ovom trenutku se može ogoditi deadlock
        try {
            synchronized (lock1) {
                //neki kod
            }
        } finally {
            lock2.unlock();
        }
        System.out.println("Izveo " + i + ". puta metoduDrugu " + Thread.currentThread().getName());
    }
}
