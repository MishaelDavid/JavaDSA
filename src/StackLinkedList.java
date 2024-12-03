public class StackLinkedList {
    public class StackClass {
        static  class Node{
            Node next;
            int data;
            public  Node(int data){
                next=null;
                this.data = data;
            }}
        static class Stack{
            static Node head;
            public Boolean isEmpty(){
                return head==null;
            }
            public void push(int data){
                Node newNode = new Node(data);
                if(isEmpty()){
                    head = newNode;
                    return;
                }
                newNode.next=head;
                head = newNode;
            }
            public int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top = head.data;
                head =head.next;
                return top;
            }
            public int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }
        }

        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(3);
            s.push(5);
            s.push(7);
            s.push(4);
            s.push(8);
            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }

        }
    }
}

