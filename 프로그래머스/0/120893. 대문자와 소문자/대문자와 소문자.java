class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ans = my_string.toCharArray(); // 수정된 부분
        for(int i = 0; i < ans.length; i++){
            if(ans[i] >= 'a' && ans[i] <= 'z'){
                answer += Character.toUpperCase(ans[i]);
            } else {
                answer += Character.toLowerCase(ans[i]);
            }
        }
        return answer;
    }
}
//toCharArray() => String 문자열을 char형 배열로 바꿔서 반환해주는 메서드