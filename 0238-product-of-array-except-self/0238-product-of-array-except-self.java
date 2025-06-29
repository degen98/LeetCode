class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int left = 1;
        int right = 1;
        for(int i = 0;i<nums.length;i++)
        {
            result[i] = left;
            left = left * nums[i];
        }
     
        for(int i = result.length - 1;i>=0;i--)
        {
            result[i] = result[i] * right;
            right = right * nums[i];
        }
        
        return result;
        
    }
}