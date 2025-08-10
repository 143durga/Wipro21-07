package com.wipro.basic;

public class Secondlargest {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 15};
        int largest = numbers[0];
        int second = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                second = largest;
                largest = numbers[i];
            } else if (numbers[i] > second && numbers[i] != largest) {
                second = numbers[i];
            }
        }

        System.out.println("Second largest number is: " + second);
    }
}
