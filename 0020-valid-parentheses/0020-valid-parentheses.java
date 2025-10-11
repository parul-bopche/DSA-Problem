class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ss = s.charAt(i);
            if(ss=='(' || ss=='{' || ss=='['){
                st.push(ss);
            }else{
                if(st.isEmpty()) return false;
                char ch = st.peek();
                if((ss==')' && ch=='(')||(ss=='}' && ch=='{')||(ss==']' && ch=='[')){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.empty();
    }
}