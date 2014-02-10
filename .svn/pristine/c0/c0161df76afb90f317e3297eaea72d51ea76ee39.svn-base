package Poglavlje16.Primjeri;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class KolekcijeBasics {
    
    public static void main(String[] args) {
        lists(10);
        sets(10);
        maps(10);
    }
    
    public static void lists(final int elSize) {
        
        List<Integer> intList = new LinkedList<>();
        
        for(int i = 0; i < elSize; i++) {
            intList.add((int)(Math.random() * elSize * 100));                    
        }
        
        List<Integer> subList = intList.subList(2, 8);        
        System.out.println(intList);
        System.out.println(subList);
        
        intList.add(12);
        intList.add(6, 122);
        System.out.println(intList);
    }
    
    public static void sets(final int elSize) {
    
        Set<NoHash> intSet = new TreeSet<>(); // probati sa HashSet
        
        intSet.add(new NoHash(12));
        intSet.add(new NoHash(12));
        intSet.add(new NoHash(12));
        intSet.add(new NoHash(12));
        intSet.add(new NoHash(12));
        intSet.add(new NoHash(12));
        System.out.println(intSet);        
    }
    
    public static void maps(final int elSize) {
        
        Map<Integer, String> someMap = new HashMap<>();
        
        someMap.put(12, "dva jedan");
        someMap.put(12, "dva dva");
        System.out.println(someMap);
        
    }
    
}

class NoHash implements Comparable<NoHash> {
    
    private int test;

    public NoHash(int test) {
        this.test = test;
    }

    public int getTest() {
        return test;
    }
    
    @Override
    public int hashCode() {
        return (int)(Math.random() * 1000);
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final NoHash other = (NoHash) obj;
        if (this.test != other.test) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return String.format("%d", test);
    }

    @Override
    public int compareTo(NoHash o) {
       if(o == null)
           throw new IllegalArgumentException();
       
       return Integer.compare(this.test, o.test);
    }
    
}
