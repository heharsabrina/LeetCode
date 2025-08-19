package RandomQuestions;

public class lengthOfString
{
    public static void main(String[] args)
    {
        String s="Leetcode";
        int count=0;
        for(char c:s.toCharArray())
            count++;
        System.out.println(count);

        int count_2=0;
        try
        {
            while(true)
            {
                s.charAt(count_2);
                count_2++;
            }
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(count_2);
        }

        System.out.println(s.length());
    }
}
