package javaNumberUsing;

import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any decimal number 0 to 9:-");
		int number = sc.nextInt();
		int reverse = 0;
		while (number != 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println("The Reverse of given number :-" + reverse);
		sc.close();
	}
}
