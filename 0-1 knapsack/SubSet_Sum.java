// Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.

//Solution:

public class SubSetSum{

     public static void main(String []args){
         
        int w[] = {2,4,6,8,10};
        int total =12;
        int len = w.length;
        int nw = len+1;
        int ntotal = total+1;
        int[][] arr = new int[nw][ntotal];
        int i,j;
        for(i = 0;i<=len;i++)
        {
            for (j=0;j<=total;j++)
            {
                if(i==0)
                {
                    arr[i][j]= -1;
                }
                if(j==0)
                {
                    arr[i][j] =1;
                }
            }
        }
        
        for(i=1;i<=len;i++)
        {
            for(j=1;j<=total;j++)
            {
                if(w[i-1]>j)
                {
                    arr[i][j] = arr[i-1][j];
                }
                else
                {
                    arr[i][j] = Math.max(arr[i-1][j],arr[i][j - (w[i-1])]);
                }
            }
        }
        if(arr[len][total] == 1)
        {
            System.out.println("Subset sum found: True");
        }
        else
        {
        System.out.println("No subset sum found");
        }
        
     }
}
