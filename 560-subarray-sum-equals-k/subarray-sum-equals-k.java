class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int res = 0;
        Map<Integer, Integer> f = new HashMap<>();
        f.put(0,1);
        for(int i = 0; i<n; i++){
            sum += nums[i];
            int ques = sum - k;
            int freq =  f.getOrDefault(ques,0);
            res += freq;
            f.put(sum, f.getOrDefault(sum,0)+1);
        }
        return res;
    }
}