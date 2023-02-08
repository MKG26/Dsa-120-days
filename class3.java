

import java.util.* ;
import java.io.*; 
public class class3 {
	public static int countSetBits(int n) {
			
		
			int count =1;

			int x = n & (n-1);

			while(x!=0){

				x= x&(x-1);
				count++;
			}

			return count;

			

	}

    public static void main(String args[]){
    
        int n= 5;

        countSetBits(n);
    
    }
}