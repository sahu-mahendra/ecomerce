// even numbers 

package javaNumberUsing;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  number of terms-");
		int n = sc.nextInt();

		System.out.println("EVEN  Numbers:-");
		for (int i = 0; i <= n; i = i + 2) {
			System.out.println(i + " ");
		}
		sc.close();
	}

}
