public class l410 {

    public static void main(String[] args) {

        int[] arr = {25,46,28,49,24};

        System.out.println(maxPageMin(arr, 4));
    }

    static int maxPageMin(int[] arr, int m ){

        int pages = 0;
        int sum =0;

        for(int i=0;i< arr.length; i++){

            pages = Math.max(pages, arr[i]);

            sum += arr[i];

        }

        for(int i=pages; i<=sum; i++){

            int stuCnt = NoStu(arr, i);

            if(stuCnt == m){
                return i;
            }
        }

        return -1;

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
