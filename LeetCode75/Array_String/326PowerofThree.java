package LeetCode75.Array_String;

// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution
{
    public boolean isPowerOfThree(int n)
    {
        if(n<=0) return false;
        while(n%3 == 0) n/=3;
        return n==1;
    }
}