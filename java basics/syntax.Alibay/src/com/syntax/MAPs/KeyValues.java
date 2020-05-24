package com.syntax.MAPs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyValues {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        map.put("Items", "Apple");
        map.put("Price", 20.0);
        map.put("Quantity", 10);

        // Get keys and values
        System.out.println("========1=========");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String k = entry.getKey();
            Object v = entry.getValue();
            System.out.print("Key : ");
            System.out.println(k + ": " + v);
        }

        // Get all keys
        System.out.println("=========2=========");
        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println("Key: " + k);
        }

        // Get all values
        System.out.println("=========3=========");
        Collection<Object> values = map.values();
        for (Object v : values) {
            System.out.println("Items:" + v);
        }

        // Java 8
        System.out.println("==========4=========");
        map.forEach((k, v) -> {
            System.out.println("Key: "); //"Key: " + k + ", Value: " + v
            System.out.println(k + ": " + v);
        });

    }
}
