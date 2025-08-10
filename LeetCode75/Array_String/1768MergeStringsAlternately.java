// Time Complexity: O(m + n) where m is the length of word1 and n is the length of word2.
// Space Complexity: O(1)

class Solution
{
    public String mergeAlternately(String word1, String word2)
    {
        int i=0, j=0;
        StringBuilder sb=new StringBuilder();
        while(i<word1.length() && j<word2.length())
        {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        while(i<word1.length())
        {
            sb.append(word1.charAt(i++));
        }
        while(j<word2.length())
        {
            sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }
}