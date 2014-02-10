/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje12.Primjeri.p1210;

/**
 * Enum konstante naslijeđuju klasu u kojoj su deklarirane. Ukoliko enum
 * klasa ima deklariranu apstraktnu klasu enum konstanta ju mora implementirati.
 */
public enum Operacije {

    PLUS("+") {

        @Override
        double apply(double x, double y) {
            return x + y;
        }
        
        void test() {
            System.out.println("u testu");
        }
    },
    MINUS("-") {

        double apply(double x, double y) {
            return x - y;
        }
    },
    PUTA("*") {

        double apply(double x, double y) {
            return x * y;
        }
    },
    DIJELJENO("/") {

        double apply(double x, double y) {
            return x / y;
        }
    };
    private final String simbol;

    Operacije(String simb) {
        this.simbol = simb;
    }

    @Override
    public String toString() {
        return simbol;
    }

    abstract double apply(double x, double y);
}
