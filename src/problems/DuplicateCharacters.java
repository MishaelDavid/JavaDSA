package problems;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class DuplicateCharacters {
        public static void main(String[] args) {

            String str = "hello there, my name mishael david";

            HashMap<Character,Integer> map = new HashMap<>();

            //populate hashmap
            char[] ch = str.toCharArray();
            for(char c: ch ){

                map.put(c,map.getOrDefault(c,0)+1);

            }
            System.out.println("duplicate characters are");
            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                if(entry.getValue()>1){

                    System.out.println(entry.getKey()+" : "+entry.getValue());
                }

            }

            System.out.println("Unique chars");

            for(Map.Entry<Character,Integer> entry : map.entrySet()){

                if(entry.getValue() ==1){

                    System.out.println(entry.getKey());
                }}


        }
    }

