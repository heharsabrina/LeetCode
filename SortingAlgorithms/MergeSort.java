package SortingAlgorithms;

import java.util.Arrays;

/* Time Complexity:
 *  Best Case: O(n log n)
 *  Average Case: O(n log n)
 *  Worst Case: O(n log n)
 * Space Complexity: O(n)
 * 
 * Stable: Yes
*/

public class MergeSort 
{
    public void mergeSort(int[] arr, int lb, int ub)
    {
        if(lb<ub)
        {
            int mid=(lb+ub)/2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid+1, ub);
            merge(arr, lb, mid, ub);
        }
    }
    public void merge(int[] arr, int lb, int mid, int ub)
    {
        int temp[]=new int[arr.length];
        for(int x=lb; x<=ub; x++)
            temp[x]=arr[x];

        int i=lb, j=mid+1, k=lb;
        while(i<=mid && j<=ub)
        {
            if(temp[i]<=temp[j])
                arr[k++]=temp[i++];
            else
                arr[k++]=temp[j++];
        }
        while(i<=mid)
            arr[k++]=temp[i++];
        while(j<=ub)
            arr[k++]=temp[j++];
    }
    public static void main(String[] args)
    {
        int[] arr={38, 27, 43, 3, 9, 82, 10};
        System.out.println("Unsorted Array: "+Arrays.toString(arr));

        MergeSort sorter=new MergeSort();
        sorter.mergeSort(arr, 0, arr.length-1);

        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}