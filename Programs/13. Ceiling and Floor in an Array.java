class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,7,11,16,18,22,24,30};
        int target = 20;
        int index = ceiling(arr, target);
        System.out.println(index);
        int index2 = floor(arr, target);
        System.out.println(index2);
    }
    
    public static int ceiling(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        
        if(target>arr[end])
        {
            return -1;
        }
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if(target < arr[mid] )
            {
                end = mid - 1;
            }
            
            else{
                return mid;
            }
        }
        return start;
    }
    
    public static int floor(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length -1;
        if(target < arr[start])
        {
            return -1;
        }
        
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            
            if(target > arr[mid])
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
        
        return end;
    }
    
}
