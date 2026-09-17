class Solution {
    public int[] twoSum(int[] nums, int target) {

        int position1 = 0;
        int position2 = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i] + nums[j] == target) {
                    position1 = i;
                    position2 = j;
                }
            }
        }
        return new int[]{position1, position2};
    }
}