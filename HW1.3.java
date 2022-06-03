package com.gmail.kukaruka52;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[15];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		int[] arr2 = Arrays.copyOf(arr, 30);
		for (int i = 0; i < arr2.length / 2; i++) {
			arr2[arr2.length / 2 + i] = arr2[i] * 2;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
