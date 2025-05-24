
class Main {
    public static void main(String[] args) {
        char[] arr = {'c','f','g'};
        char target = 'g';
        char ans = charGreaterThanSmallestChar(arr, target);
        System.out.println(ans);
    }
    
    public static char charGreaterThanSmallestChar(char[] arr, char target)
    {
        int start = 0;
        int end = arr.length - 1;
        
        if(target > arr[end]){
            return arr[start];
        }
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else 
            {
                start = mid + 1;
            }
            
        }
        return arr[start%arr.length];
    }
    
}
