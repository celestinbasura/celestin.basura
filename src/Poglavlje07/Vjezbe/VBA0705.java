/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje07.Vjezbe;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Celestin
 */
public class VBA0705 {
     public static void main(String[] args) {
         int j = 0;
         int suma = 0;
         ArrayList<Integer> mojaLista = new ArrayList<>();
         while(j < 10){
            j++;
             mojaLista.add((int)(Math.random() * 100));       
         }
        
         System.out.println(mojaLista);
         Collections.sort(mojaLista);
          System.out.println(mojaLista);
         for (int i = 0; i < 9 ; i++){
             suma = suma + mojaLista.get(i) + mojaLista.get(i+1);
         }
         System.out.printf("Prosjecna udaljenost sortirane liste je %f\n", (float)suma/10);
     }
    
    
}
