class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for(int i = 0; i<s.length() - 1; i++){
            int current = value(s.charAt(i));
            int next = value(s.charAt(i+1));
            if(current<next){
                ans-=current;
            }
            else{
                ans+=current;
            }
        }
        ans += value(s.charAt(s.length()-1));
        return ans;
    }
    public int value(char c){
        if(c == 'I'){
            return 1;
        }
        else if(c == 'V'){
            return 5;
        }
        else if(c == 'X' ){
            return 10;
        }
        else if(c == 'L'){
            return 50;
        }
        else if(c == 'C'){
            return 100;
        }
        else if(c == 'D'){
            return 500;
        }
        else if(c == 'M'){
            return 1000;
        }
        return 0;
    }
}