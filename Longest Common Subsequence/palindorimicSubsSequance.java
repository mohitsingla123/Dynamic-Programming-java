public class palindorimicSubsSequance{

     public static void main(String []args){
         // its parent Qustion is LCS
        String a = "forgeeksskeegfor";
        int i,j;
        //reversing String a into string b
        int n = a.length();
        String b = "";
        for(i = n-1; i>=0;i--)
        {
            b = b + a.charAt(i);
        }
        
        //System.out.println(b);
        
        int m = n;
        int[][] arr = new int[n+1][m+1];
        for (i = 0 ; i <= n; i++)
        {
            for(j = 0; j<= m;j++)
            {
                if(i==0 || j==0)
                {
                    arr[i][j]=0;
                }
            }
        }
        
            for(i = 1; i<=m;i++)
        {
            for (j = 1; j<=n; j++)
            {
                if(a.charAt(i-1) == b.charAt(j-1))
                {
                    arr[i][j] = 1 + arr[i-1][j-1];
                }
                else
                {
                    arr[i][j] = Math.max(arr[i-1][j] , arr[i][j-1]);
                }
            }
        }
        /*
        for(i= 0; i<=n;i++)
        {
            for(j = 0; j<=m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        */
        
        String output = "";
        char k;
        int max = arr[n][m];
        
    while(n>0 && m >0)
    {
        if (a.charAt(n-1) == b.charAt(m-1))
        {
            k = a.charAt(n-1);
            output = output + k;
            n--;
            m--;
        }
        else
        {
            if (arr[n-1][m] > arr[n][m-1])
            {
                n--;
            }
            else
            m--;
        }
    }
        System.out.println("Input String: "+ a +"\nLongest Palindromic SubSequance: "+output);
    }
}