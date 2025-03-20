//Write a program to perform a binary search on a List using the Collections.binarySearch() method.
import java.util.*;

public class BinarySearchExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 8, 12, 17, 25, 33, 42, 56));
        
        
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
        
        int key = 25;
        int index = Collections.binarySearch(numbers, key);
        
        if (index >= 0) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found. Insertion point: " + (-index - 1));
        }
    }
}