// sum of even or odd numbers

package javaNumberUsing;

import java.util.*;

public class EvenOrOdd {

	public static void main(String[] args) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE RANGE:- ");
		n = sc.nextInt();
		if (n % 2 == 0) {
			for (int i = 0; i <= n; i = i + 2) {
				sum = sum + i;
			}
			System.out.println("Sum of even numbers :-" + sum);
		} else {
			for (int i = 1; i <= n; i = i + 2) {
				sum = sum + i;
			}
			System.out.println("sum of odd numbers :-"+sum);
		}
		sc.close();
	}
}
