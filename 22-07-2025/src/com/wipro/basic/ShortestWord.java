package com.wipro.basic;

public class ShortestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Sentance="An anagram is a word or phrase";
		String[] words= Sentance.split(" ");
		String shortWord=words[0];
		for(int i=1;i<words.length;i++) {
			if(words[i].length()<shortWord.length()) {
				shortWord=words[i];
			}
		}
    System.out.println(shortWord);
	}

}
