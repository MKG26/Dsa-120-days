public class k28a {

    public static void main(String[] args) {

        int arr[] = {1,2,4,3,5,6};

        System.out.println(check(arr, 0));
    }

    static boolean check(int[] arr, int i){



        if(i == arr.length-1){

            return true;
        }

        if (arr[i]>arr[i+1]) {
            return false;
        }

        return check(arr,i+1);

    }
}
