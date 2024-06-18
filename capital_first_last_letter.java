



import java.util.Scanner;
public class capital_first_last_letter {

	
	
		public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
	
		
		
		System.out.println("enter the value");

		
		String s=sc.nextLine();
		
		
		
		
		char c[]=s.toCharArray();
		
		
		c[0]=Character.toUpperCase(c[0]);
		
		c[c.length-1]=Character.toUpperCase(c[c.length-1]);  
         
         System.out.println(c);
			
			
			
			
//			
//			if(Character.isLowerCase(s.lastIndexOf(s))) {
//				
//				   Character.toUpperCase(s.charAt(i)) ;
//				
//				
//			}
//			
//					}
		
		

		
		
		
		
		
	}

}
