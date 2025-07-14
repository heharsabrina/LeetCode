package two_pointers;

// Two Pointers
// Time Complexity: O(N)
// Space Complexity: O(1)

public class IsSubsequence_392
{
    public boolean isSubsequence(String s, String t)
    {
        int i=0, j=0;
        while(i<t.length() && j<s.length())
        {
            if(t.charAt(i)==s.charAt(j))
            {
                i++;
                j++;
            }
            else
                i++;
        }
        return j==s.length();
    }
}
