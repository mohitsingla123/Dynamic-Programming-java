// Problem Statement Name : Minimum subset sum difference
//Solution with 0/1 knapsack .

public class MinDiff{

    public static int check(int[] array , int m)
    {
        int len = array.length;
        int[][] arrr = new int[len+1][m+1];
        int i,j;
        for(i =0;i<=len;i++)
        {
            for(j=0;j<=m;j++)
            {
                if(i==0)
                {
                    arrr[i][j] = 0;
                }
                if(j==0)
                {
                arrr[i][j] = 1;
                }
            }
        }

        for(i =1;i<=len;i++)
        {
            for(j=1;j<=m;j++)
            {
                if(array[i-1]>j)
                {
                    arrr[i][j] = arrr[i-1][j];
                }
                else
                {
                arrr[i][j] = Math.max(arrr[i-1][j] , arrr[i-1][j-(array[i-1])]);
                }
            }
        }
        
        return arrr[len][m];
        
    }

     public static void main(String []args){
     int arr[] = {3,1,4,2,1};
     int i;
     int sum =0;
     int len = arr.length;
     for(i=0;i< len ; i++)
     {
         sum = sum+arr[i];
     }
     int mid;
     if(sum %2==0)
     {
         mid = sum/2;
     }
     else
     {
         mid = (sum-1)/2;
     }
     
     int[] valid = new int[mid];
     
     for(int k =1;k<=mid;k++)
     {
        int p = check(arr , k);
        valid[k-1] = p;
     }
     
     for(i = mid-1;i>=0;i++)
     {
         if(valid[i]==1)
         {
             System.out.println("Minimum Subset sum Difference is " + (sum -  (i+1)*2));
             break;
         }
     }
     }
}
