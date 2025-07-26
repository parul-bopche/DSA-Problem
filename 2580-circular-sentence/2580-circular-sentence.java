class Solution {
    public boolean isCircularSentence(String sentence) {
        
    String[] sen = sentence.split("\\s+");
    for(int i=0;i<sen.length-1;i++){
        
       
            String str = sen[i];
            String str2 = sen[i+1];
            if((str.charAt(str.length()-1))!=str2.charAt(0)){
                return false;
            }

        
    }
     String first = sen[0];
        String last = sen[sen.length - 1];

        return last.charAt(last.length() - 1) == first.charAt(0);
    }
}