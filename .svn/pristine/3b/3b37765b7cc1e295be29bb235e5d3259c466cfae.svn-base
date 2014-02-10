/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje08.Vjezbe.V0803;

import java.util.Scanner;

/**
 *
 * @author Celestin
 */
public class IspisOsobe {
    public static void main(String[] args) {
    
    Osoba cele = new Osoba();
    int unosGodine = 2013;
    Scanner sc = new Scanner(System.in);
    System.out.println("Unesite ime: ");
    cele.setIme(sc.nextLine());
    System.out.println("Unesite prezime: ");
    cele.setPrezime(sc.nextLine());
    System.out.println("Unesite godinu rodjenja: ");
    cele.setGodinaRodjenja(sc.nextInt());
    System.out.println("Unesite trenutnu godinu za provjeru: ");
    unosGodine = sc.nextInt();
    while(unosGodine != 0){
        if(cele.isPunoljetan(unosGodine)){
            System.out.println(cele.getIme() + " je punojetan.");
        }else {
            System.out.println(cele.getIme() + " NIJE punojetan.");
        }
         System.out.println("Unesite trenutnu godinu za provjeru: ");
         unosGodine = sc.nextInt();
    }
    System.out.println(cele.stanje());
    System.out.println("Hvala na koristenju programa ");
    
    
    
    }
}
