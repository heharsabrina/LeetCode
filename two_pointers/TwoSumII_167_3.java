package two_pointers;

import java.util.HashMap;
import java.util.Map;

// HashMap - For when the array is NOT sorted
// Time Complexity: O(N) -  Outer loop
// Space Complexity: O(N) - Stores up to n elements in HashMap

public class TwoSumII_167_3 {
    public int[] twoSum(int[] numbers, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++)
        {
            if (map.containsKey(target - numbers[i]))
                return new int[]{map.get(target - numbers[i]), i + 1};

            map.putIfAbsent(numbers[i], i + 1);
        }
        return new int[0];
    }
}