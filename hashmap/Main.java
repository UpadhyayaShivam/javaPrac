package hashmap;

import java.util.*;


public class Main {
    
    public static void main(String []args){


        HashMap <Integer,Character> pracMap = new HashMap<>();

        pracMap.put(1,'a');
        pracMap.put(2,'b');
        pracMap.put(3,'c');

        int sizeOfMap =pracMap.size();
        System.out.println("size :" + sizeOfMap);
       
        
        boolean isContainsKey = pracMap.containsKey(1);
        System.out.println("answer :" + isContainsKey);

        // char valueOfMap = pracMap.values();
        // System.out.println("values " + valueOfMap);

        // int getValue = pracMap.get('a');
        // System.out.print("value of first character :" + getValue);

    }
    
}
