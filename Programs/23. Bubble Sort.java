// Space Complexity - O(1) -> No extra space (aka in-place sorting algo)
// Time Complexity - Best Case - O(n) (If array is sorted)
//                   Worst Case - O(n*n)                 

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void bubbleSort(int[] arr)
    {
        boolean swapped;
        for(int i=0; i<arr.length; i++)
        {
            swapped = false;
            for(int j=1; j< arr.length-i; j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            
            if(!swapped)
            {
                break;
            }
        }
    }
    
}


//In your bubbleSort method, the swapped variable is used as an optimization to avoid unnecessary iterations once the array is already sorted.
