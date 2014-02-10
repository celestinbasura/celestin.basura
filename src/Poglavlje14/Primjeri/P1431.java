/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje14.primjeri;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Primjer p1431
 *
 * primjena Condition objekta
 */
public class P1431 {

    public static void main(String[] args) throws InterruptedException {

        Buckets31 b = new Buckets31(100, 100);

        for(int i = 0; i < b.size(); i++) {
            BucketRunner31 br = new BucketRunner31(b, i);
            Thread t = new Thread(br);
            t.start();
        }

    }
}
class BucketRunner31 implements Runnable {

    private Buckets31 b;
    private int from;

    public BucketRunner31(Buckets31 b, int from) {
        this.b = b;
        this.from = from;
    }

    public void run() {
        while(true) {
            try {
                b.move(from, (int)(b.size() * Math.random()), (int)(100 * Math.random()));
                Thread.sleep((int)(10 * Math.random()));
            }
            catch(InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

class Buckets31 {

    int[] buckets;
    Lock bLock = new ReentrantLock();
    Condition suffStones;

    public Buckets31(int noBuckets, int noStones) {

        buckets = new int[noBuckets];
        for(int i = 0; i < noBuckets; i++) {
            buckets[i] = noStones;
        }

        suffStones = bLock.newCondition();

    }

    public void move(int from, int to, int noStones) throws InterruptedException {

        bLock.lock();
        try {
            while(buckets[from] < noStones) {
                System.out.format("%s, waiting for move : %d, %d[%d] -> %d[%d] \n",
                        Thread.currentThread(), noStones,
                        from, buckets[from], to, buckets[to]);
                suffStones.await();
            }
            System.out.print(Thread.currentThread());
            buckets[from] -= noStones;
            System.out.format(", moving stones %d : %d -> %d, ", noStones, from, to);
            buckets[to] += noStones;
            System.out.format(" total stones : %d \n", getTotal());
//            suffStones.signal();
            suffStones.signalAll();
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
