import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>(); 
        for(int i = 0; i<arr.length; i++){
            list.add(arr[i]);
        }
        for(int i = 0; i < delete_list.length; i++){
            for(int j =0; j<list.size(); j++){
                if(delete_list[i] == list.get(j)){
                    list.remove(j);
                }
            }
        }
        int answer[] = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
            //두 배열의 크기가 다르면 i 사용 못하고 int 변수 선언해서 사용해주기
        }
    
        return answer;
    }
}