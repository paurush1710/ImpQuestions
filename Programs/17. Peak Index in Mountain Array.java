import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,12,14,22,24,30,23,19,15,7};
        int ans = peakIndex( arr);
        System.out.println(ans);
    }
    
    public static int peakIndex(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        
        while(start<end)
        {
            int mid = start + (end-start)/2;
            
            if(arr[mid] < arr[mid+1])
            {
                start = mid+1;
            }
            else 
            {
                end = mid;
            }
        }
        return arr[start];
    }
    
}
