class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];
        int product = 1;
        for (int i=0; i<nums.length; ++i) {
            prefixProduct[i] = product;
            product *= nums[i];
        }
        product = 1;
        for (int i=nums.length-1; i>=0; --i) {
            suffixProduct[i] = product;
            product *= nums[i];
        }
        for (int i=0; i<nums.length; ++i) {
            output[i] = prefixProduct[i]*suffixProduct[i];
        }
        return output;
    }
}  
