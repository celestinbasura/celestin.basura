/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje12.Vjezbe.V1201;

/**
 *
 * @author Celestin
 */
public class Auto {
       
   public String model;
   public int kubik;
   public Boja boj; 
    
    
   public Auto(String model, int kubik, Boja boja){
       
       this.boj = boja;
       this.kubik = kubik;
       this.model = model;
       
       
   }
    
  
   @Override
    public String toString(){
     return model + " je auto sa " + kubik + "ccm sa bojom " + boj;   
        
    }
    
    
}
