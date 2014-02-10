/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Tomislav Novak - NetAkademija
 */

/**
 * P0631
 * Primjer metoda String objekta dokaz nepromijenjivosti.
 */
public class P0631 {
    
    public static void main(String[] args) {
        String tekst = "Pocetak: ";//duljina stringa je 9
        
        System.out.println("Stringovi: ");
        for (int i = 0; i < 10; i++) {
            tekst += i;
            System.out.print(tekst.length() + " ");
        }        
        
        System.out.println("\nStringBuilder: ");
        StringBuilder sb = new StringBuilder("Pocetak: ");
        
        for (int i = 0; i < 10; i++) {
            sb.append(i);
            System.out.print(sb.capacity() + " "); //ispis kapaciteta
        }
        
    }
    
}
