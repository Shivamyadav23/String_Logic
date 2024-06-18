import java.util.HashSet;
import java.util.Iterator;

public class Frequency_String {

	public static void main(String[] args) {
	
		
		
		
		String s="Shibama";
		
		
		HashSet<Character> h=new HashSet<Character> ();
		
		
		
		for( int i=0;i<s.length() ;i++) {
			
			 h.add(s.charAt(i));
			
			
		}
		
		Iterator<Character> iterator = h.iterator();
        while (iterator.hasNext()) {
            Character value = iterator.next();
		  
            int count =0;
               for(int i=0 ;i<s.length();i++) {
               	
            	   if(value ==s.charAt(i)) {
            		   
            		   
            		   count ++;
            	   }
  
               }
               
               
               System.out.println(value +" occured " + count + " times");
			
		}

	}
}


