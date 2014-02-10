/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje14.primjeri;

/**
 * Primjer p1423
 *
 * svaki objekt ima svoj unutarnji (intrinsic) lock. ovaj lock koristimo kada
 * označimo metodu sa synchronized.
 */
public class P1423 {

    public static void main(String[] args) throws InterruptedException {

        Buckets08 b = new Buckets08(100, 1000);

        for(int i = 0; i < b.size(); i++) {
            BucketRunner08 br = new BucketRunner08(b, i);
            Thread t = new Thread(br);
            t.start();
        }

    }
}
class BucketRunner08 implements Runnable {

    private Buckets08 b;
    private int from;

    public BucketRunner08(Buckets08 b, int from) {
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

class Buckets08 {

    int[] buckets;

    public Buckets08(int noBuckets, int noStones) {
        buckets = new int[noBuckets];
        for(int i = 0; i < noBuckets; i++) {
            buckets[i] = noStones;
        }
    }

    public synchronized void move(int from, int to, int noStones) {
        if(buckets[from] < noStones) {
            return;
        }
        System.out.println(Thread.currentThread());
        buckets[from] -= noStones;
        System.out.format("moving stones %d : %d -> %d \n", noStones, from, to);
        buckets[to] += noStones;
        System.out.format("total stones : %d \n", getTotal());
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
