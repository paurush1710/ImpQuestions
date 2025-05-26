class Main{
    
    public static void main(String[] args){
        
        int[] arr = {7,2,5,10,8};
        
        int index = splitArrayLargest(arr, 4);
        System.out.println(index);
    }
    
    public static int splitArrayLargest(int[] arr, int k)
    {
        int start = 0;
        int end = 0;
        
        for(int i=0; i<arr.length; i++)
        {
            start = Math.max(start,arr[i]);
            end +=arr[i];
        }
        
        while(start<end)
        {
            int mid = start + (end-start)/2;
            
            int sum = 0;
            int pieces = 1;
            
            for(int x : arr)
            {
                if(sum + x > mid)
                {
                    sum = x;
                    pieces++;
                }
                else{
                    sum +=x;
                }
            }
            
            if(pieces>k)
            {
                start = mid+1;
            }
            else{
                end = mid;
            }
            
        }
        
        return end; // start == end
        
    }
}
