class Solution {
    public int maxAbsoluteSum(int[] nums) {
       int maxending = 0 , minending = 0;
       int maxsum = 0 , minsum = 0;
       for(int i = 0; i<nums.length; i++){
        maxending = Math.max(nums[i] , maxending + nums[i]);
        minending = Math.min(nums[i], minending + nums[i]);

        maxsum = Math.max(maxsum, maxending);
        minsum = Math.min(minsum, minending);
       }
       return Math.max(maxsum , Math.abs(minsum)); 
    }
}