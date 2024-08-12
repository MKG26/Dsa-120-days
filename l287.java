
import java.util.*;

class l287{
    public static void main(String[] args) {
        
        int arr[] = new int[]{2,6,4,1,3,1,5};

        System.out.println(findDuplicate(arr));

    }

    static int findDuplicate(int nums[]) {

        int slow = 0, fast = 0;



        while (true) {

            slow = nums[slow];

            fast = nums[nums[fast]];

            if (slow == fast) break;

        }


        slow = 0;

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;

    }
}