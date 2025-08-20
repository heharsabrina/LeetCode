package PatternPrograms;

/*
    * 
   * *
  * * *
 * * * *
* * * * *
*/

public class PyramidStar_2
{
    public static void main(String[] args)
    {
        int n=5, i, j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}