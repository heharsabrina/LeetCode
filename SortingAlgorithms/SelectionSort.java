package SortingAlgorithms;

import java.util.Arrays;

/* Time Complexity:
 *  Best Case: O(N^2) -> Still compares all pairs - no early exit optimization.
 *  Average Case: O(N^2)
 *  Worst Case: O(N^2) -> Comparisons are always done regardless of order.
 * 
 * Space Complexity: O(1) -> In-place sorting
 * 
 * Stable: No
 *  Selection sort can be implemented as a stable sort if, rather than swapping the minimum value with its current value,
 *  the minimum value is inserted into the first position and the intervening values shifted up.
 *  However, this modification either requires a data structure that supports efficient insertions or
 *  deletions, such as a linked list, or it leads to O(N^2) writes.
*/
public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr={2, 8, 5, 3, 9, 4, 1};
        int n=arr.length, temp=0, j;

        for(int i=0; i<n-1; i++)
        {
            int minIndex=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minIndex])
                    minIndex=j;
            }
            if(minIndex!=i)
            {
                temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}