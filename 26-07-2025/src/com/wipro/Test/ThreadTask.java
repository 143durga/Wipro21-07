package com.wipro.Test;

import java.util.Arrays;
import java.util.List;

public class ThreadTask {
    private List<String> names = Arrays.asList("Amit", "Jayanta", "Anu", "Durga");

    public Runnable capitalizeVowels = () -> {
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            char firstChar = Character.toLowerCase(name.charAt(0));
            if ("aeiou".indexOf(firstChar) != -1) {
                names.set(i, name.toUpperCase());
            }
        }
    };

    public Runnable lowercaseConsonants = () -> {
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            char firstChar = Character.toLowerCase(name.charAt(0));
            if ("aeiou".indexOf(firstChar) == -1) {
                names.set(i, name.toLowerCase());
            }
        }
    };

    public List<String> getNames() {
        return names;
    }
}
