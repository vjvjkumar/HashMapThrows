package trycatch;

public class MultipleCatch {

	public static void main(String[] args) {
		
		try {
			int num [] = new int[7];
			num [4] = 15/0;
			
			System.out.println("First Statement in try block: ");
		}
		catch(ArithmeticException e){
			System.out.println("Warning: ArithmeticException: ");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Warning: ArrayIndexOutOfBoundsException :");
		}
		catch(Exception e){
			System.out.println("Warning: any other Exception: ");
		}
			System.out.println("out of trycatch block");
	}

}
