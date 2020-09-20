// Recurtion Code:

public class LongestCommonSubsequence{ 
    
    //recursion function
    public static int lcs(String a,String b , int len1, int len2)
    {
        if(len1 == 0 || len2 == 0)
        {
            return 0;
        }
        else
        {
            if(a.charAt(len1 -1 ) == b.charAt(len2 -1))
            {
                return (1+ lcs(a,b,len1-1,len2-1));
            }
            else 
            {
                return Math.max(lcs(a,b,len1,len2-1) , lcs(a,b,len1-1,len2));
            }
        }
    }
    
    
     public static void main(String []args){
        String a = "ABCDGH";
        String b = "AEDFHR";
        int len1 = a.length();
        int len2 = b.length();
        int total = lcs(a,b,len1,len2);
        System.out.println("Length of LCS is : "+total);
        
     }
}
