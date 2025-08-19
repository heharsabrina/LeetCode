package SearchingAlgorithms;

// Time Complexity: O(log n) The search space halves each iteration.
// Space Complexity: O(1) No extra memory is used.

public class BinarySearch
{
    public static void main(String[] args)
    {
        int arr[]={1, 2, 3, 7, 11};
        int key=7, index=-1;
        
        int l=0, r=arr.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(key==arr[mid])
            {
                index=mid;
                break;
            }
            else if(key>arr[mid])
                l=mid+1;
            else
                r=mid-1;
        }
        if(index!=-1)
            System.out.println("Element found at index "+index);
        else
            System.out.println("Element not found");
    }
}
