package hashMapProg;

import java.util.HashMap;
import java.util.Map;

public class HashMapping {

	public static void main(String[] args) {
		System.out.println("HashMap prog Started: ");
		
		HashMap<Integer, String> HMap= new HashMap<Integer, String>();
		
		HMap.put(1, "apple");
		HMap.put(2, "bat");
		HMap.put(3, "cat");
		HMap.put(4, "dog");
		HMap.put(5, "elephant");
		
		System.out.println(HMap.size());
		System.out.println(HMap.get(3));
		
		for (Map.Entry<Integer, String> entry : HMap.entrySet()){
			
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key+ "=" +value);
			
			
		}
	}

}
