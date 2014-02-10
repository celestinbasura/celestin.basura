/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje07.Vjezbe;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Celestin
 */
public class V0704 {
     public static void main(String[] args) {
         int broj = 0;
         double pomocni = 0;
         if(args.length == 0){
             System.out.println("Polje nije proslijedeno pa unesite koliko ce novo polje imati znamenki");
             Scanner sc = new Scanner (System.in);
             broj = sc.nextInt();
             int brojac = 0;
             double brojevi[];
             brojevi = new double [broj];
             for(int i = 0; i < broj; i++){
                System.out.printf("Unesite %d clan polja    ", i+1); 
                pomocni = sc.nextDouble();
                if(0 != pomocni){                      
                brojevi[i] = pomocni;
                brojac++;
                }
             }
             double suma = 0;
             for(int i = 0; i < broj; i++){
                 suma = suma + brojevi[i];
             }
             System.out.printf("\n Prosjecna vrijednost u polju je %f", (float)suma/brojac);
             
         }else {
             int brojac = 0;
             double brojevi[] = new double[args.length];
             for(int i = 0; i < args.length; i++){
                 brojevi[i] = parseInt(args[i]);
                 if(parseInt(args[i]) != 0) brojac++;
             }
             double suma = 0;
             for(int i = 0; i < args.length; i++){
                 suma = suma + brojevi[i];
                }
              System.out.printf("\n Prosjecna vrijednost u polju je %f", (float)suma/brojac);
         }
         
        
     }
}
