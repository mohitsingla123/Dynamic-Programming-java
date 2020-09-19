// To find maximum number of ways for coin change.
//Solution.


public class CoinChangeMaxNumber{

     public static void main(String []args){
        int coin[] = {1,3,2};
        int total = 10;
        int len = coin.length;
        int i,j;
        int[][] arr = new int[len+1][total+1];
        
        for(i = 0;i<=len;i++)
        {
            for (j =0;j<=total;j++)
            {
                if (i==0)
                arr[i][j] = 0;
                
                if (j ==0)
                arr[i][j] =1;
            }
        }
        
        for(i=1;i<=len;i++)
        {
            for (j =1;j<=total;j++)
            {
                if(coin[i-1]>j)
                {
                    arr[i][j] = arr[i-1][j];
                }
                else
                {
                    arr[i][j] = arr[i-1][j] + arr[i][j-(coin[i-1])];
                }
            }
        }
        
        for(i = 0;i<=len;i++)
        {
            for (j =0;j<=total;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Maximum Number of total ways are : " + arr[len][total]);
     }
}
