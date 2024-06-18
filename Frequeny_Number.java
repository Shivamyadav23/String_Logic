import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Frequeny_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	          int [] s= {30,30,20,20,20,10	};
		
		
		TreeSet<Integer> h=new TreeSet <Integer> ();
		
		
		
		for( int i=0;i<s.length ;i++) {
			
			
			h.add(s[i]);
		
		}
		
		Iterator<Integer> iterator = h.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
		  
            int count =0;
               for(int i=0 ;i<s.length;i++) {
               	
            	   if(value ==s[i]) {
            		   
            		   
            		   count ++;
            	   }
  
               }
               
               
               System.out.println(value +" occured " + count + " times");
			
		}
	}

}
