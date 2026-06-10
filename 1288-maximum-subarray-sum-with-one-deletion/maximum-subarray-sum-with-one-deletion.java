class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int nodel = arr[0];
        int onedel = 0;
        int res = arr[0];
        for(int i = 1; i<n; i++){
            int prevnodel = nodel;
            nodel = Math.max(nodel + arr[i], arr[i] );
            onedel = Math.max(onedel + arr[i], prevnodel);
            res = Math.max(res, Math.max(nodel, onedel));
        }
        return res;
    }
}