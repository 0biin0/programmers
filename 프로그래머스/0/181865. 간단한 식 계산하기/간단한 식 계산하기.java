class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String ans[] = binomial.split(" ");
        
        int a = Integer.parseInt(ans[0]);
        int b = Integer.parseInt(ans[2]);
        if(ans[1].equals("+"))
            answer = a + b;
        else if(ans[1].equals("-"))
            answer = a - b;
        else if(ans[1].equals("*"))
            answer = a * b;
        
        return answer;
    }
}
// " "!!!!