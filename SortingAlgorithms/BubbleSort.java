package SortingAlgorithms;

import java.util.Arrays;

/* Time Complexity:
 *  Best Case: O(n) -> If the array is already sorted, then there is no need for sorting.
 *  Average Case: O(n^2) -> It occurs when the elements of the array are in jumbled order (neither ascending nor descending).
 *  Worst Case: O(n^2) -> If we want to sort in ascending order and the array is in descending order then the worst case occurs.
 * 
 * Space Complexity: O(1) -> In-place sorting
 * 
 * Stable: Yes
*/

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] data = {-2, 45, 0, 11, -9, 122, 140};
        int i, j, n=data.length;
        boolean swapped;

        for(i=0; i<n-1; i++)
        {
            swapped = false;
            for(j=0; j<n-i-1; j++)
            {
                if(data[j]>data[j+1])
                {
                    int temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        System.out.println(Arrays.toString(data));
    }
}