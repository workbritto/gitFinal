package com.jenkingit;

public class ThirdProgram {
	public static void main(String[] args) {
		String[] s = {" India  is  our         country"};
		for (String x : s) {
			System.out.println(x.replaceAll("\\s+", " "));
		}
		System.out.println("All the best");
		System.out.println("Success is near to you");
	}
}
