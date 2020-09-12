// Problem Statement : Partition problem is to determine whether a given set can be partitioned into two subsets such that the sum of elements in both subsets is same

// SOlution:
//Just Enter the array arr[] to check for equal sum subarray.


public class EqualSum{

     public static void main(String []args){
        int arr[] = {3,4,5,2};
        int len = arr.length;

        int i,j;
        int sum =0;
        for(i=0;i<len;i++)
        {
            sum = sum+arr[i] ;
        }
        
        if(sum%2 !=0)
        {
            System.out.println("No such Sub-Array Found");
        }
        else
        {
            sum = 6;
            int len1 = len+1;
            int sum1 = sum+1;
            int[][] total = new int[len1][sum1];
            
            for(i=0;i<=len;i++)
            {
                for(j=0;j<=sum;j++)
                {
                    if(i==0)
                    {
                        total[i][j] = -1;
                    }
                    if(j==0)
                    {
                        total[i][j]= 1;
                    }
                }
            }
            
            for(i=1;i<=len;i++)
            {
                for(j=1;j<=sum;j++)
                {
                    if(arr[i-1] > j)
                    {
                        total[i][j] = total[i-1][j];
                    }
                    else
                    {
                        total[i][j] = Math.max( total[i-1][j- (arr[i-1])] , total[i-1][j]);
                    }
                }
            }
            
            /* TO PRINT THE ARRAY
            for(i=0;i<=len;i++)
            {
                for(j=0;j<=sum;j++)
                {
                    System.out.print(total[i][j]+" ");
                }
                System.out.println("");
            }
            */
            
            if(total[len][sum] == 1)
            {
                System.out.println("Subarray found");
            }
            else 
            {
            System.out.println("No such Sub-Array Found");
            }
            
        }
        
     }
}
