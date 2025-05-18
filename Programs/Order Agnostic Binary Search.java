class Main {
    public static void main(String[] args) {
        
        int[] arr = {2,3,6,9,11,19,24,39,40};
        int[] arr2 = {87,71,67,55,43,29,22,7,-100};
        
        int index = orderAgnosticBS(arr,19);
        int index2 = orderAgnosticBS(arr2,22);
        
        System.out.println(index);
        System.out.println(index2);
    }
    
   public static int orderAgnosticBS(int[] arr, int target)
   {
       int start = 0;
       int end = arr.length - 1;
       boolean isAsc = arr[start]<arr[end];
       
       while( start<=end )
       {
           int mid = start + (end - start)/2;
           
           if(arr[mid] == target){
               return mid;
           }
           
           if(isAsc)
           {
               if(target>arr[mid]){
                   start = start + 1;
               }
               else{
                   end = end - 1;
               }
           }
           else
           {
               if(target>arr[mid])
               {
                   end = end-1;
               }
               else{
                   start = start + 1;
               }
           }
           
       }
       
       return -1;
       
   }
    
}
