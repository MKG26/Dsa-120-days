class solution1 {
    
    
    public static void main(String args[]){
    
        
        
        System.out.println(longestPalindrome("mohhit"));
    
    }
    
    
    
    
    public static String longestPalindrome(String s) {
        
        if(s.length() == 1){
            return s;
        }


        char[] ans = new char[s.length()];
        
        ans = s.toCharArray();

        int count = 0;

        String r = "";

        boolean test = true;

        for(int i=0; i<ans.length-1 ; i++){

            
            
            for(int j=i + 1; j<ans.length; j++){

                if(ans[j] == ans[i]){
                    if(search(ans, i ,j)){
                        test = false;
                        String a = s.substring(i, j+1);

                        if(count < a.length()){
                            count = a.length();

                            r = a;
                        }
                    }

                    
                }
            }
 }

 if(test){
    return "t";
 }

 return r;
}


    public static boolean search(char[] ans , int i , int j){

        while(i<=j){

            if(ans[i] == ans[j]){
                i++;
                j--;
                
            }
            else
            {
                return false;
            }
        }

        return true;
    }
}
