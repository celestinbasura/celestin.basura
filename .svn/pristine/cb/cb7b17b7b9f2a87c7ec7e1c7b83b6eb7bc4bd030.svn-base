/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje10.Vjezbe.DecimalByte;

/**
 *
 * @author Celestin
 */
public class DecimalByte extends  Number{
    
    private final double numb;
    
    public DecimalByte(double broj){
        
        this.numb = broj % 128;
    }
    
    
     @Override
     public  int intValue(){
         return (int)numb;
         
     }
    @Override
     public long longValue(){
         return (long)numb;
         
     }
    @Override
     public float floatValue(){
         return (float)numb;
         
     }
    @Override
     public double doubleValue(){
         return numb;         
     }
    @Override
     public String toString(){
       return "int value  " +  this.intValue() + 
               "\nlong value " + this.longValue() + 
               "\nfloat value " + this.floatValue() + 
               "\ndouble value " + this.doubleValue();
         
     }
    public static void main(String[] args) {
        Number d = new DecimalByte(234.345454);
        System.out.println(d.toString());
    }
}
