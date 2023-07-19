            // check vowel consonant 

package javaNumberUsing;

import java.util.*;

public class Check {

	public static void main(String[] args) {

		char ch;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter any character:-");
		ch = r.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("This is  vowel ! ");
		} else {
			System.out.println("This is consonant ! ");
		}
		r.close();
	}

}
