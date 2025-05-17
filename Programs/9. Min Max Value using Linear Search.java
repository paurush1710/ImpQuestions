
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        
        int[] x = {1,21,32,4,2};
      
        int[][] arr = {  {1,2,3},
                        {4,5,6},
                        {7,8,9}
                      };
      
        int maxNumber = max(x);
        int maxInTwoDimArray = maxInTwoDim(arr);
        
        System.out.println("Max: "+ maxNumber);
        System.out.println("Max 2D: "+ maxInTwoDimArray);
    }
    
    public static int max(int[] arr)
    {
        
        int x = arr[0];
        
        for(int i : arr){
            if(i>x){
                x = i;
            }
        }
        return x;
    }
    
    public static int maxInTwoDim(int[][] arr)
    {
        int max = arr[0][0];
        
        for(int i=0; i< arr.length; i++)
        {
            for(int j=0; j< arr[i].length; j++)
            {
                if(arr[i][j]>max)
                {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
     
}
