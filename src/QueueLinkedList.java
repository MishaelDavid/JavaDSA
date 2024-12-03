class QueueLinkedList {
    private class Node {
        int data;
        Node next;
    }
    private Node front = null, rear = null;

    // Add element to the queue (enqueue)
    public void enqueue(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (rear == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }
    // Remove and return the front element (dequeue)
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int dequeued = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return dequeued;
    }

    // Return the front element without removing it (peek)
    public int peek() {
        if (front == null) {
            return -1;
        }
        return front.data;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.peek()); // Output: 1
        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.isEmpty()); // Output: false
    }
}
