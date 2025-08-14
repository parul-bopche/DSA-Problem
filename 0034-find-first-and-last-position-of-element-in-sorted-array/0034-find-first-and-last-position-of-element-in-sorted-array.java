class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstFind(nums,target);
        if(first == -1) return new int[]{-1,-1};
        int last = lastFind(nums,target);
        return new int[]{first,last};
    }
    static int firstFind(int[] nums,int target){
     int low = 0;
     int high = nums.length -1;
     int first = -1;
     while(low<=high){
        int mid = (low+ high)/2;
        if(nums[mid]==target){
            first = mid;
            high = mid-1;
        }else if(nums[mid]<target){
            low = mid + 1;
        }else{
            high = mid -1;
        }
     }
     return first;
    }
     static int lastFind(int[] nums,int target){
        int last = -1;
         int low = 0;
     int high = nums.length -1;
     while(low<=high){
        int mid = (low+ high)/2;
        if(nums[mid]==target){
            last = mid;
             low = mid + 1;
            
        }else if(nums[mid]<target){
            low = mid+1;
        }else{
           high = mid-1;
        }
     }
     return last;
    }
}