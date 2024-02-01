public class l1512 {

    public static void main(String[] args) {

        System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }

    public static int numIdenticalPairs(int[] nums) {

        int count =0;
        int i=nums.length-1;

        while(i>=0){

            for(int j=0; j< i; j++){

                if(nums[i] == nums[j]){
                    count++;
                }
            }

            i--;

        }

        return count;
    }
}
