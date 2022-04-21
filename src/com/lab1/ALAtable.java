package com.lab1;

import java.util.LinkedHashMap;

public class ALAtable {
    private static LinkedHashMap<String, String> ALA = new LinkedHashMap<String, String>();
    private static int index = 0;

    public static void add(String arguments) {
        index++;
        ALA.put(Integer.toString(index), arguments);
    }

    public static void printALA() {
        for (String key : ALA.keySet()) {
            System.out.println(key + " " + ALA.get(key));
        }
    }

    public static LinkedHashMap<String, String> getALA() {
        return ALA;
    }
    
}
