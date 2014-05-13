package edu.gmu.bah.class14.lab3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 5/13/14.
 */
public class MapExample {
    public static void main(String[] args){
        Map<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("Bob", 42);
        ages.put("Alice", 23);
        ages.put("John", 71);
        System.out.println(ages);
    }

}
