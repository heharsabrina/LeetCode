package SortingAlgorithms;

import java.util.Arrays;

/* Time Complexity:
 *  Best Case: O(N log N) -> If the array is nearly sorted and a good gap sequence is used.
 *  Average Case: Depends on gap sequence.
 *  Worst Case: O(N^2) -> The Shell’s original gap sequence (n/2, n/4, ..., 1) gives worst-case.
 * 
 * Space Complexity: O(1) -> In-place sorting
 * 
 * Stable: No
 * 
 * Better gap sequences improve performance:
 *  Hibbard's Sequence: (2^k)-1
 *  Knuth's Sequence: ( (3^k)−1 )/2
 *  Ciura's Sequence: empirically optimized for small n
*/
public class ShellSort
{
    public static void main(String args[])
    {
        int[] arr={63, 19, 7, 90, 81, 36, 54, 45, 72, 27, 22, 9, 41, 59, 33};
        int n=arr.length;
        for(int gap=n/2; gap>0; gap/=2)
        {
            for (int i=gap; i<n; i++)
            {
                int temp=arr[i];
                int j=i;

                while(j>=gap && arr[j-gap]>temp)
                {
                    arr[j]=arr[j-gap];
                    j-=gap;
                }
                arr[j]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}