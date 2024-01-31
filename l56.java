import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class l56 {

    public static void main(String[] args) {

        int[][] arr = {
                {1,3},
                {2,6},
                {8,10},
                {15,18},
        };

        int[][] ans = merge(arr);

        for(int i=0; i<ans.length; i++ ){
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    public static int[][] merge(int[][] intervals) {


        if(intervals.length <= 1){
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();

        int[] newIntervals = intervals[0];
        result.add(newIntervals);

        for(int[] interval : intervals){

            if(interval[0] <= newIntervals[1]){


                newIntervals[1] = Math.max(newIntervals[1], interval[1]);
            }
            else {

                newIntervals = interval;
                result.add(newIntervals);

            }
        }

        return result.toArray(new int[result.size()][]);


    }
}
