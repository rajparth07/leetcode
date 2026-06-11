class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxending = nums[0];
        int maxsum = nums[0];
        int totalsum = nums[0];
        for(int i = 1; i<n; i++){
            maxending = Math.max(nums[i], nums[i]+maxending);
            maxsum = Math.max(maxsum, maxending);
            
            totalsum += nums[i];
        }
        if(maxsum<0){
            return maxsum;
        }
        int minending = nums[0];
        int minsum = nums[0];
        for(int i = 1; i<n; i++){
            minending = Math.min(nums[i], nums[i] + minending);
            minsum = Math.min(minsum, minending);
        }
        int circularsum = totalsum - minsum;
        return Math.max(circularsum , maxsum);
    }
}