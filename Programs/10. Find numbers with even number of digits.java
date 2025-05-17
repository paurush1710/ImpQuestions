
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


class Main {
    public static void main(String[] args) {
        
        int[] x = {1,213,312,4213331,21};
        List<Integer> index = findEvenNumberDigits( x);
        int evenCount = findEvenDigitsCount(x);
        
        // System.out.println("Even number of digits: "+ Arrays.toString(index));
        System.out.println("Even number of digits: "+ index);
        System.out.println("Even number of digits: "+ evenCount);
        
    }
    
    public static List<Integer> findEvenNumberDigits( int[] x)
    {
        List<Integer> a = new ArrayList<>();
            
            for (int i=0 ; i< x.length; i++)
            {
                if (String.valueOf(x[i]).length() %2 ==0){
                    a.add(x[i]); 
                }
            }
            
            return a;
    }
    
    public static int findEvenDigitsCount(int[] arr)
    {
        int count = 0;
        
        for(int x : arr)
        {
            if(isEven(x))
            {
                count++;
            }
        }
        
        return count;
    }
 
 public static boolean isEven(int x)
 {
     if(digits(x) % 2 == 0)
     {
         return true;
     }
     return false;
 }
 
 public static int digits(int x)
 {
     int count = 0;
     
     while(x > 0)
     {
         x = x/10;
         count++;
     }
     return count;
 }

  // faster way to find digits
  public static int digits(int x) {
    return (int) Math.log10(x) + 1;
}
  
}
