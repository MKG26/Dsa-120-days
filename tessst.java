public class tessst {
    
    public static void main(String args[]){
    
        int a= 5; 
        int b = 10;

        int ans = 0;

        for(int i=1; i<=a && i<=b; i++){
                
            if(a%i ==0 && b%i == 0){
                   
                    if(ans < i){
                        ans = i;
                    }
                }
            }

                System.out.println(ans);
    
}
}
