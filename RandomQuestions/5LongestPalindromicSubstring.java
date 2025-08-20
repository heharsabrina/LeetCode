package RandomQuestions;

// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution
{
    public String longestPalindrome(String s)
    {
        if(s==null||s.length()==0) return "";

        int start=0, end=0;

        for(int i=0;i<s.length();i++)
        {
            int odd=expandAroundCenter(s, i, i); //Odd Palindrome ('a', 'b', 'aba')
            int even=expandAroundCenter(s, i, i+1); //Even Palindrome ('aa', 'bb', 'abba')
            int max_len=Math.max(odd, even);

            if(max_len>(end-start))
            {
                start=i-(max_len-1)/2;
                end=i+max_len/2;
            }
        }
        return s.substring(start, end+1);
    }
    private int expandAroundCenter(String s, int l, int r)
    {
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }
        return r-l-1;
    }
}