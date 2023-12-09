public class contest2 {

    public static void main(String[] args) {


        System.out.println(removeAlmostEqualCharacters("zyxyxyz"));
    }

    public static int removeAlmostEqualCharacters(String word) {

        int count = 0;

        char[] arr = word.toCharArray();

        for(int i=0; i<arr.length-1; i++){

            if(arr[i] == arr[i+1]  ){
                count++;
                i++;

            }

            else if(arr[i+1] == arr[i]+1){

                count++;
            }


        }

        return count;

    }
}
