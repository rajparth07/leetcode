class Solution {
    public boolean fun(int[] have, int[] need){
        for(int i = 0; i<256; i++){
            if(have[i]<need[i]){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int [] have = new int [256];
        int [] need = new int [256];

        if(n<m){
            return "";
        }

        for(int i = 0; i<m; i++){
            char c = t.charAt(i);
            need[c]++;
        }
        int low = 0;
        int res = Integer.MAX_VALUE;
        int start = -1;
        for(int high = 0; high<n; high++){
            char d = s.charAt(high);
            have[d]++;
            while(fun(have , need)){
                int len = high - low +1;
                if(len<res){
                    res = len;
                    start = low;
                }
                char e = s.charAt(low);
                have[e]--;
                low ++;
            }
        }
        if(res == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start, start+res);     
    }
}