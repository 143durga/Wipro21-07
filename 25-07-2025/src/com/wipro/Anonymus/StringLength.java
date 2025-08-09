package com.wipro.Anonymus;
import java.util.function.Function;
import java.util.*;
import java.util.function.Function;

public class StringLength {
    public static void main(String[] args) {
        Function<List<String>, List<Integer>> getLengths = list -> {
            List<Integer> result = new ArrayList<>();
            for (String s : list) {
                result.add(s.length());
            }
            return result;
        };

        List<String> input = Arrays.asList("Jayanta", "Amit", "Vasu");
        List<Integer> output = getLengths.apply(input);

        System.out.println(output);
    }
}
