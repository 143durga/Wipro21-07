package com.wipro.Anonymus;
import java.util.function.Function;

public class FractionalPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Double, Double> fractionalPart = n -> n - Math.floor(n);
        System.out.println(fractionalPart.apply(99.785));

	}

}
