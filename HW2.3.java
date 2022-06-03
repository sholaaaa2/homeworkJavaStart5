package com.gmail.kukaruka52;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of money in format: XXXX.XX ");
		double money = sc.nextDouble();

		int dollars = (int) money;
		int cents = (int) ((money - dollars) * 100);

		String names[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six",
				"twenty-seven", "twenty-eight", "twenty-nine", "thirty", "thirty-one", "thirty-two", "thirty-three",
				"thirty-four", "thirty-five", "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty",
				"forty-one", "forty-two", "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven",
				"forty-eight", "forty-nine", "fifty", "fifty-one", "fifty-two", "fifty-three", "fifty-four",
				"fifty-five", "fifty-six", "fifty-seven", "fifty-eight", "fifty-nine", "sixty", "sixty-one",
				"sixty-two", "sixty-three", "sixty-four", "sixty-five", "sixty-six", "sixty-seven", "sixty-eight",
				"sixty-nine", "seventy", "seventy-one", "seventy-two", "seventy-three", "seventy-four", "seventy-five",
				"seventy-six", "seventy-seven", "seventy-eight", "seventy-nine", "eighty", "eighty-one", "eighty-two",
				"eighty-three", "eighty-four", "eighty-five", "eighty-six", "eighty-seven", "eighty-eight",
				"eighty-nine", "ninety", "ninety-one", "ninety-two", "ninety-three", "ninety-four", "ninety-five",
				"ninety-six", "ninety-seven", "ninety-eight", "ninety-nine" };

		if (dollars >= 0 && dollars < 1000000000 && cents >= 0 && cents < 100) {
			System.out.print("You have: ");

			if (dollars >= 1000000) {
				if (dollars / 100000000 >= 1) {
					System.out.print(names[dollars / 100000000] + " hundreds ");
				}
				if (dollars % 100000000 / 1000000 == 0 & dollars / 100000000 >= 1) {
					System.out.print(" millions ");
				} else {
					System.out.print(names[dollars % 100000000 / 1000000] + " millions ");
				}
			}

			if (dollars >= 1000) {
				if (dollars % 1000000 / 100000 >= 1) {
					System.out.print(names[(dollars % 1000000) / 100000] + " hundreds ");
				}
				if (dollars % 100000 / 1000 == 0 & dollars % 1000000 / 100000 >= 1) {
					System.out.print(" thousands ");
				} else if (dollars % 1000000 / 1000 != 0) {
					System.out.print(names[(dollars % 100000) / 1000] + " thousands ");
				}
			}

			if (dollars >= 100) {
				if ((dollars % 1000) / 100 != 0) {
					System.out.print(names[(dollars % 1000) / 100] + " hundreds ");
				}
			}

			if (dollars % 100 != 0) {
				System.out.print(names[dollars % 100] + " dollars ");
			} else {
				System.out.print(" dollars ");
			}

			System.out.println("and " + names[cents] + " cents ");

		} else {
			System.out.println("Incorrect enter!");
		}
	}
}
