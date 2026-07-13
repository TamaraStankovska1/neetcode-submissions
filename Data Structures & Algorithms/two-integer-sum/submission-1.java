class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index = 0;
        int index2 = 0;
        for (int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target && i != j){
                    index = i;
                    index2 = j;
                }
            }
        }
        return new int[]{index,index2};
    }
}
