// Time Complexity: O(N)
// Space Complexity: O(N)

class Solution
{
    public int lengthOfLongestSubstring(String s)
    {
        int l=0, r, maxLen=0;
        HashSet<Character> charSet=new HashSet<>();


        for(r=0; r<s.length(); r++)
        {
            while(charSet.contains(s.charAt(r)))
            {
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            maxLen=Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}