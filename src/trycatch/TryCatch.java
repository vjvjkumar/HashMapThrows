package trycatch;

public class TryCatch {

	public static void main(String[] args) {
		
		int num1, num2;
		
		try {
			num1 = 0;
			num2 = 15 / num1;
			
			System.out.println("Try block message");
		
		}catch (ArithmeticException e) {
			
			System.out.println("Cannot divide a number by ZERO");
		}
			System.out.println("Now I am out of trycatch block");
	

	}

}
