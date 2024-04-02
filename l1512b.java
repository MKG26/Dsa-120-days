public class l1512b {

    public static void main(String[] args) {

        System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }

    public static int numIdenticalPairs(int[] nums) {

        int[] count = new int[100];

        for(int i : nums){

            count[i]++;
        }

        int tCount = 0;

        for(int i : count){

            tCount += (i*(i-1)/2);
        }

        return tCount;
    }
}
