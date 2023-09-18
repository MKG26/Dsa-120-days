public class min {

    public static void main(String args[]){
    
        int[] arr = {6,65,34,9,2,-1,4,89};

        System.out.println(minVal(arr));

        }


    

        static int minVal(int[] arr){

            int minn = arr[0];

            for(int i=1; i<arr.length; i++){

                if(arr[i]<minn){

                    minn = arr[i];
                }
                
            }

            return minn;
        }
    
}
