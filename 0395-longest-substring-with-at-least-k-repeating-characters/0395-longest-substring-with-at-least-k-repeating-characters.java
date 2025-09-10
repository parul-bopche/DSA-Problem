class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        int maxLen =0;
        for(int i=0;i<n;i++){
            int[] hash = new int[26];
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                  hash[ch-'a']++;
               if (isValid(hash, k)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
     private boolean isValid(int[] freq, int k) {
        for (int count : freq) {
            if (count > 0 && count < k) return false;  //>=k dekhana sare character ka
        }
        return true;
    }
}