package com.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
	public static void main(String[] args) {
		
		List<String> list = List.of("Mumbai", "Pune", "Delhi", "Lucknow", "Gujrat", "Ahmedabad");
		// filter method (predicate means boolean value function)
		
		List<String> cityList = list.stream().filter(i -> i.contains("a")).collect(Collectors.toList());
		System.out.println(cityList);

		
	}

}