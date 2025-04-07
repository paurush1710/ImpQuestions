
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) {

      inputs();
      inputs(2,3,4,5,6);
        
    }
    
    public static void inputs(int ...v){
        System.out.println(Arrays.toString(v));
    }

// variable length argument should be the last in this list while passing
    
    static void printValues(int a, int b, String... v) 
    {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        System.out.println("v: ");
        for (String value : v) 
        {
            System.out.println("  - " + value);
        }
    }
  
}
