package loops;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		System.out.println("Please enter a String: ");
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		System.out.println("Total Characters are :" + str.length());
		
		for (int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}

	}

}
