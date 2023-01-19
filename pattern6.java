public class pattern6 {

    public static void main(String args[])
    {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            if(i<=2){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
        }
        else
        {
            System.out.print("*");
            for(int j=1;j<=i-2;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
        }

            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }


        
            if(i<=2){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
        }
        else
        {
            System.out.print("*");
            for(int j=1;j<=i-2;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
        }

            
            System.out.println();
        }

        
        for(int i=n;i>=1;i--)
        {
            if(i<=2){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
        }
        else
        {
            System.out.print("*");
            for(int j=1;j<=i-2;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
        }

            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }


        
            if(i<=2){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
        }
        else
        {
            System.out.print("*");
            for(int j=1;j<=i-2;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
        }

            
            System.out.println();
        }


    }
    
}
 
