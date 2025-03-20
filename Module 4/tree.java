import java.util.Map;
import java.util.TreeMap;

public class Tree {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        
        // Adding key-value pairs
        treeMap.put(5, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(8, "Cherry");
        treeMap.put(1, "Date");
        treeMap.put(4, "Elderberry");
        
        // Displaying the sorted TreeMap
        System.out.println("Sorted TreeMap (by keys):");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}