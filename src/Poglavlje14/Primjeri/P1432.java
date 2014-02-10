/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje14.primjeri;

/**
 * Primjer p1432
 *
 * primjena intrinsic condition objekta
 */
public class P1432 {

    public static void main(String[] args) throws InterruptedException {

        Buckets32 b = new Buckets32(100, 100);

        for(int i = 0; i < b.size(); i++) {
            BucketRunner32 br = new BucketRunner32(b, i);
            Thread t = new Thread(br);
            t.start();
        }

    }
}
class BucketRunner32 implements Runnable {

    private Buckets32 b;
    private int from;

    public BucketRunner32(Buckets32 b, int from) {
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

class Buckets32 {

    int[] buckets;

    public Buckets32(int noBuckets, int noStones) {

        buckets = new int[noBuckets];
        for(int i = 0; i < noBuckets; i++) {
            buckets[i] = noStones;
        }

    }

    public synchronized void move(int from, int to, int noStones) throws InterruptedException {
        while(buckets[from] < noStones) {
            System.out.format("%s, waiting for move : %d, %d[%d] -> %d[%d] \n",
                    Thread.currentThread(), noStones,
                    from, buckets[from], to, buckets[to]);
            wait();
        }
        System.out.print(Thread.currentThread());
        buckets[from] -= noStones;
        System.out.format(", moving stones %d : %d -> %d, ", noStones, from, to);
        buckets[to] += noStones;
        System.out.format(" total stones : %d \n", getTotal());
        notifyAll();
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
