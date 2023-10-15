public class pattern {

    public static void main(String args[]){
    
        pattern14(5);
    
    }

    // static void pattern1(int n){

    //     for(int row = 1; row<=n ; row++){

    //         for(int col = 1; col<=row; col++){

    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }
    // }
    
    // static void pattern2(int n){

    //     for(int row = 1; row<=n ; row++){

    //         for(int col = 1; col<=5; col++){

    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }
    // }

    // static void pattern3(int n){

    //     for(int row = 1; row<=n ; row++){

    //         for(int col = 0; col<=n-row; col++){

    //             System.out.print("* ");
    //         }

    //         System.out.println();
    //     }
    // }

    // static void pattern4(int n){

    //     for(int row = 1; row<=n ; row++){

    //         for(int col = 1; col<=row; col++){

    //             System.out.print(col + " ");
    //         }

    //         System.out.println();
    //     }
    // }


    // }

    // static void pattern5(int n){

    //     for(int row = 1; row<=n ; row++){

    //         for(int col = 1; col<=row; col++){

    //             System.out.print("* ");
    //         }

    //         System.out.println();
    //     }

    //     for(int row = 1; row<n ; row++){

    //         for(int col = 0; col<=n-row-1; col++){

    //             System.out.print("* ");
    //         }

    //         System.out.println();
    //     }
    // }


    //     static void pattern6(int n){

    //     for(int row = 1; row<=n ; row++){

    //         for(int col = n-row; col>0; col--){

    //             System.out.print(" ");
    //         }

    //         for(int ncol = row ; ncol >0; ncol--){

    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }

    // }

    //     static void pattern7(int n){

    //     for(int row = 1; row<=n ; row++){

    //         for(int col = 1; col<row; col++){

    //             System.out.print(" ");
    //         }

    //         for(int ncol = n-row ; ncol >=0; ncol--){

    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }

    // }


    //     static void pattern8(int n){

    //     for(int row = 1; row<=n ; row++){

    //         for(int col = n-row; col>0; col--){

    //             System.out.print(" ");
    //         }

    //         for(int ncol = row ; ncol >0; ncol--){

    //             System.out.print("*");
    //         }



    //             for(int col = 1; col < row ; col++){

    //                 System.out.print("*");
    //             }
            

    //         System.out.println();
    //     }

    // }

    
    // static void pattern9(int n){

    //     for(int row = 1; row<=n ; row++){

    //         for(int col = 1; col<row; col++){

    //             System.out.print(" ");
    //         }

    //         for(int ncol = n-row ; ncol >=0; ncol--){

    //             System.out.print("*");
    //         }



    //             for(int col = n-row; col >0 ; col--){

    //                 System.out.print("*");
    //             }
            

    //         System.out.println();
    //     }

    // }


    //     static void pattern10(int n){

    //     for(int row = 1; row<=n ; row++){

    //         for(int col = n-row; col>0; col--){

    //             System.out.print(" ");
    //         }

    //         for(int ncol = 1 ; ncol <=row; ncol++){

    //             System.out.print("* ");
    //         }



                
            

    //         System.out.println();
    //     }

    // }


    //     static void pattern11(int n){

    //     for(int row = 1; row<=n ; row++){

    //         for(int col = 1; col<row; col++){

    //             System.out.print(" ");
    //         }

    //         for(int ncol = n-row ; ncol >=0; ncol--){

    //             System.out.print("* ");
    //         }



    
            

    //         System.out.println();
    //     }

    // }

    //     static void pattern12(int n){

    //     for(int row = 1; row<=n ; row++){

    //         for(int col = 1; col<row; col++){

    //             System.out.print(" ");
    //         }

    //         for(int ncol = n-row ; ncol >=0; ncol--){

    //             System.out.print("* ");
    //         }

    //         System.out.println();
    //     }

    //     for(int row = 1; row<=n ; row++){

    //         for(int col = n-row; col>0; col--){

    //             System.out.print(" ");
    //         }

    //         for(int ncol = 1 ; ncol <= row; ncol++){

    //             System.out.print("* ");
    //         }

    //         System.out.println();
    //     }

    // }


    // static void pattern13(int n){

    //     for(int row = 1; row<n ; row++){

    //         for(int col = n-row; col>0; col--){

    //             System.out.print(" ");
    //         }

    //         System.out.print("*");

    //         for(int sp = 1 ; sp<row; sp++){

    //             System.out.print(" ");
    //         }

    //         for(int sp = 2 ; sp<row; sp++){

    //             System.out.print(" ");
    //         }

    //         if(row>1)
    //         System.out.print("*");

    //         if(row == 4){
    //             System.out.println();
    //             for(int i=1; i<=n+row ; i++){
    //                 System.out.print("*");
    //             }
    //         }


    
            

    //         System.out.println();
    //     }

    // }


    static void pattern14(int n){

        for(int row = 1; row<n ; row++){

            if(row == 1){

                for(int i=1; i<=9; i++){

                    System.out.print("*");
                }
                System.out.println();
            }

            for(int col = 1; col<=row; col++){
                System.out.print(" ");
            }

            System.out.print("*");

            for(int ncol = n-row; ncol>1  ; ncol-- ){
                    System.out.print(" ");
            }

            for(int nncol = n-row; nncol>2  ; nncol-- ){
                    System.out.print(" ");
            }

            if(row < 4)
            System.out.print("*");

            System.out.println();

        }

    }




 }
