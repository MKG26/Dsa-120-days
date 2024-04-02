public class indexSeqSearch {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        int ans = search(arr,arr.length, 50);

        if(ans == 1){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }

    private static int search(int[] arr, int size, int num) {
        int found = 0;
        int maybe = 0;
        int[] valArr = new int[size/2];
        int[] indArr = new int[size/2];

        int start = 0;
        int end =0;

        int index =0;

        for(int i=0; i<size; i+=3){

            valArr[index] = arr[i];
            indArr[index] = i;
            index++;
        }

        if(num < valArr[0]){

            return found;
        }

        for(int i=0; i<index; i++){

            if(num <=valArr[i]){
                start = indArr[i-1];
                end = indArr[i];
                maybe =1;

                break;

            }
        }

        if(maybe == 0){

            for(int i=index; i<size; i++){

                if(num == arr[i]){
                    found = 1;
                }
            }
        }

        for(int i=start; i<=end ;i++){

            if(num == arr[i]){

                found =1;
            }
        }

        return found;
    }


}
