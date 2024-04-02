public class k28f {

    public static void main(String[] args) {


        System.out.println(searchIn(new int[] {5,6,1,2,3}, 7, 0, 4));
    }

    static int searchIn(int[] arr, int target, int s , int e){

        if(s > e){
            return -1;
        }


        int m = s + (e-s)/2;

        if(arr[m] == target){
            return m;
        }



        if(arr[s] <= arr[m]){

            if(target <= arr[m] && target >= arr[s]){

                return searchIn(arr,target,s, m-1);
            }
            else{
                return searchIn(arr, target, m+1, e);
            }
        }

        if(target >= arr[m] && target <= arr[e] ){
            return searchIn(arr, target, m+1, e);
        }

         return searchIn(arr,target, s , m-1);
    }
}
