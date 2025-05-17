
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


class Main {
    public static void main(String[] args) {
        
        int[][] accounts = {
            {3,4,7},
            {11,2,1},
            {10,2,13}
        };
        
        int maxWealth = findMaxWealth( accounts );
        int maxWealthOpt = findMaxWealthOpt( accounts );
        
        System.out.println("Max Wealth: "+ maxWealth);
        System.out.println("Max Wealth Opt: "+ maxWealthOpt);
    }
    
    public static int findMaxWealth( int[][] accounts )
    {
        int max = Integer.MIN_VALUE;
        
        for( int i=0; i<accounts.length; i++)
        {
            int sum = 0;
            
            for(int j = 0; j< accounts[i].length; j++)
            {
                sum += accounts[i][j];
            }
            
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
    
    // optimized
    public static int findMaxWealthOpt( int[][] accounts )
    {
        int max = Integer.MIN_VALUE;
        
        for(int[] i : accounts){
            int sum = 0;
            for(int j : i){
                sum += j;
            }
            
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
}
