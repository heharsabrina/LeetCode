package SearchingAlgorithms;

// Time Complexity: O(n)
// Space Complexity: O(1)

public class LinearSearch
{
    public static void main(String[] args)
    {
        int arr[]={3, 1, 2, 0, 9};
        int x=0, index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                index=i;
                break;
            }
        }
        if(index!=-1)
            System.out.println("Element found at index "+index);
        else
            System.out.println("Element not found");
    }
}