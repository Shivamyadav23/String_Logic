import java.lang.reflect.Array;
import java.util.Arrays;

public class Anangram_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="shiva";
		String s2="vais";
		
		if(s1.length()!=s2.length()) {
			
			System.out.println("this is not anagram ");
		}
		
		
		char [] f=s1.toCharArray();
		char [] s=s2.toCharArray();
		
     Arrays.sort(f);
	Arrays.sort(s);
	
	if(Arrays.equals(f, s)) {
		System.out.println("anaygram number" );
	}
	

	}

}
