class Solution {
    public int maxProduct(int[] nums) {
         int pref = 1 ; int suff =1;
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(pref ==0) pref=1;
            if(suff==0) suff =1;
            pref= pref*nums[i];
            suff = suff*nums[n-i-1];
            maxi = Math.max(maxi,Math.max(pref,suff));
        }
        return maxi;
    }
}