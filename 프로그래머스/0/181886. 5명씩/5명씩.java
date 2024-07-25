class Solution {
    public String[] solution(String[] names) {
        int count = 0;
        for(int i = 0; i<names.length; i++){
            if(i % 5 == 0){
                count++;
            }
          }
        String[] answer = new String[count];
         int j = 0;
        for(int i = 0; i < names.length; i++){
            answer[0] = names[0];
            if(i % 5 == 0){
                answer[j++] = names[i];
            }
        }
        return answer;
    }
}