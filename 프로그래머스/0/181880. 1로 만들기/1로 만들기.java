class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i =0; i<num_list.length; i++){
            int j = num_list[i];
            while(j > 1){
                j /= 2;
                answer++;
            }
        }
        return answer;
    }
}