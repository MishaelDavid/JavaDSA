
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        HashMap <Integer,String> map = new HashMap<>();
        //Insertion
        map.put(400,"Mom");
        map.put(6,"karthik");
        map.put(450,"Shalaka");
        map.put(1000,"Anithanty");


        //delete
        map.remove(2);

        //Search
        if(map.containsKey(3)){
            System.out.println("key 3 is present");
        }
        else{
            System.out.println("Key 3 is not present ");
        }

        //Iterator
        for(Map.Entry<Integer,String> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Size
        System.out.println("map size is "+map.size());

        System.out.println("Money you should recieve:");
        int sum =0;
        for(Map.Entry<Integer,String> e: map.entrySet()){
            sum = sum +e.getKey();
        }
        System.out.println(sum);
    }
}
