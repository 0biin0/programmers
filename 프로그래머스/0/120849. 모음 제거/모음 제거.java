class Solution {
    public String solution(String my_string) {
        // 모음 배열을 정의합니다.
        String vowels = "aeiou";
        // StringBuilder를 사용하여 결과 문자열을 만듭니다.
        StringBuilder answer = new StringBuilder();
        
        // 문자열의 각 문자에 대해 반복합니다.
        for(int i = 0; i < my_string.length(); i++) {
            // 현재 문자가 모음인지 확인합니다.
            if(vowels.indexOf(my_string.charAt(i)) == -1) {
                // 문자가 모음이 아닌 경우 결과 문자열에 추가합니다.
                answer.append(my_string.charAt(i));
            }
        }
        
        // StringBuilder를 문자열로 변환하여 반환합니다.
        return answer.toString();
    }
}
