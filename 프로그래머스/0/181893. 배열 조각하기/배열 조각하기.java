import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        
        for(int i = 0; i<query.length; i++){
            int size = list.size()-1;
            if(i % 2 == 0){
                for(int j = query[i]; j< size; j++){
                    list.remove(list.size()-1);
                    
                }
                
            }else{
                for(int j = query[i] ; j>0; j--){
                   list.remove(0);
                    
                }
            }
        }
        int answer[] = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i);    
        }
        return answer;
    }
}
