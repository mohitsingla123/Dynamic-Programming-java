//Given a value V, if we want to make change for V cents, and we have infinite supply of each of Coin = { C1, C2, .. , Cm} valued coins,
//what is the minimum number of coins to make the change?
//Solution:

public class CoinChangeMinNumber{

     public static void main(String []args){
        int coin[] = {1,5,6,9};
        int total = 11;
        int len = coin.length;
        int i,j;
        
        //Initialization
        int[][] arr = new int[len+1][total+1];
        for(i = 0;i<=len;i++)
        {
            for (j =0;j<=total;j++)
            {

                
                if (j ==0)
                arr[i][j] =0;
                
                else if (i==0)
                arr[i][j] = 100000;
                // using a vert large number i.e. 100000 insted of Infinite/INT_MAX 
            }
        }
        //Filling table
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
                    arr[i][j] = Math.min(arr[i-1][j] , 1+ arr[i][j-(coin[i-1])]);
                }
            }
        }
        //Printing the array Solution 
        for(i = 0;i<=len;i++)
        {
            for (j =0;j<=total;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("\n\nMinimum Number of Coin required for sum "+total+" is : " + arr[len][total]);
     }
}
