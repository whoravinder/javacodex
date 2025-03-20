public class copylist {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------");
        System.out.printf("| %-20s | %-20s | %-20s |%n", "Feature", "ArrayList", "CopyOnWriteArrayList");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("| %-20s | %-20s | %-20s |%n", "Synchronization", "Not thread-safe", "Thread-safe");
        System.out.printf("| %-20s | %-20s | %-20s |%n", "Performance", "Fast for read/write", "Slower for writes");
        System.out.printf("| %-20s | %-20s | %-20s |%n", "Concurrency Handling", "Needs external sync", "No need for sync");
        System.out.printf("| %-20s | %-20s | %-20s |%n", "Modification", "Modifies directly", "Creates a copy on write");
        System.out.printf("| %-20s | %-20s | %-20s |%n", "Usage", "Single-threaded", "Multi-threaded");
        System.out.println("-----------------------------------------------------------");
    }
}
