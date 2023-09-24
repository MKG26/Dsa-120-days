public class mountainArrayy {

    public static void main(String args[]){
    
        int arr[] = {0, 2, 1 ,0};

        int i = 0;
        int j = 1;

        while(j<arr.length){

            if(arr[i]< arr[j]){

                i++;
                j++;
            }
            else{

                System.out.println(i);
                j = arr.length;
            }
        }
    
    }
    
}
