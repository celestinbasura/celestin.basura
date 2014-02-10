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
public class Parking {
    
   
   private int totalSpaces;
    
    public void generate(int numberOfFloors){
        
        int numberOfPlaces = 30 + (int)(Math.random()*20);
        totalSpaces = numberOfFloors * numberOfPlaces;
        System.out.println(totalSpaces);
        ps = new ParkingSpot[totalSpaces];
        this.generateUID();
        for(int i = 0; i < totalSpaces; i++) {
            
            ps[i].setFloorValue((int)i/numberOfPlaces);
            ps[i].setOccupied(true);
        }      
    }
    
    private ParkingSpot[] ps;
    
  
    public void generateUID(){
        for(int i = 0; i < ps.length; i++){
            ps[i] = new ParkingSpot();
            ps[i].setUID(i);
            
            
        }
        
    }    
    public int freeSpotsOnFloor(int floorNumber){
        
        int spacesOnFloor = 0;
        for(int i = 0; i < ps.length; i++){
            if(ps[i].getFloorValue() == floorNumber && !ps[i].isOccupied()){
                spacesOnFloor++;               
            }
        }
        return spacesOnFloor;
    }
    public int getTotalSpaces(){
        
        return this.totalSpaces;
    }
   
   @Override
 public String toString(){
     
     StringBuilder sb = new StringBuilder();
     sb.append(ps.length);
     for(int i = 0; i < ps.length; i++){
        
     sb.append(ps[i].toString()).append("\n");
     }
     return sb.toString();
     
 }
}
