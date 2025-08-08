class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length();
       int maxLen = 0;
       for(int i=0;i<s.length();i++){
        int[] freq = new int[256];
        for(int j=i;j<s.length();j++){
            char ch = s.charAt(j);
            if(freq[ch]>0){
                break;
            }
            freq[ch]++;
            maxLen = Math.max(maxLen,j-i+1);
        }
       }
       return maxLen;
    }
}