package SortingAlgorithms;

import java.util.Arrays;

/* Time Complexity:
 *  Best Case: O(N) -> Already sorted array. For each element, the inner while loop does not run at all.
 *  Average Case: O(N^2) -> Random order. Each new element will need to shift past half of the already sorted sub-array.
 *  Worst Case: O(N^2) -> Reverse sorted array. Every new element must be compared and shifted past all previously sorted elements.
 * 
 * Space Complexity: O(1) -> In-place sorting
 * 
 * Stable: Yes
*/
public class InsertionSort
{
    public static void main(String args[])
    {
        int[] arr={2, 8, 5, 3, 9, 4};
        int i, j, temp;
        for(i=1;i<arr.length;i++)
        {
            j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}