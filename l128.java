import java.util.HashSet;
import java.util.Set;

public class l128 {
    
    public static void main(String args[]){
    
        int[] nums = {100,4,200,1,3,2};

        System.out.println(longestConsecutive(nums));
    
    }

    static int longestConsecutive(int[] nums){

        Set<Integer> set = new HashSet<>();

        for(int i =0; i<nums.length; i++){

            set.add(nums[i]);
        }

        int longest = 1; 

        for(int it : set){
            
            if(!set.contains(it-1)){

                int count = 1;

                int x = it; 

                    while(set.contains(x+1)){
                        x++;
                        count++;
                    }

                    longest = Math.max(longest,count);
            }
            
        }

        return longest;
    }
    
}
