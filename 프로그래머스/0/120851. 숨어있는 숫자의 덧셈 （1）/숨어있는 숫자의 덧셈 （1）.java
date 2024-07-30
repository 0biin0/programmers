class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str ="";
        int count = 0;
        for(int i =0; i<my_string.length(); i++){
            if(!(my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'z')){
                
                answer += my_string.charAt(i)-48;
            }
        }
        /*
        for(int i =0; i<str.length; i++){
            answer += Integer.parseInt(str[i]);
        }
        */
        
        return answer;
    }
}