class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int[] mystr = new int[my_string.length()];
        for(int i = 0; i<indices.length; i++){
            mystr[indices[i]] = 1;
        }
        for(int i = 0; i<mystr.length; i++){
            if(mystr[i] == 0){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}