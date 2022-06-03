package com.gmail.kukaruka52;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		int counter = 0;
		System.out.println("Enter text");
		text = sc.nextLine();
		char[] textArr = text.toCharArray();
		for (char c : textArr) {
			counter = (c == 'b') ? counter + 1 : counter;
		}
		System.out.println("In text - " + text + ", b - " + counter + " times");
	}
}
