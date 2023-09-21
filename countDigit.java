public class countDigit {

    public static void main(String args[]){
    
        int[] arr = {2,45,6,89,4, 0 , -32};
        
        System.out.println(findNumbers(arr));
    
    }

    
    static int findNumbers(int[] arr ){

        int count = 0;

        for(int num : arr){
            if(even(num)){
                count++;
            }
        }

        return count;
    }
    
    
    
    
    static int digit(int num){

        if(num<0){
            num *= -1;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;
  
        while(num>0){
            count++;
            num /= 10;
        }

        return count;
        }
    


    static boolean even (int num){

        int noOfDigit = digit(num);

        return noOfDigit%2 == 0;
    }
    
}
