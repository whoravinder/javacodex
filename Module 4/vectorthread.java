import java.util.*;

class vectorthread implements Runnable {
    private static Vector<Integer> vector = new Vector<>();

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            vector.add(i);
            System.out.println(Thread.currentThread().getName() + " added: " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new vectorthread(), "Thread-1");
        Thread t2 = new Thread(new vectorthread(), "Thread-2");
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Final Vector: " + vector);
    }
}