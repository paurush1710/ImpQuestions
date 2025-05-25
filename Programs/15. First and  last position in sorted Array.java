import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int[] arr = {1,3,7,7,7,7,8,8,12,14};
        int target = 7;
        int[] ans = searchRange( arr, target );
        System.out.println(Arrays.toString(ans));
      
        // int[] arr = {1,3,4,6,6,6,8,8,12,14};
        // int target = 6;
        // int[] ans = findSearchRange( arr, target );
        // System.out.println(Arrays.toString(ans));
    }


  public static int[] searchRange(int[] arr, int target)
    {
        int[] ans = {-1,-1};
        
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        
        ans[0] = start;
        ans[1] = end;
        
        return ans;
    }
    
    public static int search(int[] arr, int target, boolean firstIndex)
    {
        
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            
            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if (target<arr[mid])
            {
                end = mid-1;
            }
            else{
                ans = mid;
                if(firstIndex)
                {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


    // Brute Force Approach    
    // O(n) time complexity
    public static int[] findSearchRange(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        int[] ans = {-1,-1};
        
        for(int i=start; i<=end; i++)
        {
            if(arr[i] == target)
            {
                ans[0]=i;
                break;
            }
        }
        
        for(int i= end; i>=start; i--)
        {
            if(arr[i] == target)
            {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}
