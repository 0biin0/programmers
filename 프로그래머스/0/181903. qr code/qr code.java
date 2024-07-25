import java.util.*;
class Solution {
    public String solution(int q, int r, String code) {
        String[] arr = code.split("");
        String ans ="";
        for(int i = 0 ; i<arr.length; i++){
            if(i % q == r){
                ans += arr[i];
            }
            
        }
        
        return ans;
    }
}
