class Solution {
    public int daysRequired(int[] weights,int capacity){
        int n = weights.length;
        int days = 1; int load =0;
        for(int i=0;i<n;i++){
            if(load+weights[i]>capacity){
                days++;
                load = weights[i];
            }else{
                load+=weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int maxi = Integer.MIN_VALUE; int sum =0;
        for(int i=0;i<n;i++){
            sum+=weights[i];
            maxi = Math.max(maxi,weights[i]);
        }
        int low = maxi; int high = sum;
        while(low<=high){
            int mid= (low+high)/2;
            int NoOfDays = daysRequired(weights,mid);
            if(NoOfDays<=days){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }
}