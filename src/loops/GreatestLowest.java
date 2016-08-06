package loops;

public class GreatestLowest {

	public static void main(String[] args) {
		int num[] = new int[] {10, 20, 30, 40, 50};
		
		int high = num[0];
		int low = num[0];
		
		for (int i=0; i<=4; i++){
			if (high<num[i]){
				high = num[i];
			}
			else if (low>num[i]){
				low = num[i];
			}
		}
		
		System.out.println("greater value is: "+high);
		System.out.println("lowest value is : "+low);
	}

}
