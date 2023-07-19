
           //SumNaturalNumbers

package javaNumberUsing;

import java.util.*;

public class SumNaturalNumbers {

	public static void main(String[] args) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of term:- ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Addition of Natural Numbers:-" + sum);
		sc.close(); 
	}
}
