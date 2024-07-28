package com.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExampleUsingList {
	
	public static void main(String[] args) {
		
		Supplier<List<String>> supplierFruits = ArrayList::new;
		
		List<String> fruits = supplierFruits.get();
		
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Graps");
		fruits.add("Orange");
		
		fruits.forEach(System.out::println);
		
		Supplier<Long> timeSupplier = System::currentTimeMillis;
		
		Long currentTime = timeSupplier.get();
		
		System.out.println("Current Time : " + currentTime);
		
		
		
		
	}

}
