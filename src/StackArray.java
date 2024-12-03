import java.util.*;

public class StackArray {

    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();  // No static modifier

        // Instance method to check if the stack is empty
        public Boolean isEmpty(){
            return list.size() == 0;
        }

        // Instance method to push an element onto the stack
        public void push(int data){
            list.add(data);
        }

        // Instance method to pop an element from the stack
        public int pop(){
            if(isEmpty()){
                return -1;  // Return -1 if stack is empty
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Instance method to peek at the top element of the stack
        public int peek(){
            if(isEmpty()){
                return -1;  // Return -1 if stack is empty
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        Stack s = new Stack();
        s.push(3);
        s.push(5);
        s.push(7);
        s.push(4);
        s.push(8);

        // Print the elements in the stack, from top to bottom
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
