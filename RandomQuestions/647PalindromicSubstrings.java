package RandomQuestions;

// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution
{
    public int countSubstrings(String s)
    {
        int result=0;

        for(int i=0;i<s.length();i++)
        {
            result+=count_palindrome(s, i, i);
            result+=count_palindrome(s, i, i+1);
        }
        return result;
    }
    private int count_palindrome(String s, int l, int r)
    {
        int count=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            count++;
            l--;
            r++;
        }
        return count;
    }
}