package RandomQuestions;

public class engineering
{
    public static void main(String[] args)
    {
        String str = "ENGINEEERING";
        StringBuilder duplicates = new StringBuilder();
        StringBuilder nonDuplicates = new StringBuilder();

        int i = 0;
        while (i < str.length())
        {
            int j = i;

            // move j forward while same character repeats
            while (j < str.length() && str.charAt(j) == str.charAt(i))
            {
                j++;
            }

            int count = j - i; // length of this run

            if (count > 1)
            {
                // it's a duplicate run (like EE, EEE, etc.)
                duplicates.append(str.substring(i, j));
            }
            else
            {
                // it's a single character
                nonDuplicates.append(str.charAt(i));
            }

            // move i to the next new character
            i = j;
        }

        System.out.println("Duplicates: " + duplicates);
        System.out.println("Non-duplicates: " + nonDuplicates);
    }    
}
