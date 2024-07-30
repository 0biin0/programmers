class Solution {
    public int solution(String message) {
        int answer = 0;
        String[] ans = message.split("");
        answer = ans.length*2;
        return answer;
    }
}