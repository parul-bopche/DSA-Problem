class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    //<=k
    private int atMost(int[] nums, int k) {
        int n = nums.length;
        int l = 0, res = 0;int r=0;
        Map<Integer, Integer> freq = new HashMap<>();
        
        while(r<n) {
            freq.put(nums[r], freq.getOrDefault(nums[r], 0) + 1);
            
            while (freq.size() > k) {
                freq.put(nums[l], freq.get(nums[l]) - 1);
                if (freq.get(nums[l]) == 0) freq.remove(nums[l]);
                l++;
            }
            
            res += (r - l + 1);
            r++;
        }
        
        return res;
    }
}

//le brute force smbhal
 // check every subarray
        // for (int i = 0; i < n; i++) {
        //     HashSet<Integer> set = new HashSet<>();
        //     for (int j = i; j < n; j++) {
        //         set.add(nums[j]);
        //         // if subarray [i..j] has all k distinct elements
        //         if (set.size() == k) {
        //             ans++;
        //         }
        //     }
        // }
