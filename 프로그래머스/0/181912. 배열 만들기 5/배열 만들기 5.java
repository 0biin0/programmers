import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
      //  int[] ans = new int[intStrs.length];
        //String[] arr = new String[intStrs.length];
        ArrayList<Integer> list  = new ArrayList<Integer>();
        for(int i = 0; i<intStrs.length; i++){
            String str = intStrs[i].substring(s,s+l);
            if(Integer.parseInt(str)>k){
                list.add(Integer.parseInt(str));
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = list.get(i); 
        }
        
        
        return answer;
    }
}