public class kpalindrome {
    public static void main(String args[]){
    
        String a = "";



        System.out.println(check(a));
    
    }

     static boolean check(String b){

        int s = 0;

        int e = b.length() -1 ;

        while(s<e){

            if(b.charAt(s) != b.charAt(e)){
                return false;
            }
            else{
                s++;
                e--;
            }
        }

        return true;
    }   
    
}
