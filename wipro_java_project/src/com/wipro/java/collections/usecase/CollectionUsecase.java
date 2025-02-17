package com.wipro.java.collections.usecase;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class CollectionUsecase {
    public static void main(String[] args) {
        // Creating  a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(101, "John");
        treeMap.put(103, "Alice");
        treeMap.put(102, "Bob");
        treeMap.put(105, "Charlie");
        treeMap.put(104, "David");

        // Displaying the original TreeMap (sorted order)
        System.out.println("TreeMap (Sorted Order):");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Creating a HashMap and copying data from TreeMap
        HashMap<Integer, String> hashMap = new HashMap<>(treeMap);

        // Displaying the HashMap (Unordered)
        System.out.println("\nHashMap (Unordered):");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
