package com.gmail.kukaruka52;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter size");
		size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i + 1) + " num");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}
}
