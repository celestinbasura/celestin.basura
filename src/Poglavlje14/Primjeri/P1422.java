/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje14.primjeri;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Primjer p1422
 *
 * primjena Reentrant locka.
 */
public class P1422 {

    public static void main(String[] args) throws InterruptedException {

        Buckets07 b = new Buckets07(100, 1000);

        for(int i = 0; i < b.size(); i++) {
            BucketRunner07 br = new BucketRunner07(b, i);
            Thread t = new Thread(br);
            t.start();
        }

    }
}
class BucketRunner07 implements Runnable {

    private Buckets07 b;
    private int from;

    public BucketRunner07(Buckets07 b, int from) {
        this.b = b;
        this.from = from;
    }

    public void run() {
        try {
            b.move(from, (int)(b.size() * Math.random()), (int)(100 * Math.random()));
            Thread.sleep((int)(10 * Math.random()));
        }
        catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

class Buckets07 {

    int[] buckets;
    Lock bLock = new ReentrantLock();

    public Buckets07(int noBuckets, int noStones) {
        buckets = new int[noBuckets];
        for(int i = 0; i < noBuckets; i++) {
            buckets[i] = noStones;
        }
    }

    public void move(int from, int to, int noStones) {

        bLock.lock();
        try {
            if(buckets[from] < noStones) {
                return;
            }
            System.out.println(Thread.currentThread());
            buckets[from] -= noStones;
            System.out.format("moving stones %d : %d -> %d \n", noStones, from, to);
            buckets[to] += noStones;
            System.out.format("total stones : %d \n", getTotal());
        }
        finally {
            bLock.unlock();
        }
    }

    synchronized int getTotal() {
        int sum = 0;
        for(int i : buckets) {
            sum += i;
        }
        return sum;
    }

    double size() {
        return buckets.length;
    }
}
