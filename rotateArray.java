public class rotateArray {
    public static void main(String args[]){
    
        int ar[] = {1,3,7,9};
        
        int arr[] = new int[4];

        for(int i=0 ; i<4 ; i++){

            if(i+2 >=4){
                
                arr[i-2] = ar[i];

            }else{
                arr[i+2]= ar[i];
            }
        } 

        for(int i=0 ; i < 4 ; i++){
            System.out.println(arr[i]);
        }
    
    }
}
