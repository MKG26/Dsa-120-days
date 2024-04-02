public class k28c {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        System.out.println(find(arr,6,0));
    }

    static boolean find(int[] arr, int target, int i){


        if(arr[i] == target){
            return true;
        }

        if(i == arr.length-1){
            return false;
        }

        return find(arr,target,i+1);

    }
}
