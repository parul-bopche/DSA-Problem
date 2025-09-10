class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }
        int k = hs.size();
        return atMost(nums,k) - atMost(nums,k-1);
    }
    public int atMost(int[] nums, int k){
        int n = nums.length;
        int l =0, r=0 , cnt =0;
        Map<Integer,Integer> map =  new HashMap<>();
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
           while(map.size()>k){
            map.put(nums[l],map.get(nums[l])-1);
            if(map.get(nums[l])==0) map.remove(nums[l]);
            l++;
           }
           cnt+= (r-l+1);
           r++;
        }
         return cnt;
    }
}