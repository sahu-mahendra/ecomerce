//     Addition two number

package javaNumberUsing;

import java.util.*;

public class Addtiton {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two decimal number:-");

		int a = sc.nextInt();
		int b = sc.nextInt();
		sum = a + b;
		System.out.println("Addition two numbers:-" + sum);

		sc.close();
	}

}
