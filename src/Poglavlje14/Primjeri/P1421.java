/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje14.primjeri;

/**
 * Primjer p1421
 *
 * primjer Race condition stanja
 */
public class P1421 {

    public static void main(String[] args) throws InterruptedException {

        Buckets b = new Buckets(100, 1000);

        for(int i = 0; i < b.size(); i++) {
            BucketRunner06 br = new BucketRunner06(b, i);
            Thread t = new Thread(br);
            t.start();
        }

    }
}
class BucketRunner06 implements Runnable {

    private Buckets b;
    private int from;

    public BucketRunner06(Buckets b, int from) {
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

class Buckets {

    int[] buckets;

    public Buckets(int noBuckets, int noStones) {
        buckets = new int[noBuckets];
        for(int i = 0; i < noBuckets; i++) {
            buckets[i] = noStones;
        }
    }

    public void move(int from, int to, int noStones) {
        if(buckets[from] < noStones) {
            return;
        }
        System.out.println(Thread.currentThread());
        buckets[from] -= noStones;
        System.out.format("moving stones %d : %d -> %d \n", noStones, from, to);
        buckets[to] += noStones;
        System.out.format("total stones : %d \n", getTotal());
    }

    int getTotal() {
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
