package collections;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}


class LinkedList{

    Node head = null;

    public void addLast(int data){

        Node newNode = new Node(data);

        Node current = head;
        if(head == null){
            head = newNode;
        }
        else{
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }


    }
    public void printValues(){

        Node current = head;

        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public void deleteFirst(){
        if(head == null){
            System.out.print("the list is empty");
        }
        else{
            head = head.next;
        }
    }
    public void deleteLast(){
        if(head == null){
            System.out.print("the list is empty");
        }
        else{
            Node current = head;

            while(current.next != null && current.next.next !=null ){
                current = current.next;
            }
            current.next = null;
        }
    }
    public void deleteData(int data){
        if(head == null){
            System.out.print("the list is empty");
        }
        else{
            Node current = head;

            while(current.next.data != data){
                current = current.next;
            }
            current.next = current.next.next;
        }
    }
}

class Main {
    public static void main(String[] args) {

        LinkedList li = new LinkedList();

        System.out.println("Adding nodes");
        li.addLast(50);
        li.addLast(59);
        li.addLast(56);
        li.addLast(66);
        li.addLast(69);
        li.addLast(72);

        li.printValues();

        System.out.println("Deleting first node");
        li.deleteFirst();
        li.printValues();

        System.out.println("Deleting last node");
        li.deleteLast();
        li.printValues();

        System.out.println("Deleting specific Node");
        li.deleteData(56);
        li.printValues();
    }

}