/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje11.Vjezbe.V1001;

/**
 *
 * @author cbasura
 */
public class Posuda implements Comparable{
    
    
    private int velicina;
    
    public Posuda (int newVelicina){
        
        this.velicina = newVelicina;
    }
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Posuda)){
            return false;            
        }
        if(o == null){
            return false;
        }
        Posuda p = (Posuda)o;
        if(this.velicina == p.velicina){
            return true;
        } 
        return false;
    }
    
    @Override
    public int compareTo (Object o){
          if(!(o instanceof Posuda)){
            return 32;            
        }
        if(o == null){
            return 32;
        }
        Posuda p = (Posuda)o;
        return this.velicina - p.velicina;        
    }
    
    @Override
    public String toString(){
        
        return "" + velicina;
    }
}
