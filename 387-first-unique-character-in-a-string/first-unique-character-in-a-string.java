class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        HashMap<Character, Integer> f = new HashMap<>();
        for(int i = 0; i<n; i++){
            char keshav = s.charAt(i);
            f.put(keshav, f.getOrDefault(keshav, 0)+1);
        }
        for(int i = 0; i<n; i++){
            char keshav = s.charAt(i);
            if(f.get(keshav) == 1){
                return i;
            }    
        }
        return -1;
    }
}