import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,12,14,22,24,30,23,19,15,7};
        int target = 19;
        int ans = searchInMountain( arr, target);
        System.out.println(ans);
    }
    
    public static int searchInMountain(int[] arr, int target)
    {
        int peakIndex = peakIndexOfArr(arr);
        int index = binarySearch(arr, target, 0, peakIndex, true);
        
        if(index != -1)
        {
            return index;
        }
        return binarySearch(arr, target, peakIndex + 1, arr.length-1, false);
    }
    
    public static int peakIndexOfArr(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        
        while(start<end)
        {
            int mid = start + (end-start)/2;
            
            if(arr[mid]>arr[mid+1])
            {
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    
    public static int binarySearch(int[] arr, int target, int start, int end, boolean asc)
    {
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            if(asc){
                
                if(target > arr[mid])
                 {
                    start = mid+1;
                }
                else
                {
                    end = mid - 1;
                }
            }
            else{
                if(target < arr[mid])
                 {
                    start = mid+1;
                }
                else
                {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
