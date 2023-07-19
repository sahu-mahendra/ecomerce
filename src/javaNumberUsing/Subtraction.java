//     Subtraction two number

package javaNumberUsing;

import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) {
		int subtraction = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two decimal number:-");

		int a = sc.nextInt();
		int b = sc.nextInt();
		subtraction = a - b;
		System.out.println("Addition two numbers:-" + subtraction);

		sc.close();

	}

}
