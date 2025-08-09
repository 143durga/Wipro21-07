package com.wipro.Test;
import com.wipro.collections.Box;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> stringBox = new Box<>();
		stringBox.setItem("Durga");
		System.out.println(stringBox.getItem());

		Box<Integer> intBox = new Box<>();
		intBox.setItem(354);
		System.out.println(intBox.getItem());
	}

}
