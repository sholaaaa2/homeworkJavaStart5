package com.gmail.kukaruka52;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 6, 7, 3 };
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length / 2; i++) {
			int x = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = x;
		}
		System.out.println(Arrays.toString(arr));
	}
}
