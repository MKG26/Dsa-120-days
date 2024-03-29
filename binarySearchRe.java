public class binarySearchRe {
    

    public static void main(String args[]){
    
        int[] arr = {0,1,2,3,4,5};

        System.out.println(BS(arr, 2, 0, 6));
    
    }

    static int BS(int arr[] , int target, int s , int e){

        if(s>e){
            return -1;
        }

        int m = s + ((e-s)/2);

        if(arr[m] == target){

            return m;
        }

        if(arr[m] < target){
            return BS(arr, target, m +1, e);
        }

        return BS(arr, target, s, m-1);
    }
}
