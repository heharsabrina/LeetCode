package PatternPrograms;

/*
    1 
    1 2 
    1 2 3 
    1 2 3 4 
    1 2 3 4 5 
*/

public class NumberIncreasingPyramid
{
    public static void main(String[] args)
    {
        int n=5, i, j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}