import java.util.HashMap;
import java.util.Map;

public class First_No_Repeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s = "shibaab";
//		Map<Character, Integer> countMap = new HashMap<>();
//
//		// Count occurrences of each character
//		for (char c : s.toCharArray()) {
//		    countMap.put(c, countMap.getOrDefault(c, 0) + 1);
//		}
//
//		// Print non-repeating characters
//		System.out.println("Non-repeating characters:");
//		for (char c : s.toCharArray()) {
//		    if (countMap.get(c) == 1) {
//		        System.out.println(c);
//		    }
//		}
		
		String s = "shibaab";
		Map<Character, Integer> countMap = new HashMap<>();

		// Count occurrences of each character
		for (char c : s.toCharArray()) {
		    countMap.put(c, countMap.getOrDefault(c, 0) + 1);
		}

		// Print repeating characters
		System.out.println("Repeating characters:");
		for (char c : s.toCharArray()) {
		    if (countMap.get(c) > 1) {
		        System.out.println(c);
		    }
		}
		
		
		

				
				
				
				
				
				
			

	}

}
