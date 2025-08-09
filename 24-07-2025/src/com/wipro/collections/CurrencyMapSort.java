package com.wipro.collections;
import java.util.TreeMap;
import java.util.Map;
public class CurrencyMapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> currency = new TreeMap<>();
		currency.put("USD","United States Dollar");
		currency.put("INR","Indian Rupee");
		currency.put("EUR","Euro");
		
		for (Map.Entry<String, String> entry : currency.entrySet()) {
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }
		
		



	}

}
