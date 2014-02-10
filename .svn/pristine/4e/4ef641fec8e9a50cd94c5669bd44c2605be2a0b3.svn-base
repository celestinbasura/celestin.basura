/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0441
 * Primjer preoptere�enja (overloading) metode. Metoda je jednozna�no
 * deklarirana svojim identifikatorom i tipovima parametara koje prima, tj.
 * mo�e postojati vi�e metoda istog imena, ali s razli�itim parametrima.
 */
class P0441 {

    public static void main(String[] args) {

        metodaOverload();
        metodaOverload(1);
        metodaOverload(2, 3);
    }

    static void metodaOverload() {
        System.out.format("parametri: ništa \n");
    }

    static void metodaOverload(int a) {
        System.out.format("parametri: %d \n", a);
    }

    static void metodaOverload(int a, int b) {
        System.out.format("parametri: %d, %d \n", a, b);
    }
}
