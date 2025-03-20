import java.util.LinkedList;

class SimpleQueue<T> {
    private LinkedList<T> queue;

    public SimpleQueue() {
        queue = new LinkedList<>();
    }

    
    public void enqueue(T item) {
        queue.addLast(item);
        System.out.println("Enqueued: " + item);
    }

    
    public T dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        T item = queue.removeFirst();
        System.out.println("Dequeued: " + item);
        return item;
    }

    
    public T peek() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return queue.getFirst();
    }

    
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    
    public void displayQueue() {
        System.out.println("Queue: " + queue);
    }

    public static void main(String[] args) {
        SimpleQueue<Integer> queue = new SimpleQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.displayQueue();
        queue.dequeue();
        queue.displayQueue();
        System.out.println("Front element: " + queue.peek());
    }
}
