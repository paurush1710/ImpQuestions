
class Main {
    
    public static void main(String[] args) {
        
        System.out.println(isArmStrong(152));
        
    }
    
    static boolean isArmStrong(int n)
    {
        int temp = n;
        int x = 0;
        while( n > 0)
        {
            int y = n%10;
            x = x + y*y*y;
            n = n/10;
        }
        
        System.out.println(temp);
        System.out.println(x);
        System.out.println(n);
        
        return x == temp;
    }
    
}
