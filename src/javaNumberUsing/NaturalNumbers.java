// print n natural numbers 

package javaNumberUsing;

import java.util.*;

public class NaturalNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  number of terms-");
		int n = sc.nextInt();
		System.out.println("Natural Numbers:- ");
		for (int i = 0; i <= n; i++) {

			System.out.println(i + " ");
		}
		sc.close();
	}

}
