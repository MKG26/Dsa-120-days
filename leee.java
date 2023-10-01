import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leee {
    public static void main(String args[]){
    
        
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        


        System.out.println(shiftGrid(arr, 1));
    
    }

        static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        int[][] hh = new int[grid.length][grid[0].length];
        
    



       for(int m =0 ; m<k; m++){
           int i =0;
           int j =0;
           int l =0;
           int n =0;
            
                for(int r = 0; r<grid.length ; r++){
            
                    for(int c = 0; c<grid[0].length; c++){

                         hh[r][c] = grid[r][c];
                    }

                     }
           
           
           
           
           while(i<grid.length ){
                
           
                hh[i][j+1] = grid[i][j];
                
                     
            j++;
               
                        if(j>=grid[0].length-1){
                        j = 0;
                            i++;
                    
                                }


              
            }

            while(l<grid.length-1 ){
                  hh[l+1][0] = grid[l][grid[0].length -1];
                l++;
            
          
            }

            while(n<1 ){
                hh[0][0] = grid[grid.length-1][grid[0].length-1];
                n++;
            
             
            }

            

        }





       
        List list = new ArrayList();
        for (int[] array : hh) {
            //This will add int[] object into the list, and not the int values.
            list.add(Arrays.asList(array));
        }
        


        

        return list;
    }
}

