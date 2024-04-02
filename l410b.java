public class l410b {

    public static void main(String[] args) {
        int[] arr = {25,46,28,49,24};

        System.out.println(maxPageMin(arr, 4));
    }

    static int maxPageMin(int[] arr, int m ){

        int low = 0;
        int high =0;

        for(int i=0;i< arr.length; i++){

            low = Math.max(low, arr[i]);

            high += arr[i];

        }


        while (low <= high){

            int mid = low+(high-low)/2;

            int stuCnt = NoStu(arr, mid);

            if(stuCnt > m){
                low = mid +1;
            }
            else {
                high = mid-1;
            }
        }

        return low;

    }

    static int NoStu(int[] arr, int pages){

        int pagesCnt =0;
        int stu = 1;

        for(int i=0;i<arr.length; i++){

            if(pagesCnt + arr[i] <= pages){

                pagesCnt += arr[i];

            }
            else{

                stu++;
                pagesCnt = arr[i];
            }
        }


        return stu;
    }


}

