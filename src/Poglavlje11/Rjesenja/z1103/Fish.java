/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje11.Zadaci.z1103;

class Fish extends Animal implements Pet {

    private String name = "Fishy";

    public Fish() {
        super(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void play() {
        System.out.println("Fish is playing");
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public void walk() {
        System.out.println("Fish is swimming");
    }
}
