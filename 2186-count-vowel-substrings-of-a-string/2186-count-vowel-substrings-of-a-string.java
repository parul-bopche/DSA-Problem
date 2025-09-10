class Solution {
    public int countVowelSubstrings(String word) {
     int n = word.length();
     int cnt =0;
     for(int i=0;i<n;i++){
        if(!isVowel(word.charAt(i))) continue; //isse direct next i me jump ..kyuki ye i     ka nhi rhega kuch substring
        HashSet<Character> set = new HashSet<>();
        for(int j=i;j<n;j++){
            char ch = word.charAt(j);
            if(!isVowel(ch)) break;
            set.add(ch);
            if(set.size()==5) cnt++;
        }
     }
     return cnt;
    }
    private boolean isVowel(char c){
      return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}