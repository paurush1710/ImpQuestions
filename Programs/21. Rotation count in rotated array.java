class Main{
    
    public static void main(String[] args){
        
        int[] arr = {12, 14, 16, 3, 4, 7, 11};
        int[] arr2 = {2, 2, 2, 3, 4, 5, 6,13, 0, 1, 2};
        int[] arr3 = {2, 2, 2, 2,2,2,2,2};
        
        int index = countRotatedBinarySearch(arr2);
        System.out.println(index);
    }
    
    public static int countRotatedBinarySearch(int[] arr)
    {
        int pivot = pivotWithDuplicates(arr);
        return pivot + 1;
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
}
