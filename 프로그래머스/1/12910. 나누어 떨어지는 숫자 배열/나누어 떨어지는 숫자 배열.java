import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
            
        }
        if(list.size() == 0){
           list.add(-1);
        }
        int count = 0;
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            if(list.size() > 0){
                answer[count++] = list.get(i);    
            }
        }
        
      
        return answer;
    }
}