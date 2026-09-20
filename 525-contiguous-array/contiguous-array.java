class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int zero = 0;
        int one = 0;
        int res = 0;
        Map<Integer , Integer > f = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(nums[i] == 0){
                zero++;
            }
            else{
                one++;
            }
            int dif = zero - one;
            if(dif == 0){
                res = Math.max(res, i +1);
                continue;
            }
            if(f.containsKey(dif)){
                int idx = f.get(dif);
                int len = i - idx;
                res = Math.max(res, len);
            }
            else{
                f.put(dif, i);
            }
        }
        return res;
    }
}