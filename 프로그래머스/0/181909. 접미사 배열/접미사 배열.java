import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length(); 
        String sub[] = new String[len];
        for(int i =0; i<len; i++){
            sub[i] = my_string.substring(i);
        } 
        Arrays.sort(sub);
        
        return sub;
        
    }
}