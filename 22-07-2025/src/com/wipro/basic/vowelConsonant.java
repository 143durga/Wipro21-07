package com.wipro.basic;

public class vowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Wipro";
		int vowels=0;
		int consonants=0;
		str = str.toLowerCase(); // Convert to lowercase

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // Only check letters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
	}

}
