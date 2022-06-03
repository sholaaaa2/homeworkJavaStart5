package com.gmail.kukaruka52;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 0, 5, 2, 4, 7, 1, 3, 19 };
		int counter = 0;
		for (int i : arr) {
			counter = (i % 2 != 0) ? counter + 1 : counter;
		}
		System.out.println(counter);
	}
}
