import java.util.*;

public class reverseWords {
    
    public static void main(String args[]){
    
        char a[] = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};

            char test[]= new char[a.length+1];

            int nnew = 0;

            int n = a.length-1;
            
            for(int i=n; i>=0  ;i--){


                if(a[i]==' ' || i==0){

                        if(i==0){
                            test[nnew]=a[i];
                            nnew++;
                        }
                    int f = i+1;
                    char j = a[f];

                    while(j!=' ' && j != '\0' && f<a.length && nnew<=a.length){

                        test[nnew]=a[f];

                        f++;

                        if(f<a.length){
                        j = a[f];
                        }

                        
                        
                        nnew++;
                        if(j==' ' || f==a.length ){
                            test[nnew]+=' ';
                            nnew++;
                        }
                    }

                }
            }

                for (int k=0 ; k<test.length; k++){

                    System.out.print(test[k]);
                }
    
    }



}
