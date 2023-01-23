import java.util.* ;
import java.io.*; 
class conversion {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int e = sc.nextInt();

		int st = sc.nextInt();

		

		for(; s<=e ; s=s+st){
			double k=0;
			k = (s-32)*0.5556;

			System.out.println(s+"\t"+(int)k);
		}
		
		
	}
}
