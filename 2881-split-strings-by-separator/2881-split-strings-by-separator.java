import java.util.*;
import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        for(String word : words){
            String[] str = word.split(Pattern.quote(String.valueOf(separator)));
            for(String st : str){
                if(!st.isEmpty()){

                list.add(st);
                }
            }
        }
        return list;
    }
}