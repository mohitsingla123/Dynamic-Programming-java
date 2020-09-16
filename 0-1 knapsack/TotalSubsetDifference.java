//Count the number of subset with a given difference

public class TotalSubsetDifference{
    
     public static void main(String []args){

     int value[] = {1,1,2,3};
     int diff = 1;
     int len = value.length;
     int i,j;
     int sum =0;
     
     //finding sum of array;
     for(i =0;i<len;i++)
     {
         sum = sum+ value[i];
     }
     
     if((sum+diff)%2 !=0)
     {
     System.out.println("Total SubSet are : 0");
     }
     else
     {
     int k = (sum + diff)/2;
     
     int[][] arr = new int[len+1][k+1];
     //Initialization
     
    for(i =0;i<=len;i++)
    {
        for(j=0;j<=k;j++)
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
     
     //Creating 0/1 knapasack table to count the no of subarray  in Value[]  with sum = k
     for(i =1;i<=len;i++)
     {
         for(j =1; j<=k;j++)
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
     
     //Output printing
     System.out.println("Total SubSet are : "+ arr[len][k]);
     }
}
}
