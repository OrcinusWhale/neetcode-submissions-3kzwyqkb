class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int[] answer = new int[2];
        for (int i=0; i<nums.length; ++i) {
            numMap.put(nums[i], i);
        }
        for (int i=0; i<nums.length; ++i) {
            if (numMap.containsKey(target-nums[i]) && i != numMap.get(target-nums[i])) {
                answer[0] = i;
                answer[1] = numMap.get(target-nums[i]);
                return answer;
            }
        }
        return answer;
    }
}
