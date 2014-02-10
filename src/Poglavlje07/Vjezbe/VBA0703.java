/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje07.Vjezbe;

import java.util.ArrayList;

/**
 *
 * @author Celestin
 */
public class VBA0703 {
     public static void main(String[] args) {
         int i = 0;
         int sumaP = 0;
         int sumaN = 0;
         ArrayList<Integer> mojaLista = new ArrayList<>();
         while(i < 10){
             i++;
             mojaLista.add((int)(Math.random() * 100));       
         }
         for(int j = 0; j < 10; j++){
             if(mojaLista.get(j) % 2 == 0){
                 sumaP = sumaP + mojaLista.get(j);
             }else sumaN = sumaN + mojaLista.get(j);
         }
         System.out.println(mojaLista);
         System.out.printf("\n Suma parnih je %d a neparnih je %d  ", sumaP, sumaN);
     }
}
