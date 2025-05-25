import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,12,14,22,24,30,100,121,198,212,220,300};
        int target = 198;
        int ans = infiniteArr( arr, target );
        System.out.println(ans);
    }
    
    public static int infiniteArr( int[] arr, int target )
    {
        int start = 0;
        int end = 1;
        
        while(target>arr[end])
        {
            int newStart = end + 1;
            end = (end - start + 1)*2 + end;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }
    
    public static int binarySearch(int[] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(target>arr[mid])
            {
                start = mid + 1;
            }
            else if(target < arr[mid])
            {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
