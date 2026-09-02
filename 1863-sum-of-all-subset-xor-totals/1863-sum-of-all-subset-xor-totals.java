class Solution {
    public int subsetXORSum(int[] nums) {
        int bitwiseOr = 0;
        
        // Step 1: Combine all bits present across all elements
        for (int num : nums) {
            bitwiseOr |= num;
        }
        
        // Step 2: Multiply the result by 2^(N-1) using bitwise left shift
        return bitwiseOr << (nums.length - 1);
    }
}
