package Prefix_Sum;

/**
 * 303. Range Sum Query - Immutable
 * Given an integer array nums, handle multiple queries of the following type:
 * 
 * Calculate the sum of the elements of nums between indices left and right
 * inclusive where left <= right.
 * 
 * Implement the NumArray class:
 * 
 * - NumArray(int[] nums) Initializes the object with the integer array nums.
 * - int sumRange(int left, int right) Returns the sum of the elements of nums
 * between indices left and right inclusive (i.e. nums[left] + nums[left + 1] +
 * ... + nums[right]).
 */
class NumArray {
    public int prefixSum[];

    public NumArray(int[] nums) {
        this.prefixSum = nums;
        int i;
        for (i = 1; i < prefixSum.length; i++)
            prefixSum[i] += prefixSum[i - 1];
    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return prefixSum[right];
        else {
            return (prefixSum[right] - prefixSum[left - 1]);
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */