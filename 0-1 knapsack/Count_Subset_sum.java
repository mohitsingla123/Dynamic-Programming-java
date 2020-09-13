//Problem Statement : Given an array value[] of length N and an integer X, the task is to find the number of subsets with sum equal to X.

//Solution:

public class CountSubSet{

     public static void main(String []args){
        int value[] = {2,3,5,8,10};
        int sum = 10;
        int len = value.length;
        
        int[][] arr = new int[len+1][sum+1];
        int i,j;
        for(i =0;i<=len;i++)
        {
            for(j=0;j<=sum;j++)
            {
                if(i==0)
                {
                    arr[i][j] = 0;
                }
                if(j==0)
                {
                    arr[i][j] = 1;
                }
            }
        }
        
        
        for(i =1;i<=len;i++)
        {
            for(j=1;j<=sum;j++)
            {
                if(value[i-1] > j)
                {
                    arr[i][j] = arr[i-1][j];
                }
                else
                {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j- (value[i-1])];
                }
            }
        }
        
        System.out.println("Total Number of Possible Sub-Array for Sum " + sum +" are " + arr[len][sum]);
     }
}
