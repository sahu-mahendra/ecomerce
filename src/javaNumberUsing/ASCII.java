//ASCII number print \

package javaNumberUsing;

import java.util.*;

public class ASCII {

	public static void main(String[] args) {
		char ch;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter any character:-");
		ch = r.next().charAt(0);

		int a = ch;
		System.out.println("ASCII value of "  +  ch  + " is "  + a);
	}

}
