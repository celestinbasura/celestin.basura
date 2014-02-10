/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje09.Vjezbe.kutije;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cbasura
 */
public class Main {
    public static void main(String[] args) {
        
     int choice = 1;  
     int napunjenost;
             
     int ukupnaNapunjenost = 0;
     int ukupniKapacitet = 0;
     
     ArrayList<Kutija> boxes = new ArrayList<>();
     while(choice != 0){
             
        System.out.println("Koju funkciju zelite: \n"
                + "1. Dodaj kutiju\n"
                + "2. Obrisi kutiju\n"
                + "3. Ispisi ukupni kapacitet i popunjenost");
        
        Scanner sc = new Scanner(System.in);
        
        choice = sc.nextInt();
        switch(choice){
        
            case 1: 
                
                System.out.println("Odaberi velicinu kutije");
                choice = sc.nextInt();
                if(choice == 1) {
                     boxes.add(new SmallBox());
                } if(choice == 2) {
                        
                     boxes.add(new MediumBox());
                } if(choice == 3) {
                     boxes.add(new BigBox());
                }                
                break;
               
            case 2:
                
                System.out.println("Unesite redni broj kutije koju zelite napuniti");
                choice = sc.nextInt();
                System.out.println("Unesite koliko zelite napuniti kutiju");
                napunjenost = sc.nextInt();
                boxes.get(choice).setFilled(napunjenost);                
                break;
                
            case 3:
                
                for(int i = 0 ; i < boxes.size();i++){
                    ukupnaNapunjenost += boxes.get(i).getFilled();
                }
                for(int i = 0 ; i < boxes.size();i++){
                    ukupniKapacitet += boxes.get(i).getCapacity();
                }
                System.out.println("Kutije su ukupno napunjene " + ukupnaNapunjenost +
                         " dok imaju ukupn " + ukupniKapacitet + "  mjesta za pohranu");
                break;
                
            default:
                    
        
        }
               
        }         
        
        
    }
}
