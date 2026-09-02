class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i<nums.length -2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length -1;
            int sum = -1 * nums[i];
            while(left<right){
                int s = nums[left] + nums[right];
                if(s == sum){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    res.add(temp);
                    left++;
                    right --;
                    while(left<nums.length && nums[left] == nums[left -1]){
                        left++;
                    }
                    while(right>=0 && nums[right] == nums[right+1]){
                        right--;
                    }
                }
                else if(s<sum){
                    left++;
                }
                else{
                    right --;
                }
            }
        }
        return res;
    }
}