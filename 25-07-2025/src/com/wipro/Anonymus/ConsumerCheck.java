package com.wipro.Anonymus;
import java.util.function.Consumer;

public class ConsumerCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> nextEven = n -> System.out.println(n % 2 == 0 ? n + 2 : n + 1);
		nextEven.accept(100);


	}

}
