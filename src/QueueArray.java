class QueueArray {
    private int arr[];
    private int front, rear, capacity;
    // Constructor to initialize queue
    QueueArray(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }
    // Add element to the queue (enqueue)
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        arr[++rear] = data;
    }
    // Remove and return the front element (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front++];
    }
    // Return the front element without removing it (peek)
    public int peek() {
        if (!isEmpty()) {
            return arr[front];
        }
        return -1;
    }
    // Check if the queue is empty
    public boolean isEmpty() {
        return front > rear;
    }
    // Check if the queue is full
    public boolean isFull() {
        return rear == capacity - 1;
    }
    public int size() {
        return rear - front + 1;
    }
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.peek()); // Output: 1
        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.size());   // Output: 2
    }
}

