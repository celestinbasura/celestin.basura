
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje09.Vjezbe.kutije;

/**
 *
 * @author cbasura
 */
public abstract class Kutija {
    
    
   private int filled;
    
   private static int capacity;
    
   public void setFilled (int currentFilled){
        
        if(currentFilled > 0){
            
            this.filled = currentFilled;            
        }
    }    
   public int getFilled (){
        
        return this.filled;
    }
    
   public int getCapacity(){
       
       return this.capacity;
   }
    public void setCapacity (int newCapacity){
            
            this.capacity = newCapacity;            
        
    }    
    public boolean canFit(int newFilled){
        
        if(newFilled > capacity){
            return false;
        }
        return true;
    }
}
