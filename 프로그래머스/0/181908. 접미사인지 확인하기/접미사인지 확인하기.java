class Solution {
    public int solution(String my_string, String is_suffix) {

        return my_string.endsWith(is_suffix) ? 1 : 0 ;
        
    }

}

/*
it answer = 0;
        for(int i = 0; i<my_string.length(); i++){
             if(is_suffix.equals(my_string.substring(i , my_string.length()))) {
                 return 1;
             } 
        }
        return answer;
*/