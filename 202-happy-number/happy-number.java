class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast!=1){
            slow = findsquare(slow);
            fast = findsquare(fast);
            fast = findsquare(fast);
            if(slow == fast && slow != 1){
                return false;
            }
        }
        return true;
    }
    public int findsquare(int nums){
        int sum = 0;
        while(nums>0){
            int digit = nums%10;
            nums = nums/10;
            sum = sum + digit*digit;
        }
        return sum;
    }
    
}