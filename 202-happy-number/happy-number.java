class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = findsquare(n);
        while(slow!=fast){
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));
        }
        return slow == 1;
    }
    public int findsquare(int num){
        int sum = 0;
        while(num>0){
            int digit = num % 10;
            sum += digit*digit;
            num = num/10;
        }
        return sum;
    }
}