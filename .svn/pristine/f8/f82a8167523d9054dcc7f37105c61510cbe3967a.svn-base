/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Tomislav Novak - NetAkademija
 */

/**
 * P0623
 * Primjer metoda String objekta dokaz nepromijenjivosti.
 */
public class P0623 {

    public static void main(String[] args) {

        String str1 = "Dobro jutro ";
        
        str1.concat("pjevaju ptice."); //stvoren je novi string u literal poolu 
                                       //"Dobro jutro pjevaju ptice." ali gdje je referenca na njega?
        System.out.printf("\"%s\"\n", str1);       
        
        str1 = str1.concat("pjevaju ptice."); //ukoliko želimo da se postojeća varijabla promijeni moramo spremiti rezultat u nju.
        
        System.out.printf("\"%s\"\n", str1);
        
        str1.format("%d. %s",1 , str1);
        
        System.out.printf("\"%s\"\n", str1);
        
        str1 = str1.format("%d. nacin %s",1 , str1);
                
        System.out.printf("\"%s\"\n", str1);
        
        str1 = String.format("%d. nacin %s",2, str1);
        
        System.out.printf("\"%s\"", str1);
        

    }
}
