public class rotateArray {
    public static void main(String args[]){
    
        int ar[] = {1,3,7,9};
        
        int arr[] = new int[4];

       
        for(int i=0 ; i<4 ; i++){
            int k =0;
            if(i+3 >=4 ){
                
                k=(i+3)%4 ;

                arr[k]=ar[i];

            }else{
                arr[i+3]= ar[i];
            }
        } 

        for(int i=0 ; i < 4 ; i++){
            System.out.println(arr[i]);
        }
    
    }
}
