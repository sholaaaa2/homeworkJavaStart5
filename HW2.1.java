package com.gmail.kukaruka52;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[][] array = new int[][] { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 },
				{ 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };
		int temp;
		for (int k = 0; k <= 270; k += 90) {
			System.out.println("Matrix " + k + " degrees");
			for (int[] is : array) {
				System.out.println(Arrays.toString(is));
			}

			System.out.println();
			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array[i].length - i; j++) {
					temp = array[j][array.length - 1 - i];
					array[j][array.length - 1 - i] = array[i][j];
					array[i][j] = array[array[i].length - 1 - j][i];
					array[array[i].length - 1 - j][i] = array[array.length - 1 - i][array[i].length - 1 - j];
					array[array.length - 1 - i][array[i].length - 1 - j] = temp;
				}
			}
		}
	}
}
