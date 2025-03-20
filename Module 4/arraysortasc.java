import java.util.*;

public class arraysortasc {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        // Adding elements to the list
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        
        // Sorting alphabetically
        Collections.sort(list);
        System.out.println("Alphabetically sorted list: " + list);
        
        // Sorting in reverse alphabetical order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse alphabetically sorted list: " + list);
    }
}