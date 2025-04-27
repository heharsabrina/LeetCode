// Time Complexity: O(N)
// Space Complexity: O(N)

class Solution
{
    public int singleNumber(int[] nums)
    {
        HashSet<Integer> hs=new HashSet<>();
        int i;
        for (int num:nums)
        {
            if (!hs.add(num))
            {
                hs.remove(num);
            }
        }
        Iterator<Integer> it=hs.iterator();
        return it.next();
    }
}