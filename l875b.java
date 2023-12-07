public class l875b {
    
    public static void main(String args[]){
    
        int[] arr = {805306368,805306368,805306368};

        System.out.println(minEatingSpeed(arr, 1000000000));
    
    }

    static int minEatingSpeed(int[] piles, int h) {
    

        int i=1;
        int j = Integer.MAX_VALUE;

        while(i<j){
            int k = i+(j-i)/2;
            int time = 0;
            
            for(int x=0; x<piles.length; x++){

            
                if(piles[x] <= k )
                    time++;

                else
                    time += (piles[x] +k -1)/k;
            }

            if(time<h)
                j=k;

            else
                i = k+1;

        }

        return i;
    }
}
