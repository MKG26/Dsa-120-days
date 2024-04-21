public class l463 {

    public static void main(String[] args) {


        int[][] arr = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };

        System.out.println(islandPerimeter(arr));
    }


    public static int islandPerimeter(int[][] grid) {


        int temp = 0;
        int ans = 0;

        for(int i =0; i< grid.length; i++){

            for(int j=0; j< grid[0].length; j++){

                if(grid[i][j] == 1){

                    temp = 2;

                    if(i>0 && i<grid.length-1){


                        if(grid[i-1][j] == 1){

                            temp -= 1;
                        }

                        if(grid[i+1][j] == 1){
                            temp -= 1;
                        }

                    }

                    if(i == 0){



                        if(grid[i+1][j] == 1){
                            temp -=1;
                        }

                    }

                    if(i == grid.length - 1){

                        if(grid[i-1][j] == 1){
                            temp -= 1;
                        }


                    }

                    ans += temp;

                }



            }
        }



        for(int i=0; i < grid.length; i++){

            for(int j=0 ; j < grid[0].length; j++){

                if(grid[i][j] == 1){

                    temp = 2;

                    if(j > 0 && j < grid[0].length - 1) {

                        if(grid[i][j-1] == 1){

                            temp -= 1;
                        }

                        if(grid[i][j+1] == 1){

                            temp -= 1;

                        }
                    }

                    if(j == 0){

                        if(grid[i][j+1] == 1){

                            temp -= 1;

                        }
                    }

                    if(j == grid[0].length-1){

                        if(grid[i][j-1] == 1){

                            temp -= 1;
                        }

                    }


                    ans += temp;
                }





            }
        }



        return ans;


    }
}
