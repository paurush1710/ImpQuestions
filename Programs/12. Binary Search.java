// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        int[] arr = {2,3,6,9,11,19,24,39,40};
        
        int index = binarySearch(arr,6);
        int index2 = binaryWithWhile(arr,6);
        
        System.out.println(index);
        System.out.println(index2);
    }
    
    public static int binarySearch( int[] arr, int target)
    {
        if(arr.length == 0){
            return -1;
        }
        
        int s = arr[0];
        int e = arr.length -1;
        
        return binary(arr, target, s, e);
    }
    
    public static int binary( int[] arr, int target, int s, int e )
    {
        if(arr.length == 0){
            return -1;
        }
        
        if(s>e){
            return -1;
        }
        
        int m = s + (e-s)/2;
        if(arr[m]== target){
            return m;
        }
        
        if(target > arr[m]){
            return binary(arr,target, m+1,e);
        }
        else{
            return binary(arr,target, s, m-1);
        }
        
    }
    
    public static int binaryWithWhile(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        
        while( start <= end )
        {
            int mid = start + (end - start)/2;
            
            if(target > arr[mid])
            {
                start = mid+1;
            }
            else if (target< arr[mid])
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
