class Solution {
    public String solution(String my_string) {
       
        
        return new StringBuffer(my_string).reverse().toString();
    }
}
/*
for(int i = my_string.length() -1; i >= 0; i--){
            answer += my_string.charAt(i);
        }
*/