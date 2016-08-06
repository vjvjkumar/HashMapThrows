package loops;

public class factorial {

	public static void main(String[] args) {
		
		int f=9; 
		int total = 1;
		
		for (int i=f; i>=1; i--){
			total=total*i;
			System.out.println("factorial f: "+total);
		}

	}

}
