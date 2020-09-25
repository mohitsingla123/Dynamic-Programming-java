//Minimum Number of Insertion and Deletion to convert from String 'a' to 'b'
//Solution: 

public class HelloWorld{

     public static void main(String []args){
        String a = "peap";
        String b = "gep";
        //Converting string a to b.
        
        int lena = a.length();
        int lenb = b.length();
        int i ,j;
        //Initialization.
        int[][] arr = new int[lena+1][lenb+1];
        for(i =0;i<=lena;i++)
        {
            for(j = 0;j<=lenb;j++)
            {
                if(i==0 || j ==0)
                arr[i][j] =0;
            }
        }
        for(i =1;i<=lena;i++)
        {
            for(j = 1;j<=lenb;j++)
            {
                if(a.charAt(i-1) == b.charAt(j-1))
                {
                    arr[i][j] = 1 + arr[i-1][j-1];
                }
                else
                {
                    arr[i][j] = Math.max(arr[i-1][j] , arr[i][j-1]);
                }

            }
        }
        int common = arr[lena][lenb];
        int insertion = lenb- common;
        int deletion = lena - common ;
        System.out.println("To convert String from \na : "+a+" to b : "+b+" \nInsertion: "+insertion + "\nDeletion : "+ deletion + "\ntotal Insertion and Deletion are: "+ (insertion + deletion));
        //To print whole array.
        /*
        for(i =1;i<=lena;i++)
        {
            for(j = 1;j<=lenb;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        */
        
     }
}
