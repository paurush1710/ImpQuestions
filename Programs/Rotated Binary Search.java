 
class Main {
    public static void main(String[] args) {
        int[] arr = {11,12,17,23,32,420,1,2,5,8};
        
        System.out.println(pivot(arr));
        System.out.println(rotatedBinarySearch(arr, 11));
        
    }
    
    public static int rotatedBinarySearch(int[] arr, int target)
    {
       int pivotIndex = pivot(arr);
       
       if(pivotIndex == -1)
       {
           return binarySearch(arr,target, 0, arr.length-1);
       }
       
       if(target == arr[pivotIndex])
       {
           return pivotIndex;
       }
       
    //   if(target>arr[pivotIndex]){
    //       System.out.println("Reached here //28");
    //       return binarySearch(arr,target, 0, pivotIndex-1); 
    //   }
    
        if( target >= arr[0] ){
          return binarySearch(arr,target, 0, pivotIndex-1); 
        }
       else{
           return binarySearch(arr,target, pivotIndex+1, arr.length -1); 
       }
       
    }
    
    public static int pivot(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(mid < end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if ( mid > start && arr[mid - 1] > arr[mid])
            {
                return mid-1;
            }
            
            if(arr[start]>=arr[mid])
            {
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
            
        }
        return -1;  
    }
    
    public static int binarySearch(int[] arr, int target, int start, int end){
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
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
        return -1;
    }
    
}
