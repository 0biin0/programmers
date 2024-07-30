class Solution {
    public int solution(int n) {
        int answer = 0;
        String st = Integer.toString(n);
        String[] str = st.split("");
        for(int i = 0; i<str.length; i++){
            answer += Integer.parseInt(str[i]);
        }
        return answer;
    }
}