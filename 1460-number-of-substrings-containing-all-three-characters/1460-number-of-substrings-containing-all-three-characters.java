class Solution {
    public int numberOfSubstrings(String s) {
        int[] last = new int[3];
        Arrays.fill(last,-1);
        int ans=0;
        for(int i=0;i<s.length();i++){
            last[s.charAt(i) - 'a'] = i;
            int minLast = Math.min(last[0],Math.min(last[1],last[2]));
            if(minLast!=-1){
                ans+=(minLast+1);
            }
        }
        return ans;
    }
}