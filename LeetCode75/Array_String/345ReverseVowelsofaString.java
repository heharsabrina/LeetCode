package LeetCode75.Array_String;

// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution
{
    public String reverseVowels(String s)
    {
        char c[]=s.toCharArray();
        int i=0, j=s.length()-1;
        while(i<j)
        {
            while(i<j && !isVowel(c[i])) i++;
            while(i<j && !isVowel(c[j])) j--;

            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;

            i++;
            j--;
        }
        return new String(c);
    }
    private boolean isVowel(char c)
    {
        return "AEIOUaeiou".indexOf(c)!=-1;
    }
}