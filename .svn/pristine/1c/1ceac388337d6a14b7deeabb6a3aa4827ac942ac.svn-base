/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje09.Vjezbe.V0992;

/**
 *
 * @author Celestin
 */
public class ParkingSpot {
    
    private boolean isOccupied = false;
    private int UID;
    private int floorNumber;
    private boolean UIDFlag = false;
    
    public void setUID(int newUID){
        
        if(!UIDFlag){
            this.UID = newUID; 
            UIDFlag = true;
        }      
    }
    
    public int getUID(){
        return this.UID;
    }    
    
    public boolean isOccupied(){
        
        return this.isOccupied;
    }
    
    public void setOccupied(boolean state){
        
        this.isOccupied = state;
    }
    
    public void setFloorValue(int floor){
        this.floorNumber = floor;
    }
    
    public int getFloorValue(){
        return this.floorNumber;
    }
    
    
    
    @Override
    public boolean equals(Object obj){
    
        if(!(obj instanceof ParkingSpot)){
            return false;
        }
        if(obj == null){
            return false;
        }
        
        ParkingSpot ps = (ParkingSpot)obj;
        
        
    
        if(ps.getUID() == this.UID){
           return true;
        }
        
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.UID;
        return hash;
    }
        
      @Override
    public String toString(){
        
        return "Mjesto broj " + UID + "\nKat je " + this.getFloorValue() + "\nzauzeto: " + isOccupied;
        
    }
}
