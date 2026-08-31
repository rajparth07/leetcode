class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        // Seperate positive and negative nuber
        for(int num = 0; num<n; num++){
            if(nums[num]<0){
                neg.add(nums[num]);
            }
            else{
                pos.add(nums[num]);
            }
        }
        // case 1 no negative number
        if(neg.size() == 0){
            for(int i = 0; i<pos.size(); i++){
                pos.set(i, pos.get(i)* pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }
        // case 2 no positive number
        if(pos.size() == 0){
            for(int i =0; i<neg.size(); i++){
                neg.set(i,neg.get(i)*neg.get(i));
            }
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }
        // both positive and negative number
        int i = 0, j = 0, id=0;
        int n1 = neg.size();
        int n2 = pos.size();
        int res[] = new int[n1 +n2];
        // square negative number
        for( i = 0; i<n1; i++){
            neg.set(i,neg.get(i)*neg.get(i));
        }
        Collections.reverse(neg);
        // sqare positive number
        for( i =0; i<n2; i++){
            pos.set(i, pos.get(i)*pos.get(i));
        }
        i = 0;
        j = 0;
        // merge two array
        while(i<n1 && j< n2){
            if(neg.get(i)<=pos.get(j)){
                res[id] = neg.get(i);
                id++;
                i++;
            }
            else{
                res[id] = pos.get(j);
                id++;
                j++;
            }
        }
        while(i<n1){
            res[id] = neg.get(i);
            id++;
            i++;
        }
        while(j<n2){
            res[id] = pos.get(j);
            id++;
            j++;
        }
        return res;
            
    }
}