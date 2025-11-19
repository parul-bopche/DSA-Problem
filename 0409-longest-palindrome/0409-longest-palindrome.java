class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character,Integer> map = new HashMap<>(); 
       int n= s.length();
       for(int i=0;i<n;i++){
        char ch = s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       int count=0;
       boolean isOdd =false;
       for(Integer v :map.values() ){
        if(v%2==0){
            count =count +v;
        }else{
            count+= v-1;
            isOdd =true;
        }
       }
       if(isOdd) count++;
       return count;
    }
}