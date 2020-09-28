// Calculating Minimum Matrix chain Multiplication
public class MCM{

  public static int solution(int arr[], int i, int j, int mini)
    {
        
        if(i>=j)
        {
            return 0;
        }
        
            for(int k =i;k<= j-1;k++)
            {
                int temp = solution(arr , i, k , mini) + solution(arr ,k+1 , j , mini)  + (arr[i-1] * arr[k] * arr[j]);
                if(temp < mini)
                {
                    mini = temp;
                }
                
                }
        
        return mini;
    }
     public  static void main(String []args){
         int ar[] = {10,20,30};
         int len =  ar.length;
         int maxi = 100000;
         int value = solution(ar , 1,len-1 , maxi);
         System.out.println(value);
     }
}
