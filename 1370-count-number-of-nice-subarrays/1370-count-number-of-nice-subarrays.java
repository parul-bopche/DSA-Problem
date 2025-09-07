//dekh revise revise rervise
class Solution{
    public int numberOfSubarrays(int[] nums, int k) {
          return atmost(nums,k) - atmost(nums,k-1);
    } 
    public int atmost(int[] nums,int k){
        if(k<0) return 0;
        int n = nums.length;
        int l = 0; int r=0;
        int oddCount = 0; int cnt = 0;
        while(r<n){
            if(nums[r]%2==1) oddCount++;
            while(oddCount>k){
                if(nums[l]%2==1)   oddCount--;
                 l++;
            }
            cnt+= (r-l+1);
            r++;

        }
        return cnt;
    }
}