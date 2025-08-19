package RandomQuestions;

// Time Complexity: O(n log n)
// Space Complexity: O(n)

class Solution
{
    public int[] sortArray(int[] nums)
    {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
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
}