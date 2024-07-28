package com.methodRefrence;

import java.util.Arrays;

public class ShortArray {

	public static void main(String[] args) {

		String[] names = { "Sameer Siddiqui", "Aadil Noor", "Ayaz Siddiqui", "Zaid Siddiqui" };
		Arrays.sort(names, String::compareToIgnoreCase);

		System.out.println(Arrays.toString(names));
	}

}
