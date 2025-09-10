class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int maxLen =0;
       int r =0; int l =0; 
       HashMap<Integer,Integer> map = new HashMap<>();
       while(r<n){
        //pehele right ko kr put
         map.put(nums[r],map.getOrDefault(nums[r],0)+1);

          while(map.get(nums[r])>k){
             map.put(nums[l],map.get(nums[l])-1);
             if(map.get(nums[l])==0) {
                map.remove(nums[l]);
             }
            l++;
          }
          maxLen = Math.max(maxLen , r-l+1);
          r++;
       }
       return maxLen;
    }
}