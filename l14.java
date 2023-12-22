import java.util.Arrays;

public class l14 {

    public static void main(String[] args) {

        String[] arr = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(arr));

    }

    public static  String longestCommonPrefix(String[] strs) {


         StringBuilder ans = new StringBuilder();

        Arrays.sort(strs);

        char[] arr1 = strs[0].toCharArray();
        char[] arr2 = strs[strs.length-1].toCharArray();

        for(int i=0; i<arr1.length; i++){

            if(arr1[i] != arr2[i]){

                break;

            }

            ans.append(arr1[i]);
        }


            return ans.toString();
    }
}
