import java.util.* ;
import java.io.*; 
public class arraySum {
	public static void main(String args[]) {


                int a[] = {1 ,2, 4,5};
                int b[] = {7, 9, 5, 4};

                int n= 4;
                int m= 4;


			List<Integer> ans = new ArrayList<Integer>();

				int i = n-1;
				int j = m-1;

				int carry = 0;

				while(i>=0 && j>=0){

					int sum = a[i] + b[j] + carry;

					carry = sum / 10;

					sum = sum%10;

					ans.add(sum);

					i--;
					j--;

				}

				while(i>=0){
					int sum = a[i] + carry;

					carry = sum /10;

					sum = sum %10;

					ans.add(sum);

					i--;
				}

				while(j>=0){
					int sum = b[j] + carry;

					carry = sum /10;

					sum = sum %10;

					ans.add(sum);

					j--;
				}

				while(carry!= 0){
					int sum = carry;

					carry = sum/10;

					sum = sum%10;

					ans.add(sum);
				}

				int arr[] = new int[ans.size()];

				for(int h=0 ; h<ans.size() ; h++ ){
					
					arr[h] = ans.get(ans.size()-1-h);

				}

				for(int g =0 ; g<arr.length ; g++){

                    System.out.print(arr[g]+ " ");
                }
	}
}
