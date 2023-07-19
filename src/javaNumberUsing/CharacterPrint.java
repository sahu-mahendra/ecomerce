//  char print user  input 

package javaNumberUsing;

import java.util.*;

public class CharacterPrint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please emter any character:-");
		String name = sc.nextLine();

		System.out.println(name);
		sc.close();
	}

}
