package collections;
import java.util.*;

public class  Arrraylist {
    public static void main(String args[]) {

        // Creating an ArrayList of String type
        ArrayList<String> al = new ArrayList<String>();

        // 1. Addition

        // Adding elements to ArrayList at the end
        al.add("Geeks");
        al.add("Geeks");

        System.out.println("Original List: " + al);

        // Adding elements at the specific index
        al.add(1, "For");

        System.out.println("After Adding element at index 1: " + al);

        // 2. Deletion of Element

        // Removing element using index
        al.remove(0);

        System.out.println("Element removed from index 0: " + al);

        // Removing element using the value
        al.remove("Geeks");

        System.out.println("Element 'Geeks' removed: " + al);

        // 3. Updating Values

        // Updating value at index 0
        al.set(0, "GFG");

        // Printing all the elements in an ArrayList
        System.out.println("List after updation of value: " + al);
    }

}
