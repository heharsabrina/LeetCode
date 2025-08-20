package PatternPrograms;

/*
      1 
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4
*/

public class PalindromeTriangle
{
    public static void main(String[] args)
    {
        int n=4, i, j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            for(j=2;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}