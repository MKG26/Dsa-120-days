public class k28d {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        System.out.println(find(arr,3,0));
    }

    static boolean find(int[] arr, int target, int i){



        if(i == arr.length){
            return false;
        }

        return arr[i] == target || find(arr,target,i+1);

    }
}
