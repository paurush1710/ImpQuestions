class Main{
    
    public static void main(String[] args){
        
        int[] arr = {12, 14, 16, 3, 4, 7, 11};
        int[] arr2 = {2, 2, 2, 3, 4, 5, 6, 0, 1, 2};
        int[] arr3 = {2, 2, 2, 2,2,2,2,2};
        
        int target = 2;
        int index = rotatedBinarySearch(arr3, target);
        System.out.println(index);
    }
    
    public static int rotatedBinarySearch(int[] arr, int target)
    {
        int p = pivotWithDuplicates(arr);
        if(p==-1){
            return bs(arr, target, 0, arr.length-1);
        }
        
        if(target >= arr[0])
        {
            return bs(arr,target, 0, p-1);
        }
        else{
            return bs(arr,target, p+1, arr.length-1);
        }
        
    }
    
    public static int pivotWithDuplicates(int[] arr){
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if( mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if( mid>start && arr[mid-1]>arr[mid])
            {
                return mid-1;
            }
            
            if(arr[mid] == arr[start] && arr[mid]==arr[end])
            {
                if(arr[start]>arr[start+1])
                {
                    return start;
                }
                start++;
                
                if(arr[end-1]>arr[end])
                {
                    return end-1;
                }
                end--;
            }
            else if (arr[mid]>arr[start] || (arr[mid]==arr[start] && arr[mid]>arr[end] ))
            {
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
            
        }
        return -1;
    }
    
    public static int bs(int[] arr, int target, int start, int end)
    {
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if(target< arr[mid])
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
