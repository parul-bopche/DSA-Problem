class Solution {
    public int distributeCandies(int n, int limit) {
       int cnt=0;
        for(int i=0;i<=limit;i++){
            for(int j=0;j<=limit;j++){
                for(int k=0;k<=limit;k++){
                    int sum = i+j+k;
                    if(sum==n){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}