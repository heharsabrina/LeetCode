package RandomQuestions;

// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution
{
    public int getSum(int a, int b) 
    {
        while(b!=0) //Until carry is 0
        {
            int carry=(a & b)<<1; //Carry
            int sum=a ^ b; //Sum without carry
            a=sum; //Update sum
            b=carry; //Update carry
        }
        return a; //Return sum
    }
}