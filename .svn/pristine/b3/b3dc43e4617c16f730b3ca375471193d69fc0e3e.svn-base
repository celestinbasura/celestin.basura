/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje12.Vjezbe.V1203;

/**
 *
 * @author Celestin
 */
public class Trokut {
    
  Tocka a = null;
  Tocka b = null;
  Tocka c = null;
  
    private class Tocka{        
        private int x;
        private int y;
        Tocka(int X, int Y){
            this.x = X;
            this.y = Y;        
        }
     double getDistanceFrom(Tocka t){
         return Math.sqrt(Math.pow((t.x - this.x), 2) + Math.pow((t.y - this.y), 2));
     }
    }
   void setTocka(int x, int y){
       
       Tocka t = new Tocka (x, y);
       
       if (a == null){
           a = t;
           return;
       }
       if (b == null){
           b = t;
           return;
       }
       if (c == null){
           c = t;
           return;
       }
   }
   public int getTocka(){
       return a.x;
   }
  public double getOpseg(){
     
      return (a.getDistanceFrom(b) + b.getDistanceFrom(c) + a.getDistanceFrom(c));
  }
  @Override
    public String toString(){
        return "Trokut ima tocku X " + a.x + ", " + a.y;
    
    }
      
   
}
