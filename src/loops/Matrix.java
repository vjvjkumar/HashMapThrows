package loops;

public class Matrix {

	public static void main(String[] args) {
		
		System.out.println("Find the Matrix below: ");
		
		for (int i=1; i<=9; i=i+3){
			for (int j=i; j<=i+2; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
