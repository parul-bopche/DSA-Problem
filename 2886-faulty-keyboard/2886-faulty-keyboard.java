class Solution {
    public String finalString(String s) {
        String sb = "";
         for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'i'){
               sb = reverse(sb);
            }else{
                sb = sb + ch;
            }
           }
           return sb;

    }
    public String reverse(String st){
         StringBuilder reversed = new StringBuilder();
    for (int i = st.length() - 1; i >= 0; i--) {
        reversed.append(st.charAt(i));
    }
    return reversed.toString();
    }
}