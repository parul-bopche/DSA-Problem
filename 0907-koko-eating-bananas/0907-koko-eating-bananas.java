class Solution {
    public int fun(int[] piles,int hours){
        int  n = piles.length;
        int totalhrs =0;
        for(int i=0;i<n;i++){
            totalhrs+= Math.ceil((double)piles[i]/(double)hours);
        }
        return  totalhrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,piles[i]);
        }
        int low = 1 ; int high = max;
        int ans =Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            int totalhours = fun(piles,mid);
            if(totalhours<=h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
}