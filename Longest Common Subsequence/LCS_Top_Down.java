// solving lcs with top down approch

public class HelloWorld{

     public static void main(String []args){
        String a = "aeiou";
        String b = "asdertiop";
        int lena = a.length();
        int lenb = b.length();
        
        int[][] arr = new int[lena + 1][lenb + 1];
        int i ,j;
        for (i =0;i<=lena;i++)
        {
            for(j =0;j<=lenb;j++)
            {
                if(i==0 || j == 0)
                {
                   arr[i][j] = 0;
                }
            }
        }
        
        for(i = 1; i<=lena;i++)
        {
            for (j = 1; j<=lenb; j++)
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
        
        System.out.println(arr[lena][lenb]);
     }
}
