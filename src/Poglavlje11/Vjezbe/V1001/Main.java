/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje11.Vjezbe.V1001;

import java.util.Arrays;

/**
 *
 * @author cbasura
 */
public class Main {
   public static void main(String[] args){
         Posuda[] posude = new Posuda[100];
         for(int i=0; i<posude.length; i++){
             posude[i] = new Posuda((int)(Math.random()*100));
         }
         System.out.println(Arrays.toString(posude));
         Arrays.sort(posude);
         System.out.println(Arrays.toString(posude));
     }
 
}
