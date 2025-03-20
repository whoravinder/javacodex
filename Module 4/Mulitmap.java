//Create a generic MultiMap<K, V> class that stores multiple values for a single key using a HashMap<K, List<V>>. 

import java.util.*;

public class MultiMap<K, V> {
    private final Map<K, List<V>> map;

    public MultiMap() {
        this.map = new HashMap<>();
    }

    public void put(K key, V value) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }


    public List<V> get(K key) {
        return map.getOrDefault(key, Collections.emptyList());
    }


    public boolean remove(K key, V value) {
        List<V> values = map.get(key);
        if (values != null) {
            boolean removed = values.remove(value);
            if (values.isEmpty()) {
                map.remove(key);
            }
            return removed;
        }
        return false;
    }

    public void removeAll(K key) {
        map.remove(key);
    }

    public boolean containsKey(K key) {
        return map.containsKey(key);
    }


    public boolean containsValue(V value) {
        return map.values().stream().anyMatch(list -> list.contains(value));
    }

    public int size() {
        return map.size();
    }

    public Set<K> keySet() {
        return map.keySet();
    }

    public List<V> values() {
        List<V> allValues = new ArrayList<>();
        for (List<V> valueList : map.values()) {
            allValues.addAll(valueList);
        }
        return allValues;
    }


    public void clear() {
        map.clear();
    }

    @Override
    public String toString() {
        return map.toString();
    }

    public static void main(String[] args) {
        MultiMap<String, Integer> multiMap = new MultiMap<>();
        multiMap.put("A", 1);
        multiMap.put("A", 2);
        multiMap.put("B", 3);

        System.out.println("MultiMap: " + multiMap);
        System.out.println("Values for key 'A': " + multiMap.get("A"));
        System.out.println("Contains key 'B': " + multiMap.containsKey("B"));
        System.out.println("Contains value 2: " + multiMap.containsValue(2));
        multiMap.remove("A", 1);
        System.out.println("After removing 1 from 'A': " + multiMap);
    }
}
