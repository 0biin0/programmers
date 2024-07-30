class Solution {
    public int solution(int order) {
        int answer = 0;
        String ans = Integer.toString(order);
        for(int i=0; i<ans.length(); i++){
            char c = ans.charAt(i);
            if(c == '3' || c=='6' || c=='9'){
                answer++;
            }
        }
        return answer;
    }
}