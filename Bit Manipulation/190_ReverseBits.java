// Time Complexity: O(1)
// Space Complexity: O(1)

public class Solution
{
    // you need treat n as an unsigned value
    public int reverseBits(int n)
    {
        int res=0, i=1;
        while(i<=32)
        {
            res=(res<<1)|(n&1);
            n>>>=1;
            i++;
        }
        return res;
    }
}