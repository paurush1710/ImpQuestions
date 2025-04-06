import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        int n = 24;
        
        if ( isPrimeNumber(n) )
        {
            System.out.println(n + " is Prime number.");
        }
        else
        {
            System.out.println(n + " is not a Prime number.");
        }
        
    }
    
    public static boolean isPrimeNumber( int n)
    {
        
        if( n == 1)
            return false;
        if( n==2 )
            return false;
        if( n%2 ==0 )
            return false;
        
        for ( int i = 3; i<= Math.sqrt(n); i+=2)
        {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
