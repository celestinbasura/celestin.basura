/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje13.Primjeri.p1320;

/**
 * Svaka klasa iznimki koja naslijeđuje Exception a ne RuntimeException
 * je checked exception.
 */
public class MojException extends Exception {

    public MojException() {
        super();
    }

    public MojException(String msg) {
        super(msg);
    }
}
