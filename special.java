import java.util.* ;
import java.io.*; 

public class special {

	public static boolean checkPalindrome(String str) {

	

			for(int i=0 ; i< str.length(); i++){
			    
			    int val = str.charAt(i);
			    
			    if(val>=32 && val<=47 ){
			        StringBuilder sb = new StringBuilder(str);
			        
			        sb.deleteCharAt(i);
			        
			        i--;
			         str = sb.toString();
			    }
			}
			
			for(int i=0 ; i< str.length(); i++){
			    
			    int val = str.charAt(i);
			    
			    if(val>=58 && val<=64 ){
			        StringBuilder sb = new StringBuilder(str);
			        
			        sb.deleteCharAt(i);
			        
			        str = sb.toString();
			        i--;
			    }
			}
			
			str = str.toLowerCase();
			
			int s_pointer = 0 ;

			int e_pointer = str.length() -1;

			int run = str.length()/2;

			int j=0,count=0;
			
			
			while(j<run){
				
				int val1 = str.charAt(s_pointer);
				int val2 = str.charAt(e_pointer);

				if(val1 == val2){
				   count++;

				   j++;
				   s_pointer++;
				   e_pointer--;
				   
				}else{
					return false;
				}
			}

			return count==run;
	}
	
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    
	    String a = sc.nextLine();
	    
	    boolean b = checkPalindrome(a);
	    
	    System.out.println(b);
	}
}