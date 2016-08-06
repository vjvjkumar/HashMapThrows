package loops;

import java.util.Scanner;

public class factorialScanner {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a Number: ");
		
		Scanner scan = new Scanner (System.in);
		int f = scan.nextInt();
		int total = 1;
		
		for (int i=f; i>=1; i--){
			total=total*i;
			}
		System.out.println(total);
		
	}

}
