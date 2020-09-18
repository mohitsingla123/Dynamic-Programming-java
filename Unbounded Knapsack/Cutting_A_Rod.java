// problem Statement Link : https://www.geeksforgeeks.org/cutting-a-rod-dp-13/

//Solution :
public class RopeCutting{

     public static void main(String []args){
        int value[] = {1, 5, 8, 9, 10, 17, 17, 20}; 
        int size = 8;
        int len = value.length;
        int i,j;
        
        //Inititalization
        int[][] arr = new int[len+1][size+1];
        for(i =0;i<=len;i++)
        {
            for(j =0;j<=size;j++)
            {
                if(i==0 || j==0)
                {
                    arr[i][j] = 0;
                }
            }
        }
        
        //Filing the Table
        for(i =1;i<=len;i++)
        {
            for(j =1;j<=size;j++)
            {
                if(i > j)
                {
                    arr[i][j] = arr[i-1][j];
                }
                else
                {
                    arr[i][j] = Math.max(arr[i-1][j] , value[i-1] + arr[i][j - i]);
                }
            }
        }
        
        /*
        To Print the the table of all the values
        for(i =0;i<=len;i++)
        {
            for(j =0;j<=size;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        */
        
        //Printing the Max Profit
        System.out.println("Maximum Profit is : " + arr[len][size]);
        
        
        
     }
}
