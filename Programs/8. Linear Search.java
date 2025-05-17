
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        
        int[] x = {1,21,32,4,2};
        int index = search( x, 5);
        
        int[][] arr = {  {1,2,3},
                        {4,5,6},
                        {7,8,9}
                    };
        int[] indexArr = searchInTD( arr, 8 );
        
        System.out.println("Output: "+ index);
        System.out.println("Output 2D: "+ Arrays.toString(indexArr));
        
    }
    
    public static int search( int[] x, int y)
    {
            if(x.length == 0)
            {
                return -1;
            }
            
            for (int i=0 ; i< x.length; i++)
            {
                if (x[i]==y){
                    return i; 
                }
            }
            
            return -1;
    }
 
    public static int[] searchInTD( int[][] arr ,int y)
    {
        if( arr.length == 0)
        {
            return new int[]{-1,-1};
        }
        
        for( int i=0; i< arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(arr[i][j] == y)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    
}
