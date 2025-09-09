class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int lsum= 0 , rsum = 0;
       int n = cardPoints.length;
       int maxSum =0;
       for(int i=0;i<k;i++){
        lsum+=cardPoints[i];
       }
       maxSum = lsum;
      int rInd = n-1;
       for(int i=k-1;i>=0;i--){
        lsum = lsum - cardPoints[i];
        rsum+=cardPoints[rInd];
        rInd--;
        maxSum = Math.max(maxSum,lsum+rsum);
       }
       return maxSum;
    }
}